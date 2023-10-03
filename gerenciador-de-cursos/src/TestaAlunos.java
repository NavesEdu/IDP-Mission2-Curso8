import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Edu");
        alunos.add("Du");
        alunos.add("Dudu");
        alunos.add("Eduardo");
        alunos.add("Duardo");
        System.out.println(alunos);

        boolean eduMatriculado = alunos.contains("Edu");
        alunos.remove("Duardo");
        System.out.println(eduMatriculado);
        System.out.println(alunos.size());

        for (String aluno: alunos
             ) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> System.out.println(aluno));

        List<String> alunosEmLista = new ArrayList<>(alunos);


    }
}
