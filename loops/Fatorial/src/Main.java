import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        int multiplicacao =1;

        System.out.println(numero + "!=");


        for(int i = numero; i> 0; i--){
            multiplicacao  *= i;

            if(i != 1){
                System.out.println(i + ".");
            }else {
                System.out.println(i + "=" + (multiplicacao));
            }
        }

    }
}