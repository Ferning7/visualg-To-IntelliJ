import java.util.Scanner;

public class ativ_13_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nome = sc.next();

        System.out.println("Insira 3 notas obtidas no semestre: ");
        byte n1, n2, n3;
        n1 = sc.nextByte();
        n2 = sc.nextByte();
        n3 = sc.nextByte();

        double media = (double) (n1 + n2 + n3) / 3;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média de notas: " + media);
        System.out.println(" ");

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media <= 5) {
            System.out.println("Aluno reprovado");
        } else if (media >= 5.1) {
            System.out.println("Aluno em recuperação");
        } else if (media <= 6.9) {
            System.out.println("Aluno em recuperação");
        }


    }
}
