package colecoes.composicao;

public class App {

    public static void main(String args[]) {
        Banco banco = new Banco();

        banco.setCodigo(10L);
        banco.setNome("Banco Krukoski");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(1000d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(2000d);
    }
}
