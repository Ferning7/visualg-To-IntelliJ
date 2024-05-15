import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ativ_3_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu salário: R$");
        Double salIni;
        salIni = sc.nextDouble();

        Double calc = (salIni * 25) / 100;
        Double salFin = calc + salIni;
        System.out.println(" ");
        System.out.println("Salário atual: "+ salIni);
        System.out.println("Salário com 25% de aumento: "+ salFin);

    }
}
