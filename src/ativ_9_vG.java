import java.util.Scanner;

public class ativ_9_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 1 número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }
}
