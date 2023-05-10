import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {
    private int id;
    private int qtdAlunos;
    List<Disciplina> disciplinas = new ArrayList<>();
}
