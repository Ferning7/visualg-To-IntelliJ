import java.util.Scanner;

public class ativ_12_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nome = sc.next();

        System.out.println("Insira as três notas obtidas no semestre: ");
        byte n1, n2, n3;
        n1 = sc.nextByte();
        n2 = sc.nextByte();
        n3 = sc.nextByte();

        double media = (double) (n1 + n2 + n3) / 3;

        if (n1 > 10){
            n1 = 10;
        } else if (n2 > 10){
            n2 = 10;
        } else if (n3 > 10) {
            n3 = 10;
        }

        if (media >= 7) {
            System.out.println("o aluno '" + nome + "' aprovado ");
        } else if (media < 7) {
            System.out.println("Aluno '" + nome + "' reprovado");
        }
        sc.close();

    }
}
