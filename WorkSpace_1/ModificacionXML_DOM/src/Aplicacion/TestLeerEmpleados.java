package Aplicacion;
import java.io.File;
import java.util.ArrayList;
//import java.util.Scanner;

import org.w3c.dom.Document;

import Entidades.Empleados;
import Persistence.EmpleadosPersistence;

public class TestLeerEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		//Scanner teclado = new Scanner( System.in );
		 Document doc = null; // doc es de tipo Document y representa al árbol DOM
		 
		 //C:\\Users\\ik_2dm3\\Documents\\MEGAsync\\Proyectos Java Eclipse\\WorkSpace_1\\ModificacionXML_DOM\\Empleados.xml
		File archivo = new File ("C:\\Users\\arbiz\\OneDrive\\Documentos\\MEGAsync\\2\\Proyectos Java Eclipse\\WorkSpace_1\\ModificacionXML_DOM\\Empleados.xml");
		ArrayList<Empleados> EmpleadosArrayList = new ArrayList<Empleados>();
		
		EmpleadosPersistence.abrir_XML_DOM(archivo, doc, EmpleadosArrayList);
	}

}
