public class Main {
    public static void main(String[] args) {
        int [] vetor= {5, 8, 9, 6, 11, -1};

        int count = (vetor.length -1);
        System.out.println("Vetor Inverso: ");

        while (count >=0){
            System.out.println( vetor[count] +"");
            count --;
        }

        System.out.println("\n--------------");

        System.out.println("Vetor: ");

        for (int elemnto : vetor){
            System.out.println( elemnto + "");
        }

    }
}