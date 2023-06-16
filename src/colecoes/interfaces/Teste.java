package colecoes.interfaces;

public class Teste {
    public static void main(String args[]){
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Ola Rafael ");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());
        System.out.println("");


        ICaneta giz = new Giz();
        giz.escrever("Olá Rafael ");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());
        System.out.println("");

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Rafael ");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());
        System.out.println("");

       ICarro carro = new CarroPasseio();
       carro.andar();
       carro.parar();

    }
}
