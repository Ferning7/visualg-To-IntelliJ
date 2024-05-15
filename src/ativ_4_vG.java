import java.util.Scanner;

public class ativ_4_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a altura do triângulo: ");
        Double alt = sc.nextDouble();

        System.out.println("Insira a base do triângulo: ");
        Double base = sc.nextDouble();

        Double area = (base * alt) / 2;

        System.out.println("Área do triângulo: " + area);
    }
}
