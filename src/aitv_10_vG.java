import java.util.Scanner;

public class aitv_10_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a distância total percorrida em kM: ");
        int km = sc.nextInt();
        System.out.print("Insira o total de combustível gasto em L: ");
        int gas = sc.nextInt();

        int conM = km / gas;

        System.out.println("Consumo médio: " + conM);

    }
}
