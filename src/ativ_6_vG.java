import java.util.Scanner;

public class ativ_6_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 2 números: ");
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 < 0) {
            System.out.println("número inválido");
        }
        else if (n2 < 0) {
            System.out.println("número invalido");
        }

        System.out.println(n1 + "^" + n2 + ": " + (Math.pow(n1, n2)));
    }
}
