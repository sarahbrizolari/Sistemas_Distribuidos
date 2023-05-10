public class Professor extends Pessoa {
    private String disciplina;
    private String titulacao;

    public Professor(String nome, int idade, String disciplina, String titulacao) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.titulacao = titulacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
