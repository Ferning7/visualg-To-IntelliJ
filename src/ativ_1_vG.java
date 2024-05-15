import java.util.Scanner;

public class ativ_1_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 4 números inteiros: ");
        int n1, n2, n3, n4;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;

        System.out.println("Soma dos números: " + soma);

    }
}
