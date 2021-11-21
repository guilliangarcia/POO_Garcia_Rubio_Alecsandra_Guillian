import java.util.Scanner;
class hipotenusa{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a, b, c, ab;
        System.out.println("introduce el cateto opuesto");
        a = entrada.nextInt();
        System.out.println("introduce el cateto adyacente");
        b = entrada.nextInt();
        a = Math.pow(a, 2);
        System.out.println("El cateto opuesto se eleva al cuadrado: " + a);
        b = Math.pow(b, 2);
        System.out.println("El cateto adyasente se eleva al cuadrado: " + b);
        ab = (a + b);
        System.out.println("Los dos catetos se suman: " + ab);
        c = Math.sqrt(ab);
        System.out.println("se saca raiz cuadrada: "+ c +" este es tu resultado");

    }
}