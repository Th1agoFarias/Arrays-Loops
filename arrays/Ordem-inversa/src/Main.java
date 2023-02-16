public class Main {
    public static void main(String[] args) {

        int [] vector = {-5, -6, 15, 50, 8, 4};


        System.out.println("Vetor: ");

        int count = 0;
        while(count <(vector.length)){
            System.out.println(vector[count] + " ");
            count ++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vector.length -1); i>= 0; i--){
            System.out.println(vector[i] + " ");
        }
    }
}