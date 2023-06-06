import java.util.Scanner;
public class ControleFluxo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = s.nextInt();

        if (idade <= 5) {
            System.out.println("Você é um bebê");
        } else if (idade >= 6 && idade <= 10) {
            System.out.println("Você é uma criança");
        } else if (idade >= 11 && idade <= 17){
            System.out.println("Você é adolecente");
        } else if (idade >= 18){
            System.out.println("Você é um adulto");
        }

    }
}


