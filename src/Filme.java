public class Filme {
    // Atributos privados da classe Filme
    private String titulo;
    private String diretor;
    private int duracao; // em minutos
    private String classificacao;

    // Construtor da classe Filme
    public Filme(String titulo, String diretor, int duracao, String classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    // Método getter para o título do filme
    public String getTitulo() {
        return titulo;
    }

    // Método getter para o diretor do filme
    public String getDiretor() {
        return diretor;
    }

    // Método getter para a duração do filme
    public int getDuracao() {
        return duracao;
    }

    // Método getter para a classificação do filme
    public String getClassificacao() {
        return classificacao;
    }

    // Método que retorna a descrição do filme em formato String
    public String descricao() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}
