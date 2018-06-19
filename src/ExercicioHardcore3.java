import java.util.Scanner;
public class ExercicioHardcore3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer entrada = scanner.nextInt();

        Double saldo = 1500.0;
        System.out.println(saldo);

        System.out.println("Menu");
        System.out.println("[1] - Pistolas");
        System.out.println("[2] - Metralhadoras");
        System.out.println("[3] - Rifles");
        System.out.println("[4} - Submetralhadoras");
        System.out.println("[5] - Arma Branca");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("[1] - Glock          $100");
                System.out.println("[2] - Desert Eagle   $150");
                System.out.println("[3} - Berreta        $200");
                break;
            case 2:
                System.out.println("[1] - M416           $350");
                System.out.println("[2] - AKM            $250");
                System.out.println("[3] - AUG            $500");
                break;
            case 3:
                System.out.println("[1] - AWM            $700");
                System.out.println("[2] - Kar98          $550");
                System.out.println("[3] - Winchester     $400");
                break;
            case 4:
                System.out.println("[1] - Ump            $200");
                System.out.println("[2] - Uzi            $100");
                System.out.println("[3] - Vector         $150");
                break;
            case 5:
                System.out.println("[1] - Faca           $50");
                System.out.println("[2] - Pé de cabra    $20");
                System.out.println("[3] - Espada         $100");
                break;

        }
    }
}