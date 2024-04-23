import java.util.ArrayList;
import java.util.Scanner;

public class BBB {

    public static void main(String[] args) {
        ArrayList<String> jogador = new ArrayList<String>();
        Scanner scn = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("1) Em quem você vota para sair da casa?");
            System.out.println("0) Sair.");
            System.out.println("Digite a opção desejada ");
            opcao = scn.nextInt();
            if (opcao == 1) {

            }
        } while (opcao != 0);

        jogador.add("Alana Dias");
        jogador.add("Beatriz Reis");
        jogador.add("Davi Brito");
        jogador.add("Deniziane Ferreira");
        jogador.add("Fernanda Bande");
        jogador.add("Giovanna Lima");
        jogador.add("Giovanna Pitel");
        jogador.add("Isabelle Nogueira");
        jogador.add("Juninho");
        jogador.add("Leidy Elin");
        jogador.add("Lucas Henrique");
        jogador.add("Lucas Luigi");
        jogador.add("Lucas Pizane");
        jogador.add("Marcus Vinicius");
        jogador.add("Matteus Amaral");
        jogador.add("Maycon Cosmer");
        jogador.add("MC Bin Laden");
        jogador.add("Michel Nogueira");
        jogador.add("Nizam");
        jogador.add("Raquele Cardozo");
        jogador.add("Rodriguinho");
        jogador.add("Thalyta Alves");
        jogador.add("Vanessa Lopes");
        jogador.add("Vinicius Rodrigues");
        jogador.add("Wanessa Camargo");
        jogador.add("Yasmin Brunet");
    }
    private static void cadastrar(ArrayList<jogador> agendaJogador) {
        Scanner scn = new Scanner(System.in);
        String nome = "";

        System.out.println("Digite o nome: ");
        nome = scn.nextLine();
    }
}