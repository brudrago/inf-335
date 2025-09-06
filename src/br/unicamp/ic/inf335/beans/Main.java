package br.unicamp.ic.inf335.beans;

import br.unicamp.ic.inf335.Brecho;

public class Main {
    public static void main(String[] args) {

        ProdutoBean produto = new ProdutoBean();
                produto.setNome("produto 1");
                produto.setCodigo("001");
                produto.setDescricao("desc 1");
                produto.setValor(20.0);
        System.out.println("Produto: " + produto.getNome() + " - Valor: " + produto.getValor());
    }
}
