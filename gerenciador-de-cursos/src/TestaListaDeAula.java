import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("revisitando arrays", 21);
        Aula a2 = new Aula("listas de objetos", 15);
        Aula a3 = new Aula("relacionamento de listas", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
