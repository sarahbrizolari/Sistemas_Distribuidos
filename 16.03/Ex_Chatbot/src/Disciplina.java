import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Integer> notas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public Disciplina(String sitemasDistribuidos, Aluno aluno2, int i) {
    }

    public String getNome() {
        return nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addNota(int nota) {
        notas.add(nota);
    }

    public List<Integer> getNotas() {
        return notas;
    }


}
