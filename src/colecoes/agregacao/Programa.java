package colecoes.agregacao;

public class Programa {
    
    public static void main(String args[]) {
        Produto produtoTV = criarProduto(1L, 2000d, "TV");
        Produto produtoCel = criarProduto(2L, 1500d, "Celular");

        Vendedor vendedor = criarVendedor("Teste", 10);

        Comprador comprador = criarComprador("Rafael", 10000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
        System.out.println(produtoTV.getNome());
    }

    private static Comprador criarComprador(String nome, double verba) {

       return new Comprador(nome, verba);

    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;

    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
