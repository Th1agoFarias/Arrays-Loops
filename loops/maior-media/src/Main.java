import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int bigger = 0;
        int sum = 0;

        int count= 0;
        do{
            System.out.println("Número: ");
            number = scan.nextInt();

            sum = sum + number;

            if(number > bigger) bigger = number;

            count = count +1;

        }while(count < 5);
        System.out.println("Maior: " + bigger);
        System.out.println("Média: " + (sum/5));



    }
}