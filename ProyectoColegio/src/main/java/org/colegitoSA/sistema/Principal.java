
package org.colegitoSA.sistema;

import java.util.Scanner;
import org.colegitoSA.dao.AlumnoJpaController;
import org.colegitoSA.dominio.Alumno;


public class Principal {
    private static Scanner sc = new Scanner(System.in);
        private static Scanner salumno = new Scanner(System.in);
        private static Alumno A;
        private static AlumnoJpaController alumnoDao = new AlumnoJpaController();
        private static int op, id;
        
        public static void main (String [] args){
            System.out.println("--------------------------------------------");
            System.out.println("-------------------Menu---------------------");
            System.out.println("--------------------------------------------");
            System.out.println("------------1. Mostrar Alumno---------------");
            System.out.println("------------2. Agregar Alumno---------------");
            System.out.println("-------3. Actualizar Datos del Alumno-------");
            System.out.println("-------4. Eliminar Datos de un Alumno-------");
            System.out.println("------------5. Listar Alumnos---------------");
            System.out.println("--------------------------------------------");
            System.out.println("--------Por favor Ingrese una opción--------");
            System.out.println("--------------------------------------------");               
        }
        
        public static Alumno obtenerAlumno(){
	System.out.println("Ingrese el código del Alumno");
	id= sc.nextInt();
	A = alumnoDao.buscarAlumno(id);
        return A;
        }

        private static Alumno getAlumno(){
            System.out.println("Ingrese x atributos");
            Alumno A =  new Alumno(sc.nextInt(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), sc.nextInt());
            return A;
}
        
}
