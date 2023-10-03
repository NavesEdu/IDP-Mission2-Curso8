import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando colecoes", "Paulo");

        javaColecoes.adiciona(new Aula("testes", 23));
        javaColecoes.adiciona(new Aula("criando", 22));
        javaColecoes.adiciona(new Aula("modelando", 21));
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }
}
