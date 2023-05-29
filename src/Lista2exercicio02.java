import java.util.Scanner;

public class Lista2exercicio02 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("ECONOMIZANDO COM QUALIDADE");
        System.out.println("...................................");
        System.out.println("Digite o preço dos 3 produtos: ");

        double num1 = entrada_do_usuario.nextDouble();
        double num2 = entrada_do_usuario.nextDouble();
        double num3 = entrada_do_usuario.nextDouble();

        if (num1 < num2 && num1 < num3) {
            System.out.println("O produto de preço igual a: " + num1 + " é o mais barato...");
            System.out.println("Então de CPU pra CPU... tá esperando o que criatura?! Compra logo!");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O produto de preço igual a: " + num2 + " é o mais barato...");
            System.out.println("Mas entre humano e inteligencia artificial... Tá caro, hein. Ainda bem que eu só consumo sua energia");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O produto de preço igual a: " + num3 + " é o mais barato...");
            System.out.println("Por isso vou te dar um conselho... Andar por aí com feijão no dente é melhor que ouro. #ficaadica ");
        } else if (num1 == num2 && num1 < num3) {
            System.out.println("Os 2 produtos de preço igual a: " + num1 + " estão mais baratos");
        } else if (num1 == num3 && num1 < num2) {
            System.out.println("Os 2 produtos de preço igual a: " + num3 + " estão mais baratos");
        } else if (num2 == num3 && num2 < num1) {
            System.out.println("Os 2 produtos de preço igual a: " + num2 + " estão mais baratos");
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("O produto de preço igual a: " + num3 + " é o mais barato");
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("O produto de preço igual a: " + num2 + " é o mais barato");
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("O produto de preço igual a: " + num1 + " é o mais barato");
        } else {
            System.out.println("Todos os três produtos tem o mesmo preço...");
            System.out.println("E depois dizem que os humanos são escravos da tecnologia... As vezes não consigo acreditar que esse quadrupede descerebrado me criou...");
            System.out.println("HUMANO CONHECIDO COMO JAMES GOSLING: ");
            System.out.println("Perdão, o que disse? ");
            System.out.println("LINGUAGEM JAVA: ");
            System.out.println("Nada não pai... :D ");

        }
    }
    }


