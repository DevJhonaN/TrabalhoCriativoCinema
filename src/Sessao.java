// Classe que representa uma sessão de cinema
public class Sessao {
    // Atributos privados da classe Sessao
    private Filme filme;
    private String horario;
    private String sala;
    private int ingressosDisponiveis;

    // Construtor da classe Sessao
    public Sessao(Filme filme, String horario, String sala, int ingressosDisponiveis) {
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    // Método getter para o filme da sessão
    public Filme getFilme() {
        return filme;
    }

    // Método getter para o horário da sessão
    public String getHorario() {
        return horario;
    }

    // Método getter para a sala da sessão
    public String getSala() {
        return sala;
    }

    // Método getter para a quantidade de ingressos disponíveis na sessão
    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }

    // Método para reduzir a quantidade de ingressos disponíveis
    public void reduzirIngressos(int quantidade) {
        if (quantidade <= ingressosDisponiveis) {
            ingressosDisponiveis -= quantidade;
        } else {
            System.out.println("Ingressos insuficientes.");
        }
    }

    // Método que retorna a descrição da sessão em formato String
    public String descricao() {
        return "Sessao{" +
                "filme=" + filme.descricao() +
                ", horario='" + horario + '\'' +
                ", sala='" + sala + '\'' +
                ", ingressosDisponiveis=" + ingressosDisponiveis +
                '}';
    }
}
