import java.util.Scanner;

public class ativ_11_vG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do vendedor: ");
        String nome = sc.next();
        System.out.print("Seu salário fixo: ");
        Double salFix = sc.nextDouble();
        System.out.print("Total de vendas efetuadas no mês. R$:");
        Double totalV = sc.nextDouble();

        Double salFin = totalV + (totalV * 15/100);

        System.out.println("Nome do vendedor: "+nome);
        System.out.println("Salário fixo R$ : "+salFix);
        System.out.println("Salário final com comissões: R$ "+salFin);

    }
}
