public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Ola Rafael");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua Teste 142");
        cliente.setCodigo(1);
        System.out.println("Codigo do cliente: " + cliente.getCodigo());
//        System.out.println("Endereço do cliente: " + cliente.getEndereco());
//        cliente.imprimirEndereco();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());


    }
    /**
     *@see <a href="https://www.linkedin.com/in/rafaelsaibro" target="_top">https://www.linkedin.com/in/rafaelsaibro</a>.
     */

}
