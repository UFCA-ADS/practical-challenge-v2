import java.util.List;

public class Projeto {

    private String nome;
    private List<Equipe> equipes;
    private List<String> requisitos;

    public Projeto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }
}
