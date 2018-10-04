package Eva1;

import java.io.*;
public class EjemploLecturaByte{
	public static void main(String[] args){
		FileInputStream fis = null;
		int aux = 0;
		try{
			fis = new
			FileInputStream("F:\\ionic\\prueba\\src\\index.html");
			while((aux = fis.read()) != -1)
			System.out.println(aux + " - " + (char)aux);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				fis.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

