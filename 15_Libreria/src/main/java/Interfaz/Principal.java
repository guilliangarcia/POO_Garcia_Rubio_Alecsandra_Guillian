package Interfaz;

/**
 *
 * @author Alecsandra
 */


import Controles.ManipularLibros;
import java.io.*;
import java.util.*;

public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu principal para poder manipula los datos de libros y 
        //de los demas documentos
        
        //instancia de manipular libros
        
        ManipularLibros listadelibrosobj = new ManipularLibros();
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la Biblioteca de Oscurantismo");
            System.out.println("Ingresa la opcion deseada");
            System.out.println("1.- Agregar nuevo Libro");
            System.out.println("2.- Consultar Libro");
            System.out.println("3.- Consulta todos los Libros");
            System.out.println("4.- Borrar un libro");
            System.out.println("5.- Modificar los datos de un libro");
            System.out.println("6.- Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    //agregar libro
                    listadelibrosobj.agregarLibro();
                    
                    break;
                    
                case 2:
                    //consultar libros por el id
                    listadelibrosobj.buscar();
                    break;
                    
                case 3:
                    //consulta de todos los libros
                    listadelibrosobj.consultaGeneral();
                    break;
                    
                case 4:
                    listadelibrosobj.borrar();
                    break;
                    
                case 5:
                    listadelibrosobj.modificar();
                    break;
                    
                case 6:
                    System.out.println("Adios gracias por su alma");
                    //cuando vamos a generar el archivo
                    listadelibrosobj.grabar();
                default:
                    System.out.println("Error ingrese una opcion valida");
            }
        }while((opcion >= 1)&&(opcion < 6));
    }
}