import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = scanner.nextInt();

        if (numero%2 == 0 ) {
            System.out.println("Par");
        }
        if (numero%2 == 1) {
            System.out.println("Impar");
        }
    }
}