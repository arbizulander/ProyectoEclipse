package Eva1;

import java.io.*;
public class EjemploFiltro{
	public static void main(String[] args){
		String nombreArchivo = "C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\prueba.txt";
		FileReader fr;
		BufferedReader filtro;
		String linea;
		try{
			fr = new FileReader(nombreArchivo);
			filtro = new BufferedReader(fr);
			linea = filtro.readLine();
			while(linea != null){
				System.out.println(linea);
				linea = filtro.readLine();
			}
			filtro.close();
			fr.close();
		}
		catch(IOException e){
			System.out.println("No se puede abrir el archivo para lectura");
		}
	}
}

