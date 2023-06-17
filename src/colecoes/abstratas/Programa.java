package colecoes.abstratas;

public class Programa {

    public static void main(String args[]){
        Assalariado empregado = new Assalariado();
        empregado.setCPF("8710822400");
        empregado.setNome("Rafael");
        empregado.setSobrenome("Saibro");
        empregado.setSalario(11000);
        System.out.println("Nome: " + empregado.getNome() + "\nSobrenome: " + empregado.getSobrenome() + "\nCPF: " + empregado.getCPF() + " \nSalário Mensal: $" + empregado.getSalario());
    }
}
