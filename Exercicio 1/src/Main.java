import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Date x=new Date();
        System.out.println(x);

        Scanner ler = new Scanner (System.in);

        System.out.println("Informe  o nome do usuario");
        String  NomeUsuario = ler.nextLine();

        System.out.println("Informe  a data de nascimento");
        String  DataNascimento = ler.nextLine();

        System.out.println("Informe a senha");
        String  Senha = ler.nextLine();

        RedeSocial redeSocial = new RedeSocial("27-08-1996", "Nenhum", "https://","123456789");

        System.out.println("Digite um texto para sua primeira publicação:");
        String textoPublicacao = ler.nextLine();
        System.out.println("Link da mídia:");
        String link = ler.nextLine();
        Publicacao publicacao = new Publicacao("27-08-1996", "Nenhum", "https://" );

        redeSocial.inserePublicacao(publicacao);

        int opcao = 0;
        do {
            System.out.println("Deseja inserir outra publicação? digite 1 para Sim e 2 para não: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    ler = new Scanner(System.in);
                    System.out.println("Digite um texto para publicação:");
                    textoPublicacao = ler.nextLine();
                    System.out.println("Link da mídia:");
                    link = ler.nextLine();
                    publicacao = new Publicacao("27-08-1996", "Nenhum", "https://");
                    redeSocial.inserePublicacao(publicacao);
                    break;
                case 2:
                    opcao = 2;
                    break;
                default:
                    opcao = 2;
                    break;
            }
        } while (opcao != 2);

        redeSocial.imprimePublicacoes();
    }

}
