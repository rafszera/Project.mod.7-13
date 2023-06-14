package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();

    }

    /**
     * não repete valores na lista
     */
    private static void exemploNovo() {
        System.out.println("***exemploNovo***");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(2);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(1);

        System.out.println(inteiros);




    }

    private static void exemploListaSimples(){
        System.out.println("***exemploListaSimples***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }
    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("***exemploListaSimplesOrdemAscendente***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
//        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}
