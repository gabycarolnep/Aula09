import java.util.Scanner;

public class Lista2exercicio03 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("MÉDIA DE NOTAS");
        System.out.println("...................................");
        System.out.println("Digite aqui suas 2 notas: ");

        double num1 = entrada_do_usuario.nextDouble();
        double num2 = entrada_do_usuario.nextDouble();
        double media = (num1 + num2)/2;


        if (media == 10){
            System.out.println("Aluno aprovado com distinção!");
            System.out.println("Finalmente alguém à altura da minha CPU <3 ");
        } else if (media >= 7){
            System.out.println("Aluno aprovado");
            System.out.println("E você não fez mais que sua obrigação...");
        } else {
            System.out.println("Aluno reprovado");
            System.out.println("Você é vergon da pofission!");

        }

    }
}
