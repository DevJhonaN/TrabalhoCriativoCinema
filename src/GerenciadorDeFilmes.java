import java.util.ArrayList;
import java.util.List;

// Classe que gerencia a lista de filmes
public class GerenciadorDeFilmes {
    // Lista privada de objetos Filme
    private List<Filme> filmes;

    // Construtor da classe que inicializa a lista de filmes
    public GerenciadorDeFilmes() {
        this.filmes = new ArrayList<>();
    }

    // Método para adicionar um filme à lista
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    // Método para remover um filme da lista com base no título
    public void removerFilme(String titulo) {
        filmes.removeIf(filme -> filme.getTitulo().equals(titulo));
    }

    // Método para listar todos os filmes na lista
    public List<Filme> listarFilmes() {
        return filmes;
    }
}
