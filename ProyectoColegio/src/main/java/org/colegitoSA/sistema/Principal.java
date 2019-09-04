
package org.colegitoSA.sistema;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.colegitoSA.dao.AlumnoJpaController;
import org.colegitoSA.dao.exceptions.NonexistentEntityException;
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

            op =sc.nextInt();
        switch(op){
            case 1:
                A = obtenerAlumno();
                System.out.println(A);
                break;
            
            case 2:
                A = getAlumno();
            
                
                    if(alumnoDao.agregarAlumno(A)){
                        System.out.println("Se agrego al nuevo alumno con exito");
                    }else{
                        System.out.println("No se pudo agregar al nuevo alumno");
                    }
                
            
                break;
            
                
            case 3:
                A = obtenerAlumno();
                System.out.println("Ingresee los nombres, apellidos, telefono, codigo tecnico, codigo academico y edad nuevos");
                A = new Alumno(id, salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), sc.nextInt());
                try {
                    alumnoDao.editarAlumno(A);
                } catch (Exception ex) {
                    System.out.println("No se puede actualizar el registro");
                }
                
                break;
                
            case 4:
                A = obtenerAlumno();
                System.out.println("¿Está seguro de eliminar el siguiente alumno?");
                System.out.println(A);                      
                try {
                    alumnoDao.eliminarAlumno(id);
                    System.out.println("Registro eliminado exitosamente");
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se puede eliminar el registro");
                }
        
                break;
                
            case 5:
                List<Alumno> alumnos = alumnoDao.listarAlumnos();
                for(Iterator<Alumno> iterator = alumnos.iterator(); iterator.hasNext();){
                    Alumno next = iterator.next();
                    System.out.println(next);
                }
                    
                
                break;
                
            default:
                    System.out.println("No es una opción del menú");
        }
        }
        
        public static Alumno obtenerAlumno(){
	System.out.println("Ingrese el código del Alumno");
	id= sc.nextInt();
	A = alumnoDao.buscarAlumno(id);
        return A;
        }

        private static Alumno getAlumno(){
            System.out.println("Ingrese codigo, nombres, apellidos, número telefonico, código académico, código técnico y edad del alumno");
            Alumno A =  new Alumno(sc.nextInt(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), salumno.nextLine(), sc.nextInt());
            return A;
}
        
}
