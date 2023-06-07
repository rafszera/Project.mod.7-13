package variaveis.fluxo;

import java.util.Scanner;
public class ExemploIdade {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

        public static String getIdade(int idade){
            if (idade >=0 && idade <=5) {
                return "Você é um bebê";
            } else if (idade >=6 && idade <=10) {
                return "Voce é uma criança";
            } else if (idade >=11 && idade <18){
                return "Você é adolecente)";
            } else {
                return "Você é adulto";
            }
        }




        // ** Modo alternativo **
//        if (idade <= 5) {
//            System.out.println("Você é um bebê");
//        } else if (idade >= 6 && idade <= 10) {
//            System.out.println("Você é uma criança");
//        } else if (idade >= 11 && idade <= 17){
//            System.out.println("Você é adolecente");
//        } else if (idade >= 18){
//            System.out.println("Você é um adulto");
//        }


}


