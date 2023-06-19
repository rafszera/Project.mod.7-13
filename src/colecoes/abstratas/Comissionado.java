package colecoes.abstratas;

public class Comissionado extends Empregado {

    private Double totalVenda;

    private Double totalComissao;

    public Double getTotalComissao() {
        return totalComissao;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    @Override
    public Double vencimento() {

        return totalVenda*totalComissao;
    }
}
