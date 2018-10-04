package Eva1;

import java.io.*;
public class Copia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo_O = null;
		File archivo_D = null;
		FileInputStream origen = null;
		FileOutputStream destino = null;
		try{
			archivo_O = new File ("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\prueba.txt");
			archivo_D = new File ("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\pruebaD.txt");
			origen = new FileInputStream(archivo_O);
			destino = new FileOutputStream(archivo_D, true); // añadir
			int i = origen.read();
			while(i != -1){ // Mientras no EOF
				destino.write(i);
				i = origen.read();
			}
			origen.close();
			destino.close();
		}
		catch(IOException e){
			System.out.println("Error de ficheros");
		}
	}
}
