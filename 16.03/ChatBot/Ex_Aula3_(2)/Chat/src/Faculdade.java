import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private int numeroSalas;
    private List<Curso> cursos;

    public Faculdade(int numeroSalas) {
        this.numeroSalas = numeroSalas;
        this.cursos = new ArrayList<>();
    }

    public int getNumeroSalas() {
        return numeroSalas;
    }

    public void setNumeroSalas(int numeroSalas) {
        this.numeroSalas = numeroSalas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

   /* public class Main {
        public void main(String[] args) {
            ArrayList<Faculdade> faculdades = new ArrayList<Faculdade>();
            Faculdade faculdade = new Faculdade(25, Curso1);
            faculdades.add(faculdade);
        }
    }*/
}
