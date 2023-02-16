import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6];
        int quantConsonants = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String word = scan.next();

            if (!(word.equalsIgnoreCase("a") |
                    word.equalsIgnoreCase("e") |
                    word.equalsIgnoreCase("i") |
                    word.equalsIgnoreCase("o") |
                    word.equalsIgnoreCase("u"))) {
                consonants[count] = word;
                quantConsonants++;
            }

            count++;

        }while (count<  consonants.length);

        System.out.println("Consoantes: ");
        for (String consonant : consonants){
            if(consonant != null)
                System.out.println(consonant + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantConsonants);
        System.out.println(consonants.length);
        }
}