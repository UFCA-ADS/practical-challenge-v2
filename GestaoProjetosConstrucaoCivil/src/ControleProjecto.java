import java.util.ArrayList;
import java.util.List;

public class ControleProjecto {

    private List<Projeto> projetos;

    public ControleProjecto() {
        this.projetos = new ArrayList<>();
    }

    public void cadastrarProjeto(Projeto projeto) {
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso.");
    }

    public void designarEquipe(Projeto projeto, Equipe equipe) {
        projeto.adicionarEquipe(equipe);
        System.out.println("Equipe designada para o projeto.");
    }

    public void registrarRequisitos(Projeto projeto, List<String> requisitos) {
        projeto.setRequisitos(requisitos);
        System.out.println("Requisitos registrados para o projeto.");
    }

    public void acompanharProgresso(Projeto projeto) {
        System.out.println("Acompanhando o progresso do projeto: " + projeto.getNome());
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
}
