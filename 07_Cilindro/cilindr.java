import java.util.Scanner;
class cilindr{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int propu, Vol = 1;
        int are = 2;
        double r, h, are1, are2, area, volumen, r1, pi=3.1416;
        System.out.println("Cuanto vale el radio: ");
        r = entrada.nextInt();
        System.out.println("Cuanto vale la altura: ");
        h = entrada.nextInt();
        System.out.println("Presiona 1 si deseas calcular el volumen o presiona 2 si deseas calcular el area del cilindro");
        propu = entrada.nextInt();
        if (propu == Vol)
        {
            r1 = Math.pow(r, 2);
            volumen = (pi*r1*h);
            System.out.println("El volumen de el cilindro es: " + volumen+"m^3");
        }else
        {
            if (propu == are)
            {
                r1 = Math.pow(r, 2);
                are1 = (2*pi*h);
                are2 = (2*pi*r1);
                area = (are1 + are2);
                System.out.println("El area de el cilindro es: " + area+"m^3");
            }else
            {
                System.out.println("Su respuesta es invalida");
            }
        }

    }
}