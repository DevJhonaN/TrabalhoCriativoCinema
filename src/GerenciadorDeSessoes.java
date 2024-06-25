import java.util.ArrayList;
import java.util.List;

// Classe que gerencia a lista de sessões
public class GerenciadorDeSessoes {
    // Lista privada de objetos Sessao
    private List<Sessao> sessoes;

    // Construtor da classe que inicializa a lista de sessões
    public GerenciadorDeSessoes() {
        this.sessoes = new ArrayList<>();
    }

    // Método para adicionar uma sessão à lista
    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    // Método para remover uma sessão da lista com base no horário e na sala
    public void removerSessao(String horario, String sala) {
        sessoes.removeIf(sessao -> sessao.getHorario().equals(horario) && sessao.getSala().equals(sala));
    }

    // Método para listar todas as sessões na lista
    public List<Sessao> listarSessoes() {
        return sessoes;
    }

    // Método para reservar ingressos para uma sessão específica
    public void reservarIngresso(String horario, String sala, int quantidade) {
        for (Sessao sessao : sessoes) {
            if (sessao.getHorario().equals(horario) && sessao.getSala().equals(sala)) {
                sessao.reduzirIngressos(quantidade);
                return;
            }
        }
        // Mensagem exibida caso a sessão não seja encontrada
        System.out.println("Sessão não encontrada.");
    }
}
