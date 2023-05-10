public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private String senha;

    private float mediaJava;
    private float mediaBD;

    public float getMediaJava() {
        return mediaJava;
    }

    public void setMediaJava(float mediaJava) {
        this.mediaJava = mediaJava;
    }

    public float getMediaBD() {
        return mediaBD;
    }

    public void setMediaBD(float mediaBD) {
        this.mediaBD = mediaBD;
    }

    public float getMediaMatematica() {
        return mediaMatematica;
    }

    public void setMediaMatematica(float mediaMatematica) {
        this.mediaMatematica = mediaMatematica;
    }

    public float getMediaPortugues() {
        return mediaPortugues;
    }

    public void setMediaPortugues(float mediaPortugues) {
        this.mediaPortugues = mediaPortugues;
    }

    public float getMediaRedacao() {
        return mediaRedacao;
    }

    public void setMediaRedacao(float mediaRedacao) {
        this.mediaRedacao = mediaRedacao;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public String getMatematica() {
        return Matematica;
    }

    public void setMatematica(String matematica) {
        Matematica = matematica;
    }

    public String getBD() {
        return BD;
    }

    public void setBD(String BD) {
        this.BD = BD;
    }

    public String getRedacao() {
        return Redacao;
    }

    public void setRedacao(String redacao) {
        Redacao = redacao;
    }

    public String getPortugues() {
        return Portugues;
    }

    public void setPortugues(String portugues) {
        Portugues = portugues;
    }

    public String getJava() {
        return Java;
    }

    public void setJava(String java) {
        Java = java;
    }

    private float mediaMatematica;

    private float mediaPortugues;

    private float mediaRedacao;

    private String NomeCurso;

    private String Matematica;

    private String BD;

    private String Redacao;

    private String Portugues;

    private String Java;

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    private int sala;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Aluno(String nome, int idade, String matricula, String curso, String senha, float mediaJava, float mediaBD, float mediaMatematica, float mediaPortugues, float mediaRedacao, String nomeCurso, String matematica, String BD, String redacao, String portugues, String java, int sala) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
        this.mediaJava = mediaJava;
        this.mediaBD = mediaBD;
        this.mediaMatematica = mediaMatematica;
        this.mediaPortugues = mediaPortugues;
        this.mediaRedacao = mediaRedacao;
        NomeCurso = nomeCurso;
        Matematica = matematica;
        this.BD = BD;
        Redacao = redacao;
        Portugues = portugues;
        Java = java;
        this.sala = sala;
    }
}