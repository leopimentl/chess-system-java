package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int linha = 0 ; linha < mat.length ; linha++){
            for (int coluna = 0 ; coluna < mat.length ; coluna++){
                mat[linha][coluna] = (PecaDeXadrez) tabuleiro.peca(linha, coluna);
            }
        }
        return mat;
    }

    private void setupInicial(){
        tabuleiro.lugarDaPeca(new Rei(tabuleiro , Cor.BRANCO), new Posicao(7,4));
        tabuleiro.lugarDaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 0));
        tabuleiro.lugarDaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 7));
    }
}
