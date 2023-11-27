package EjerciciosRepaso;

import java.util.Scanner;

public class EjerciciosRefuerzo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreAlumnoMax = "", nombreAlumnoMin ="", nombreAlumno =""; //Se generan dos variables String, una para registrar el maximo y otra para el minimo
		String curso ="";
		int maxNota = 0,minNota=10, notaAlumno;
		double media = 0.0; //Se declara una variable para la media que seria media = sum/numAlumnos
		int sumaNotas = 0;
		int numAlumnos = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
		
			System.out.println("Introduzca el curso: ");
			curso = sc.nextLine();
			
			System.out.println("Introduzca el nombre del alumno: ");
			nombreAlumno = sc.nextLine();
			
			nombreAlumnoMin = nombreAlumno;
			nombreAlumnoMax = nombreAlumno;
			
			System.out.println("Introduzca la nota del alumno: ");
			notaAlumno = sc.nextInt();
			
			maxNota = notaAlumno;
			minNota = notaAlumno;
				
			while (!nombreAlumno.equals("fin")) {
				
				numAlumnos++;
				sumaNotas+=notaAlumno;
				
				
				if (notaAlumno>=maxNota) {
					
					maxNota=notaAlumno;
					nombreAlumnoMax=nombreAlumno;
					
				}
				
				if (notaAlumno<=minNota) {
					
					minNota=notaAlumno;
					nombreAlumnoMin=nombreAlumno;
				}
				
				System.out.println("Introduzca el nombre del alumno: ");
				nombreAlumno = sc.next();
				
				
				System.out.println("Introduzca la nota del alumno: ");
				notaAlumno = sc.nextInt();
				
				
				}
			
				if (numAlumnos>0) {
					
					System.out.println("Curso: " + curso);
					System.out.println("Alumno con máxima nota: " + nombreAlumnoMax + "Nota: " + maxNota);
					System.out.println("Alumno con mínima nota: " + nombreAlumnoMin + "Nota: " + minNota);
					System.out.println("Media de las notas: " + (double) sumaNotas/numAlumnos);
				}
				
		
		}
				
			
		}

	}
