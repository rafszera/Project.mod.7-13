package colecoes.abstratas;

public class Programa {

    public static void main(String args[]){
        Empregado empregado = new Assalariado();
        empregado.setCPF("8710822400");
        empregado.setNome("Rafael");
        empregado.setSobrenome("Saibro");
        System.out.println("Nome: " + empregado.getNome() + "\nSobrenome: " + empregado.getSobrenome() + "\nCPF: " + empregado.getCPF());
    }
}
