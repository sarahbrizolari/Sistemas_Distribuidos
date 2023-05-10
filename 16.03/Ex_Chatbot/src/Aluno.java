public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private String senha;

    private float media1;
    private float media2;
    private float media3;
    private float media4;
    private float media5;
    private String Disciplina1;

    private String Disciplina2;

    private String Disciplina3;

    private String Disciplina4;

    private String Disciplina5;

    public int getSala() {
        return sala;
    }

    public float getMedia1() {
        return media1;
    }

    public void setMedia1(float media1) {
        this.media1 = media1;
    }

    public float getMedia2() {
        return media2;
    }

    public void setMedia2(float media2) {
        this.media2 = media2;
    }

    public float getMedia3() {
        return media3;
    }

    public void setMedia3(float media3) {
        this.media3 = media3;
    }

    public float getMedia4() {
        return media4;
    }

    public void setMedia4(float media4) {
        this.media4 = media4;
    }

    public float getMedia5() {
        return media5;
    }

    public void setMedia5(float media5) {
        this.media5 = media5;
    }

    public String getDisciplina1() {
        return Disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        Disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return Disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        Disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return Disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        Disciplina3 = disciplina3;
    }

    public String getDisciplina4() {
        return Disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        Disciplina4 = disciplina4;
    }

    public String getDisciplina5() {
        return Disciplina5;
    }

    public void setDisciplina5(String disciplina5) {
        Disciplina5 = disciplina5;
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


    public Aluno(String nome, int idade, String matricula, String curso, String senha, float media1, float media2, float media3, float media4, float media5, String disciplina1, String disciplina2, String disciplina3, String disciplina4, String disciplina5, int sala) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
        this.media1 = media1;
        this.media2 = media2;
        this.media3 = media3;
        this.media4 = media4;
        this.media5 = media5;
        Disciplina1 = disciplina1;
        Disciplina2 = disciplina2;
        Disciplina3 = disciplina3;
        Disciplina4 = disciplina4;
        Disciplina5 = disciplina5;
        this.sala = sala;
    }
}