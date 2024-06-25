import java.util.Scanner;

// Classe principal do aplicativo
public class App {
    public static void main(String[] args) {
        // Criação do scanner para leitura de entradas do usuário
        Scanner scanner = new Scanner(System.in);
        // Criação dos gerenciadores de filmes e sessões
        GerenciadorDeFilmes gerenciadorDeFilmes = new GerenciadorDeFilmes();
        GerenciadorDeSessoes gerenciadorDeSessoes = new GerenciadorDeSessoes();

        // Loop infinito para o menu do aplicativo
        while (true) {
            // Exibe as opções do menu para o usuário
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Listar Filmes");
            System.out.println("3. Adicionar Sessão");
            System.out.println("4. Listar Sessões");
            System.out.println("5. Reservar Ingresso");
            System.out.println("6. Sair");
            
            // Lê a escolha do usuário
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            // Executa a ação com base na escolha do usuário
            switch (escolha) {
                case 1:
                    // Adicionar um novo filme
                    System.out.println("Digite o título do filme:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o diretor do filme:");
                    String diretor = scanner.nextLine();
                    System.out.println("Digite a duração do filme (em minutos):");
                    int duracao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.println("Digite a classificação indicativa do filme:");
                    String classificacao = scanner.nextLine();
                    // Adiciona o filme ao gerenciador de filmes
                    gerenciadorDeFilmes.adicionarFilme(new Filme(titulo, diretor, duracao, classificacao));
                    break;
                case 2:
                    // Listar todos os filmes
                    gerenciadorDeFilmes.listarFilmes().forEach(filme -> System.out.println(filme.descricao()));
                    break;
                case 3:
                    // Adicionar uma nova sessão para um filme existente
                    System.out.println("Digite o título do filme:");
                    titulo = scanner.nextLine();
                    // Busca o filme pelo título
                    Filme filme = gerenciadorDeFilmes.listarFilmes().stream()
                            .filter(f -> f.getTitulo().equals(titulo))
                            .findFirst()
                            .orElse(null);
                    if (filme != null) {
                        System.out.println("Digite o horário da sessão:");
                        String horario = scanner.nextLine();
                        System.out.println("Digite a sala da sessão:");
                        String sala = scanner.nextLine();
                        System.out.println("Digite o número de ingressos disponíveis:");
                        int ingressosDisponiveis = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer do scanner
                        // Adiciona a sessão ao gerenciador de sessões
                        gerenciadorDeSessoes.adicionarSessao(new Sessao(filme, horario, sala, ingressosDisponiveis));
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                    break;
                case 4:
                    // Listar todas as sessões
                    gerenciadorDeSessoes.listarSessoes().forEach(sessao -> System.out.println(sessao.descricao()));
                    break;
                case 5:
                    // Reservar ingresso para uma sessão específica
                    System.out.println("Digite o horário da sessão:");
                    String horarioSessao = scanner.nextLine();
                    System.out.println("Digite a sala da sessão:");
                    String salaSessao = scanner.nextLine();
                    System.out.println("Digite a quantidade de ingressos:");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    // Realiza a reserva de ingressos
                    gerenciadorDeSessoes.reservarIngresso(horarioSessao, salaSessao, quantidade);
                    break;
                case 6:
                    // Sair do aplicativo
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha o scanner
                    return; // Encerra o loop e o programa
                default:
                    // Opção inválida
                    System.out.println("Opção inválida.");
            }
        }
    }
}
