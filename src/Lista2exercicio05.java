import java.util.Scanner;

public class Lista2exercicio05 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");

        double num = entrada_do_usuario.nextDouble();

        if (num == 1){
            System.out.println("Hoje é Domingo");
        } else if (num == 2){
            System.out.println("Hoje é Segunda");
        } else if (num == 3){
        System.out.println("Hoje é Terça");
        } else if (num == 4){
            System.out.println("Hoje é Quarta");
        } else if (num == 5){
            System.out.println("Hoje é Quinta");
        } else if (num == 6){
            System.out.println("Hoje é Sexta");
        } else if (num == 7){
            System.out.println("Hoje é Sábado");
        } else {
            System.out.println("Valor invalido");
        }
    }
}
