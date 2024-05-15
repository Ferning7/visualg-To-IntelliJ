import java.util.Scanner;

public class ativ_5_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = sc.next();

        System.out.println("Insira sua idade: ");
        byte idade = sc.nextByte();

        System.out.println("Seu nome é: "+ nome );
        System.out.println("Você tem "+ idade + " anos." );

    }
}
