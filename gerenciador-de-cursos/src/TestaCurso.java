import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando colecoes", "Paulo");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
        //aulas.add(new Aula("Trabalhando com array",21));
        //javaColecoes.getAulas().add(new Aula("nova aula", 13));
        javaColecoes.adiciona(new Aula("testes", 23));
        javaColecoes.adiciona(new Aula("criando", 22));
        javaColecoes.adiciona(new Aula("modelando", 21));
        System.out.println(aulas);
        System.out.println(javaColecoes.getAulas());
    }
}
