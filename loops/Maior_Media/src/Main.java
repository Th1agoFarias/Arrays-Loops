import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double  maior = 0;
        double  soma = 0;
        double  media;

       int count =0;

       do{
           System.out.println("Número: ");
           double numero = scan.nextDouble();

           if(numero > maior){
               maior = numero;
           }

           soma = soma + numero;

           count = count + 1;

       }while (count < 5);

       media = soma/ 5;


        System.out.println("Maior: " + maior + "-Média: " +media);
    }
}