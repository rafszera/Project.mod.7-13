package ex.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String args[]){
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }
    private static void exemploListaSimplesOrdenadaClasseExterna (){
        System.out.println("***exemploListaSimplesOrdenadaClasseExterna***");
        List<String> lista = new ArrayList<String>();

        Aluno a = new Aluno("Joao da Silva", "linux básico", 0);
        Aluno b = new Aluno("Antonio Souza", "OpenOffice", 0);
        Aluno c = new Aluno("Lucia Ferreira", "Internet", 0);
        lista.add(String.valueOf(a));
        lista.add(String.valueOf(b));
        lista.add(String.valueOf(c));
        Collections.sort(lista);
        System.out.print(lista);
        System.out.println("");

    }
    private static void exemploListaSimplesOrdenadaComparatorAluno () {
        System.out.println("***exemploListaSimplesOrdenadaComparatorAluno***");
        List<String> lista = new ArrayList<String>();

        Aluno a = new Aluno("Joao da Silva", "linux básico", 20);
        Aluno b = new Aluno("Antonio Souza", "OpenOffice", 30);
        Aluno c = new Aluno("Lucia Ferreira", "Internet", 10);
        lista.add(String.valueOf(a));
        lista.add(String.valueOf(b));
        lista.add(String.valueOf(c));
        System.out.println("Lista sem ordenação: " + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista);
        System.out.println("Lista com ordenaçao por nota" + lista);

        System.out.println("");

    }

}



