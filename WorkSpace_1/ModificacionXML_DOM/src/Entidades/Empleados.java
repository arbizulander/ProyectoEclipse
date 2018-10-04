package Entidades;

import java.util.Scanner;

public class Empleados {
	private int id;
	private String Apellido;
	private String Depart;
	private double Sueldo;
		
	//dar valores a los atributos
	public Empleados (){
		id=0;
		Apellido="";
		Depart="";
		Sueldo=0.0;
	}
	
	public Empleados (int id, String ape, String dep, double suel) {
		setId(id);
		setApellido(ape);
		setDepart(dep);
		setSueldo(suel);
	}
	
	public Empleados (String ape, String dep, double suel) {
		setApellido(ape);
		setDepart(dep);
		setSueldo(suel);
	}
	
	public void leer_datos_Empleado(Scanner teclado) {
		System.out.print("\tIntroduce el ID:");
		this.id=teclado.nextInt();
		System.out.print("\tIntroduce el Apellido:");
		this.Apellido=teclado.next();
		System.out.print("\tIntroduce el Departamento:");
		this.Depart=teclado.next();
		System.out.print("\tIntroduce el sueldo:");
		this.Sueldo=teclado.nextDouble();
	}
	
	//para copiar valores en otro objeto
	public Empleados (Empleados e) {
			
		this.id = e.id;
		this.Apellido = e.Apellido;
		this.Depart = e.Depart;
		this.Sueldo = e.Sueldo;
	}
		
		
	
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", Apellido=" + Apellido + ", Depart=" + Depart + ", Sueldo=" + Sueldo + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDepart() {
		return Depart;
	}
	public void setDepart(String depart) {
		Depart = depart;
	}
	public double getSueldo() {
		return Sueldo;
	}
	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}	
}
