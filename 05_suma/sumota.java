import java.util.Scanner;
class sumota{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int Num, suma=0;

        System.out.println("introduce el digito de sumatoria que no sea menor a 0");
        Num = entrada.nextInt();

        if (Num > 0)
        {
            for (int i=1; i<=Num; i++){
                suma=suma + i;
            } 
            System.out.println("El resultado de la sumatoria es: "+ suma);
        }
        else 
        {
            System.out.println("El valor es menor a 0");
        }
    }
        
}
    
               