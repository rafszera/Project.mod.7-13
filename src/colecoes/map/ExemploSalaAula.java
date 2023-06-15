package colecoes.map;

import colecoes.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaAula {
    public static void main(String args[]){
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();

        List<Aluno> alunosSala1 = criarTurno("Sala 1", 10);
        listaSala.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurno("Sala 2", 30);
        listaSala.put(1, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }

    private static void imprimirAlunosSala(List<Aluno> alunos) {
        System.out.println("for java 8 API STREAM");
        alunos.forEach(aluno->System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala()));
        System.out.println(" ");

        System.out.println("for java");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println(" ");

        System.out.println("for java com contador");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
    }


    private static List<Aluno> criarTurno(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i< count; i++) {
            Aluno aluno = new Aluno("Nome Aluno " + i , "Curso: " + i , i , sala);
            alunos.add(aluno);
        }
        return alunos;
    }
}
