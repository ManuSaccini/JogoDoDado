import model.Jogar;
import java.util.Scanner;
public class JogoDoDado {
    public static void main(String[] args) {
        String nome;
        int dado;

        Scanner sc = new Scanner(System.in);

        Jogar jogador1 = new Jogar();
        System.out.println("Nome do primeiro jogador: ");
        nome = sc.nextLine();
        jogador1.setNome(nome);


        Jogar jogador2 = new Jogar();
        System.out.println("Nome do segundo jogador: ");
        nome = sc.nextLine();
        jogador2.setNome(nome);

        System.out.println("Jogador(a) " + jogador1.getNome() + " tirou " + jogador1.getDado());
        System.out.println("Jogador(a) " + jogador2.getNome() + " tirou " + jogador2.getDado());

        if(jogador1.getDado()==6 && jogador2.getDado()!=6){
            System.out.println("Parabéns " + jogador1.getNome() + "  você ganhou");
            return;
        }
        if(jogador2.getDado()==6 && jogador1.getDado()!=6){
            System.out.println("Parabéns " + jogador2.getNome() + " você ganhou");
            return;
        }

        System.out.println("Deu banca!!!" + "ninguem fez 6. O dinheiro é da banca");

    }
}