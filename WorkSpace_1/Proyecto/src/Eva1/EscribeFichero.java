package Eva1;
import java.io.*;

public class EscribeFichero {
	public static void main (String [] args) {
	//Crea el String con la cadena XML
		String texto ="<Libros><Libro><Titulo>El Capote</Titulo></Libro></Libros>";
		//Guarda en nombre el nombre del archivo que se creará.
		String nombre = "XML/libros.xml";
		try{
			//Se crea un Nuevo objeto FileWriter
			FileWriter fichero = new FileWriter (nombre);
			//Se escribe el fichero
			fichero.write(texto +"\r\n");
			//Se cierra elfichero
			fichero.close();
		}
		catch (IOException ex) {
			System.out.println("Error al acceder al fichero");
		}
	}
}
