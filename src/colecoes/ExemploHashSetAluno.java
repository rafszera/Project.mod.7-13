package colecoes;


import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String args[]){

        exemploListaSimples();
        exemploConsultando();
        exemploRemover();

    }

    private static void exemploRemover() {
        System.out.println("***exemploRemover***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno e = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno b = new Aluno("Antonio Sousa", "Open Office",0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "Open Office",0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        conjunto.remove(c);
        System.out.println(conjunto);
        System.out.println("");

        for (Aluno aluno : conjunto){
            System.out.println(aluno);

        }
    }

    private static void exemploConsultando() {
        System.out.println("***exemploConsultando***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno e = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno b = new Aluno("Antonio Sousa", "Open Office",0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "Open Office",0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(e));
        System.out.println("");
    }

    private static void exemploListaSimples(){
        System.out.println("***exemploListaSimples***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno e = new Aluno("Joao da Silva", "Linux Básico",0);
        Aluno b = new Aluno("Antonio Sousa", "Open Office",0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "Open Office",0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        conjunto.add(e);
        System.out.println(conjunto);
        System.out.println("");
    }
}
