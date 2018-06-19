import java.util.Scanner;

public class PositivoENegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Número Positivo");
        }
        else
            System.out.println("Número Negativo");
    }
}