import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int valor =0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para criar uma tabela: ");
        valor = scan.nextInt();

        for(i =1; i<=10; i++){
            System.out.println(valor + "x" + i + "=" +(valor * i));

        }
    }
}
