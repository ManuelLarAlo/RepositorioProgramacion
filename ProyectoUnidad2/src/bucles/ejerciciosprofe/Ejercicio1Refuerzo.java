package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio1Refuerzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreAlumnoMax ="", nombreAlumnoMin="", nombreAlumno="";
		String curso="";
		int maxNota=0, minNota=10,notaAlumno; //maximo minimos
		int sumaNotas=0;//acumulador
		int numAlumnos=0; //contador
		double media=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el curso");
		
		curso = sc.nextLine();
		
		System.out.println("Introduzca el nombre del alumno");
		
		nombreAlumno = sc.nextLine();
		

		System.out.println("Introduzca la nota del alumno");
		
		notaAlumno = sc.nextInt();

		
		while (!nombreAlumno.equals("fin")) {
			
			numAlumnos++;
			
			sumaNotas+=notaAlumno;
			
			if (notaAlumno>=maxNota) {
				maxNota=notaAlumno;
				nombreAlumnoMax= nombreAlumno;
			}

			
			if (notaAlumno<=minNota) {
				minNota=notaAlumno;
				nombreAlumnoMin= nombreAlumno;
			}
			
			System.out.println("Introduzca el nombre del alumno");
			
			nombreAlumno = sc.next();
			
			if (nombreAlumno.equals("fin"))
				break;


			System.out.println("Introduzca la nota del alumno");
			
			notaAlumno = sc.nextInt();
			
			
		
			
		}
		
		if (numAlumnos>0) {
			
			System.out.println("Curso " + curso);
			System.out.println("Alumno con máxima nota: "+ nombreAlumnoMax + " Nota: " +maxNota);
			System.out.println("Alumno con mínima nota: "+ nombreAlumnoMin + " Nota: " +minNota);
			System.out.println("Media de notas:" + (double) sumaNotas/numAlumnos); 
			
		}

	}

}
