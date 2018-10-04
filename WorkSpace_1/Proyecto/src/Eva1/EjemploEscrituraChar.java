package Eva1;

import java.io.*;
public class EjemploEscrituraChar{
	public static void main(String[] args){
		FileWriter fw = null;
		try{
			fw = new FileWriter("C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\WorkSpace_1\\Proyecto\\TXT\\prueba.txt");
			fw.write('A');
			fw.write('A');
			fw.write('j');
			fw.write('d');
			fw.write('S');
			fw.write('1');
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				fw.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
