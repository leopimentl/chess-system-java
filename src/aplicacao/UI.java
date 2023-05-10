package aplicacao;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;

public class UI {

    public static void printTabuleiro(PecaDeXadrez[][] pecas){
        for (int linha = 0 ; linha < pecas.length ; linha ++){
            System.out.print(8 - linha + " ");
            for (int coluna = 0 ; coluna < pecas.length ; coluna ++){
                printaPeca(pecas[linha][coluna]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static void printaPeca(PecaDeXadrez pecaDeXadrez){
        System.out.print(pecaDeXadrez == null ? "-" : pecaDeXadrez);
    }
}
