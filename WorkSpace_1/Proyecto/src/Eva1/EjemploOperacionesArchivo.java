package Eva1;

import java.io.*;
public class EjemploOperacionesArchivo {
	public static void main(String[] args) {
		// Creación de un fichero
		try{
			File file = new File("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\pruebaA.txt");
			boolean resultado = file.createNewFile();
			if (resultado)
				System.out.println("Archivo creado");
			else
				System.out.println("No se puede crear el archivo");
		}
		// Para su posible existencia este manejador de error
		catch(IOException e){
			System.out.println("Se produjo el error " + e.getMessage());
		}
		// Borrado de fichero
		try{
			File file = new File("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\pruebaA.txt");
			boolean resultado = file.delete();
			if (resultado)
				System.out.println("Archivo borrado");
			else
				System.out.println("No se pudo borar el archivo");
		}
		catch(Exception e){
			System.out.println("Se produjo el error " + e.getMessage());
		}
	}
}
