package Eva1;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


public class XML_DOM {
	static Document doc = null; // doc es de tipo Document y representa al árbol DOM
	static File archivo = new File ("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\XML\\Books.xml");
	
	public static void main(String[] args) {
		try {
			
			abrir_XML_DOM(archivo);
					
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int abrir_XML_DOM(File fichero){
		try{
			//Se crea un objeto DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			//Indica que el modelo DOM no debe contemplar los comentarios que tenga el XML
			factory.setIgnoringComments(true);
	
			//Ignora los espacios en blanco que tenga el documento factory.setIgnoringElementContentWhitespace(true);
			//Se crea un objeto DocumentBuilder para cargar en él la estructura del árbol DOM a partir del XML seleccionado
	
			DocumentBuilder builder = factory.newDocumentBuilder();
	
			//Interpreta (parsea) el documento XML (file) y genera el DOM equivalente
	
			doc = (Document) builder.parse(fichero);
	
			//Ahora doc apunta al árbol DOM listo para ser recorrido
			 String titulo = "Este es el titulo";
			 String Autor = "Este es el autor";
			 String anno = "2222";
			annadirDOM(doc,titulo,Autor,anno);
			
			String prueba = recorrerDOMyMostrar (doc);
			System.out.println(prueba);
			guardarDOMcomoFILE();
			return 0;
		}
		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	
	public static String recorrerDOMyMostrar(Document doc){ 
		String datos_nodo[] = null;
		String salida = "";

		org.w3c.dom.Node node;

		//Obtiene el primer nodo del DOM (primer hijo) 
		org.w3c.dom.Node raiz = doc.getFirstChild();
		
		//Obtiene una lsita de nodos con todos los nodos hijo del raíz 
		NodeList nodeList = raiz.getChildNodes();
		
		//Procesa los nodos hijo
		for (int i = 0; i < nodeList.getLength(); i++){ 
			node = nodeList.item(i);
	
			if (node.getNodeType() == Node.ELEMENT_NODE){ // Es un nodo libro
				datos_nodo = procesarLibro(node);
			
				salida = salida + "\n " + "Publicado en: " +
				datos_nodo[0];
			
				salida = salida + "\n " + "El autor es: " + datos_nodo[2];
			
				salida = salida + "\n " + "El título es: " +
				datos_nodo[1];
			
				salida = salida + "\n --------------------";
			}
		}
		return salida;
	}
	
	
	protected static String[] procesarLibro(org.w3c.dom.Node node){

		String datos[] = new String[3];

		org.w3c.dom.Node ntemp = null;
		int contador = 1;

		//Obtiene el valor del primer atributo del nodo (solo uno en este ejemplo)
		datos[0] = node.getAttributes().item(0).getNodeValue();

		//Obtiene los hijos del Libro (título y autor)
		NodeList nodos = node.getChildNodes();

		for (int i = 0; i <nodos.getLength(); i++){ 
			ntemp = nodos.item(i);

			if(ntemp.getNodeType() == Node.ELEMENT_NODE){

			/* Importante: para obtener el texto con el título y autor se accede al nodo TEXT hijo de ntemp y se saca su valor */
			datos[contador] = ntemp.getChildNodes().item(0).getNodeValue(); contador++;
			}
		}
		return datos;
	}
	
	
	
	public static int annadirDOM(Document doc, String titulo, String autor, String anno){
		try{
			//Se crea un nodo tipo Element con nombre 'titulo' (<Titulo>)
			Element ntitulo = doc.createElement("Titulo");
			//Se crea un nodo tipo texto con el títlo del libro
			Text ntitulo_text = doc.createTextNode(titulo);

			//Se añade el nodo de texto con el título como hijo del elemento Titulo 
			ntitulo.appendChild(ntitulo_text);

			//Se hace lo mismo que con titulo a autor (<Autor>) 
			Element nautor = doc.createElement("Autor");
			Text nautor_text = doc.createTextNode(autor);
			nautor.appendChild(nautor_text);

			//Se crea un nodo de tipo elemento (<libro>)
			Element nlibro = doc.createElement("Libro");

			//Al nuevo nodo libro se le añade un atributo publicado_en 
			((Element)nlibro).setAttribute("publicado_en", anno);
			//Se añade a libro el nodo autor y titulo creados antes 
			nlibro.appendChild(ntitulo); nlibro.appendChild(nautor);
			
			/* Finalmente, se obtiene el primer nodo del documento y a él se le
			añade como hijo el nodo libro que ya tiene colgando todos sus hijos y atributos creados antes. */
			org.w3c.dom.Node raiz = doc.getChildNodes().item(0);
			raiz.appendChild(nlibro);
			return 0;
		}

		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	
	public static int guardarDOMcomoFILE(){
		try{

			//Crea un fichero llamado salida.xml 
			//File archivo_xml = new File("../XML/Books.xml");
			
			//Especifica el formato de salida 
			OutputFormat format = new OutputFormat(doc);
			
			//Especifica que la salida esté indentada 
			format.setIndenting(true);
			
			//Escribe el contenido en el  File
			XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo), format);
			serializer.serialize(doc);
			return 0;
		}
		catch(Exception e){
			return -1;
		}
	}
}
