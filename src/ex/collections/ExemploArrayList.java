package ex.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExemploArrayList {

    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("***exemploListaSImples***");

        List<String> lista = new ArrayList<String>();
        lista.add("Joao Da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("***exemploListaSimplesOrdemAscendente***");

        List<String> lista = new ArrayList<String>();
        lista.add("Joao Da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }


}
