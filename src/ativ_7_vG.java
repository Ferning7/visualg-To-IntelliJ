import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ativ_7_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ano atual: ");
        int ano = sc.nextInt();
        System.out.println("Insira sua data de nascimento: ");
        int day, month, year;
        System.out.print("Dia: ");
        day = sc.nextInt();
        System.out.print("Mês: ");
        month = sc.nextInt();
        System.out.print("Ano: ");
        year = sc.nextInt();

        int age = ano - year;
        int age2 = 2050 - year;

        System.out.println(" ");
        System.out.println("Sua data de nascimento: " + day + "/" + month + "/" + year);
        System.out.println("Sua idade: " + age);
        System.out.println("Sua idade em 2050: " + age2);
    }
}
