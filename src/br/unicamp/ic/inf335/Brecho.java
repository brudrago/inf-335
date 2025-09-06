package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;
import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

    private static final ArrayList<ProdutoBean> produtos = new ArrayList<>();

    public static void main(String[] args) {
        produtos.add(new ProdutoBean("CD00001","Celular Galaxy Preto",
                "Preto, com carregador", 1250.0, "Poucos riscos, estado de novo"));
        produtos.add(new ProdutoBean("CD00002","Notebook 14\"",
                "i5, 8GB RAM, SSD 256GB", 3100.0, "Muito bom"));
        produtos.add(new ProdutoBean("CD00003","Kindle 10ª Geração",
                "Tela 6\"", 450.0, "Sem marcas"));
        produtos.add(new ProdutoBean("CD00004","Fone Bluetooth",
                "Over-ear com ANC", 700.0, "Ótimo estado"));

        Collections.sort(produtos);

        System.out.println("=== Lista de produtos (ordenados por valor) ===");
        for (ProdutoBean p : produtos) {
            System.out.println(p);
        }
        
        double soma = 0.0;
        for (ProdutoBean p : produtos) {
            soma += p.getValor();
        }
        double media = produtos.isEmpty() ? 0.0 : soma / produtos.size();
        System.out.printf("Média de valores = R$ %.2f%n", media);
    }
}
