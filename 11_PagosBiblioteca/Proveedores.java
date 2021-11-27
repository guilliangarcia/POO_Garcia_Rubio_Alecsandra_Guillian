/ *
class libro con los libros que tu quieras
* /
importar  java.util. * ;
// importar java.swing. *;
import  java.lang.Math ;
import  javax.swing.JOptionPane ;

 clase  pública Proveedores  amplía  Libros {
    private  String nombre_cliente;
    Private  String producto [] =  new  String [ 10 ];
     int privado costo [] =  nuevo  int [ 10 ];
    privado  int producto_existente [] =  nuevo  int [ 10 ];
    int sumatotal;
    Entrada del escáner =  nuevo  escáner ( System . In);
    // menú
     menuproveedores public void  () {
        Texto de cadena ;
        int opcion = 0 ;
        prueba {
            // es para ingresar texto
            texto =  JOptionPane . showInputDialog ( " Seleccione la función deseada "
                                            +  " \ n 1.-Suma total de costos "
                                            +  " \ n 2.-Costo mayor "
                                            +  " \ n 3.-Costo menor "
                                            +  " \ n 4.-Costo promedio "
                                            +  " \ n 5.-Costo total del producto " );
                    // cuando se utiliza JOptionPane solo se reciben cadenas
                    // voy a convertir esa cadena en un entero
                    opcion =  Entero . parseInt (texto);

        } captura ( Excepción e) {
            JOptionPane . showMessageDialog ( null , " Para acceder a un programa solo se puede ingresar los números del 1 al 3 " );
            // vamos a obtener el error, es visible para el usuario
            JOptionPane . showMessageDialog ( nulo , " Efe " + e . getMessage ());
            // si solo queremos imprimir el error en consola
            Sistema . fuera . println ( " El error es: efe "  + e . getMessage ());

        }
        hacer {
        cambiar (opcion) {
            caso  1 :
                sumatotal ();
                romper ;
            caso  2 :
                costomayor ();
                romper ;
            caso  3 :
                costomenor ();
                romper ;
            caso  4 :
                costopromedio ();
                romper ;
            caso  5 :
                costototal ();
                romper ;
            por defecto :
                Sistema . fuera . print ( " Opcion no disponible, adios. " );
            romper ;
        }
        } while (opcion > 5 );
    }
    
    public  void  sumatotal () {
        // libro uno + libro dos
        Texto de cadena ;
        int sumat;
        Librouno cost =  new  Librouno ( " La Cumbre Escarlata " , " Nancy Holder " , " 12345-B " , " Terror, Ficcion gotica, Literatura fantástica. " , 5 , 500 );
        costo . mostrarLibrouno ();
        Librodos coste =  new  Librodos ( " Los pasos de López " , " Jorge Ibarguengoitia " , " 12345-A " , " Ficcion " , 6 , 200 );
        coste . mostrarLibrodos ();

        sumat = 200 + 500 ;
        texto =  JOptionPane . showInputDialog ( " La información de los libros se ha mostrado en consola. \ n La suma del costo de los libros para la biblioteca es de: \ n Enter para continuar. "  + sumat);
        // Librodos coste = new Librodos ("Los pasos de Lopez", "Jorge Ibarguengoitia", "12345-A", "Ficcion", 6, 200);
        // coste.mostrarLibrodos ();
    }
    public  void  costomayor () {
        Texto de cadena ;
        texto =  JOptionPane . showInputDialog ( " El Libro con mayor precio se muestra en consola: \ n Enter para continuar " );
        Sistema . fuera . println ( " Costo Mayor " );
        Librouno cost =  new  Librouno ( " La Cumbre Escarlata " , " Nancy Holder " , " 12345-B " , " Terror, Ficcion gotica, Literatura fantástica. " , 5 , 500 );
        costo . mostrarLibrouno ();
    }
     costomenor vacío  público () {
        Texto de cadena ;
        texto =  JOptionPane . showInputDialog ( " El libro con menor precio se muestra en consola: \ n Enter para continuar. " );
        Sistema . fuera . println ( " Costo Menor \ n " );
        Librodos coste =  new  Librodos ( " Los pasos de López " , " Jorge Ibarguengoitia " , " 12345-A " , " Ficcion " , 6 , 200 );
        coste . mostrarLibrodos ();
        
    }
     costopromedio vacío  público () {
        Texto de cadena ;
        int prom = ( 500 + 200 ) / 2 ;
        texto = JOptionPane . showInputDialog ( " El costo promedio de los libros es: "  + prom +  " \ n Enter para continuar. " );
    }
    public  void  costototal () {
        Texto de cadena ;
        int costoTotal = ( 5 * 100 ) + ( 6 * 200 );
        texto =  JOptionPane . showInputDialog ( " El costo total de todos los lobros y ejemplares es de: "  + costoTotal +  " \ n Enter para continuar. " );
        Sistema . fuera . println ( " Estos son todos los libros disponibles: \ n " );
        Librouno cost =  new  Librouno ( " La Cumbre Escarlata " , " Nancy Holder " , " 12345-B " , " Terror, Ficcion gotica, Literatura fantástica. " , 5 , 500 );
        costo . mostrarLibrouno ();
        Librodos coste =  new  Librodos ( " Los pasos de López " , " Jorge Ibarguengoitia " , " 12345-A " , " Ficcion " , 6 , 200 );
        coste . mostrarLibrodos ();
    }

}