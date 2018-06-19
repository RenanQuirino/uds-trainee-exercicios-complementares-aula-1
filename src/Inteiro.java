import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Inteiro");
        }
        if (numero <= 0) {
            System.out.printf("Inteiro");
        }
        

        }
    }
}

