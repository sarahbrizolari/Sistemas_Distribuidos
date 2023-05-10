import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public Curso(String sistemasDistribuidos, Disciplina disciplina1, Aluno aluno2) {
    }

    public String getNome() {
        return nome;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

  /*  public class Main {
        public void main(String[] args) {
            ArrayList<Curso> cursos = new ArrayList<Curso>();
            Curso curso1 = new Curso("Ciências da Computação"," ", " ");
            cursos.add(curso1);
        }
    }*/
}
