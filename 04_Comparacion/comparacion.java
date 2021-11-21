import java.util.Scanner;

class comparacion{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("introduce el primer valor: ");
        num1 = entrada.nextInt();
        System.out.println("introduce el segundo valor: ");
        num2 = entrada.nextInt();
        System.out.println("introduce el tercer valor: ");
        num3 = entrada.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3)
        {
        System.out.println("Se encuentran numeros repetidos");
        }
        else
        {
            if (num1>num2 && num1>num3)
            {
            System.out.println("el numero " + num1 + " es el mayor");
            }
            else
                {
                if (num2>num1 && num2>num3)
                {
                System.out.println("el numero " + num2 + " es el mayor");
                }
                else 
                {   
                    System.out.println("el numero " + num3 + " es el mayor");
                }
                }
        }
                
    }
}


   

    