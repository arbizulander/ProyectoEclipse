package Eva1;
import java.io.*;

public class Verinf {
	public static void main (String [] args) {
		System.out.println("INFORMACION SOBRE EL FICHERO");
		File f = new File ("src/Eva1/Verinf.java");
		if (f.exists()) {
			System.out.println("Nombre del fichero: " +f.getName());
			System.out.println("Ruta: " +f.getPath());
			System.out.println("Ruta absoluta: "+f.getAbsolutePath());
			System.out.println("se puede escribir: "+f.canRead());
			System.out.println("Se puede leer: "+ f.canWrite());
			System.out.println("Tamaño: "+ f.length());
			System.out.println("Es un directorio: "+f.isDirectory());
			System.out.println("Es un fichero: "+f.isFile());
		}
		else {	
			System.out.println("No existe.");
		}
	}
}
