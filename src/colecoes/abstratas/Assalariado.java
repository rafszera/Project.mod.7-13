package colecoes.abstratas;

public class Assalariado extends Empregado {

        private Integer salario;

        public Integer getSalario() {
                return salario;
        }

        public void setSalario(Integer salario) {
                this.salario = salario;
        }

        @Override
        public Integer vencimento() {
                return null;
        }
}
