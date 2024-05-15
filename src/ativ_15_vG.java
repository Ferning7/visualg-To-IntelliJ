import java.util.Scanner;
import static java.lang.Math.log;

public class ativ_15_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int num = sc.nextInt();
        int base = 2;
        double logaritmo = log(num) / log(base);
        System.out.println("O logaritmo é: "+ logaritmo);

    }
}
