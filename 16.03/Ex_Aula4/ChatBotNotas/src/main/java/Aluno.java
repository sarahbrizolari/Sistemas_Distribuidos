import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {
    private int RA;
    private int senha;
    private float nota1;
    private float nota2;
    private float notaMedia;
    private Professor professor;

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}


// String path = "D:\\Logatti 6º Semestre\\Organização e recuperação da Informação\\Exercicios\\Ex_Aula5\\txt\\contas.txt";
//@Entity(name = "tbl_paciente") //define o nome da tabela que sera criada no banco de dados
//public class Paciente extends Pessoa implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @OneToOne (cascade=CascadeType.ALL, orphanRemoval = true)