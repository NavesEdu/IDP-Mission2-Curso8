public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String toString(){
        return "[Aula: "+this.getTitulo() + " com duração de "+ this.getTempo()+ " minutos]";

    }

    @Override
    public int compareTo(Aula outra) {
        return this.titulo.compareTo(outra.titulo);
    }
}
