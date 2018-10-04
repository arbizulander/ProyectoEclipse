package Eva1;

import java.io.*;
public class EjemploLecturaChar{
	public static void main(String[] args){
		FileReader fr = null;
		int aux = 0;
		try{
			fr = new
			FileReader("C:\\eclipse\\readme\\readme_eclipse.html");
			while((aux = fr.read()) != -1)
			System.out.println((char)aux);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				fr.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

