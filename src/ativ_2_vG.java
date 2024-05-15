import java.util.Scanner;
public class ativ_2_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 3 notas: ");
        int n1, n2, n3, n4;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        int media = (n1 + n2 + n3) / 2;

        System.out.println("Soma dos números: " + media);
    }
}
