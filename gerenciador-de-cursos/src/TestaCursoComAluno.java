public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando colecoes", "Paulo");

        javaColecoes.adiciona(new Aula("testes", 23));
        javaColecoes.adiciona(new Aula("criando", 22));
        javaColecoes.adiciona(new Aula("modelando", 21));

        Aluno a1 = new Aluno("Eduardo", 3712);
        Aluno a2 = new Aluno("Edu", 23454);
        Aluno a3 = new Aluno("Du", 98765);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a ->{
            System.out.println(a);
        });

        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno eduardo = new Aluno("Eduardo", 3712);
        System.out.println(javaColecoes.estaMatriculado(eduardo));
        System.out.println(a1.equals(eduardo));

        System.out.println(a1.hashCode() == eduardo.hashCode());

    }
}
