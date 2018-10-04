package Eva1;

import java.io.*;

public class Operacionesarchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nombreArchivo = new File ("C:\\archivo.txt");
		//String nombreArchivo = "../../TXT/prueba.txt";
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea;
		try{
			archivo = new File ("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\prueba.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			while((linea=br.readLine())!=null){
	            System.out.println(linea);
	      	}
			
		br.close();
		fr.close();
		}
		catch(IOException e){
			System.out.println("No se puede abrir el archivo para lectura");
		}
	}
}
