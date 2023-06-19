package colecoes.abstratas;

public class Programa {

    public static void main(String args[]){
        Assalariado empregado = new Assalariado();
        empregado.setCPF("8710822400");
        empregado.setNome("Rafael");
        empregado.setSobrenome("Saibro");
        empregado.setSalario(11000d);
        System.out.println("Nome: " + empregado.getNome() + "\nSobrenome: " + empregado.getSobrenome() + "\nCPF: " + empregado.getCPF() + " \nSalário Mensal: $" + empregado.getSalario());

        System.out.println(" ");

        Comissionado comissionado = new Comissionado();
        comissionado.setCPF("8710822400");
        comissionado.setNome("RafaelComissao");
        comissionado.setSobrenome("Saibro");
        comissionado.setTotalVenda(10000d);
        comissionado.setTotalComissao(0.1d);
        System.out.println("Nome: " + comissionado.getNome() + "\nSobrenome: " + comissionado.getSobrenome() + "\nCPF: " + comissionado.getCPF() + " \nGanhos de comissão: $" + comissionado.vencimento());

        System.out.println(" ");

        Horista horista = new Horista();
        horista.setCPF("8710822400");
        horista.setNome("RafaelHora");
        horista.setSobrenome("Saibro");
        horista.setPrecoHora(30d);
        horista.setHoraTrabalhada(40d);
        System.out.println("Nome: " + horista.getNome() + "\nSobrenome: " + horista.getSobrenome() + "\nCPF: " + horista.getCPF() + " \nGanhos Semanais: $" + horista.vencimento());

    }
}
