import java.util.Scanner;

public class Lista2exercicio01 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("COMPARANDO NÚMEROS");
        System.out.println("...................................");
        System.out.println("Digite 2 números quais quer que desejar: ");

        double num1 = entrada_do_usuario.nextDouble();
        double num2 = entrada_do_usuario.nextDouble();

        if (num1 > num2){
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if (num1 < num2){
            System.out.println("O número " + num1 + " é menor que o número " + num2);

        } else {
            System.out.println("Os números digitados são iguais");

        }


    }
}
