import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numeros = new int[20];

        for(int i=0; i< numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Numeros: ");

        for(int numero : numeros ){
            System.out.println(numero +"");
        }

        System.out.println("\n--------------");

        System.out.println("Sucessores: ");
        for(int numero : numeros){
            System.out.println((numero + 1)+ "");
        }

    }
}