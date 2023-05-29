import java.util.Scanner;

public class Lista2exercicio04 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário atual: ");

        double salarioAtual = entrada_do_usuario.nextDouble();
        double ajuste = 0;
        double porcent = 0;

        if (salarioAtual <= 280){
            porcent = 20;
            ajuste = salarioAtual * 0.20;
        } else if (salarioAtual > 280 && salarioAtual <= 700){
            porcent = 15;
            ajuste = salarioAtual * 0.15;
        } else if (salarioAtual > 700 && salarioAtual <= 1500){
            porcent = 10;
            ajuste = salarioAtual * 0.10;
        } else {
            porcent = 5;
            ajuste = salarioAtual * 0.05;
        }

        double salarioReajuste = salarioAtual + ajuste;

        System.out.println("Seu salário antes do reajuste era: " + salarioAtual);
        System.out.println("O percentual do seu aumento é: " + porcent);
        System.out.println("O valor do seu aumento é: " + ajuste);
        System.out.println("Seu novo salário é: " + salarioReajuste);



    }
}
