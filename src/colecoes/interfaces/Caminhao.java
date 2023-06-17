package colecoes.interfaces;

public class Caminhao implements ICarro {
    @Override
    public void parar() {
        System.out.println("Caminhão está parando");
    }

    @Override
    public void andar(){
        System.out.println("Caminhão está em movimento");
    }


}
