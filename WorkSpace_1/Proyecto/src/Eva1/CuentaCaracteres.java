package Eva1;
import java.io.*;
	import java.util.Scanner;
	public class CuentaCaracteres{
		public static void main(String args[]) throws IOException{
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduzca una cadena: ");
			String teclado = sc.nextLine();
			System.out.println("Numero de caracteres: " + teclado.length());
			sc.close();
		}
	}

