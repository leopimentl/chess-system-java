package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
    Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8,8);
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
}
