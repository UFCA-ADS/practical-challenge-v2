import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ControleProjecto controleProjetos = new ControleProjecto();

        Equipe equipe1 = new Equipe("Equipe A");
        Equipe equipe2 = new Equipe("Equipe B");

        Projeto projeto1 = new Projeto("Projeto 1");

        projeto1.adicionarEquipe(equipe1);
        projeto1.adicionarEquipe(equipe2);

        List<String> requisitosProjeto1 = new ArrayList<>();
        requisitosProjeto1.add("Requisito 1");
        requisitosProjeto1.add("Requisito 2");
        projeto1.setRequisitos(requisitosProjeto1);

        controleProjetos.cadastrarProjeto(projeto1);

        controleProjetos.designarEquipe(projeto1, equipe1);

        List<String> requisitosProjeto2 = new ArrayList<>();
        requisitosProjeto2.add("Requisito 3");
        requisitosProjeto2.add("Requisito 4");
        controleProjetos.registrarRequisitos(projeto1, requisitosProjeto2);

        controleProjetos.acompanharProgresso(projeto1);

        List<Projeto> projetos = controleProjetos.getProjetos();

        for (Projeto projeto : projetos) {
            System.out.println("Nome do Projeto: " + projeto.getNome());
            System.out.println("Equipes do Projeto:");
            for (Equipe equipe : projeto.getEquipes()) {
                System.out.println("- Nome da Equipe: " + equipe.getNome());
                System.out.println("  Membros da Equipe: " + equipe.getMembros());
            }
            System.out.println("Requisitos do Projeto: " + projeto.getRequisitos());
            System.out.println();
        }
    }
}
