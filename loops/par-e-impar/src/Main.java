import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumbers;
        int number;
        int quantPairs =0, quantOdd = 0;

        System.out.println("Quantidade de números: ");
        quantNumbers = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            number = scan.nextInt();

        if(number % 2== 0) quantPairs++;
        else quantOdd++;

        count ++;
        }while (count < quantNumbers);

        System.out.println("Quantidade de Pares: " + quantPairs);
        System.out.println("Quantidade de Ímpares: " + quantOdd);



    }
}