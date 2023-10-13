package clases;
import java.util.ArrayList;
import clases.*;


public class ArregloAlumno {
	
	//Propiedad ----> ArrayList 
	
	//Como ejemplo
	private ArrayList<Alumno> alumnos;
	
	//Constructor 
	public ArregloAlumno(){
		alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno(202223713,"Cesar",15,20));
		alumnos.add(new Alumno(202223235,"Tito",15,12));
		alumnos.add(new Alumno(202223346, "Franco",13,15));
		alumnos.add(new Alumno(202223765,"Albertito",17,16));
		alumnos.add(new Alumno(202223346,"Rigobertito",15,12));
	}
	
	public int tamanio(){
		return alumnos.size();
	}
	
	public Alumno obtener(int i){
		return alumnos.get(i);
	}
	
	
	
	
	public double calcularPromedioGeneral  (){
		double suma=0;
		for (int i = 0; i < alumnos.size(); i++) {
			suma+=alumnos.get(i).promedio();
		}
		return suma/alumnos.size();
	}
	
}
