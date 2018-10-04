package Eva1;

import java.io.*;
public class LectorFichero{
	public static void main(String[] args){
		byte[] buffer = new byte[80];
		try{
			FileInputStream fichero = new FileInputStream("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\prueba.txt");
			@SuppressWarnings("unused")
			int i = fichero.read(buffer);
			String s = new String(buffer);
			System.out.println(s);
			fichero.close();
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
