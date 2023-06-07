package variaveis.fluxo;

public class ExemploBreakContinue {

    public static void main(String args[]) {


        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 5 != 0)
                continue;
            else if (contador >= 80)
                break;

            System.out.println("Contador: " + contador);
        }
    }
}

