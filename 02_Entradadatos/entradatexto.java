class entradatexto{
    
    //cuerpo del programa o de la clase
    
    public static void main(String[] args){
        
        //cuerpo del metodo principal

        /*
        vamos a realizar un programa el cual podemos introducir texto a nuestra conveniencia
        */
        //tipo de dato, nombre de la variable
        String nombre;

        System.out.println("Por favor introduce tu nombre: ");

        nombre = System.console().readLine();

        System.out.println("Hola, " + nombre + " Bienvenido a tu segundo programa");
    }

}        