import java.util.Scanner;

public class ativ_8_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira aqui o seu peso: ");
        Double peso = sc.nextDouble();

        Double peso15, peso20;
        peso15 = peso + (peso * 15 / 100);
        peso20 = peso - (peso * 20 / 100);

        System.out.println("Seu peso se aumentar 15%: " + peso15);
        System.out.println("Seu peso se diminuir 20%:" + peso20);
    }
}