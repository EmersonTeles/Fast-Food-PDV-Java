package tests;
import FastFood.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestFastFood {
    Caixa caixa = new Caixa();
    Estoque estoque = new Estoque();
    Cardapio cardapio = new Cardapio();
    Venda venda = new Venda();
    ArrayList<Insumo> composicao = new ArrayList<>();

    public TestFastFood(){
        caixa.toggleIsCaixaOpen();
        estoque.cadastrar(new Insumo("Pão", 0.5f), 10);
        estoque.cadastrar(new Insumo("Carne", 6f), 15);
        composicao.add(estoque.getInsumoByIndex(0));
        composicao.add(estoque.getInsumoByIndex(1));
        cardapio.cadastrar(new Hamburguer("Big Mac", 10,"Pequeno", composicao));
    }

    @org.junit.jupiter.api.Test
    void testIsOpenCaixa() {
        assertTrue(caixa.getIsCaixaOpen());
    }

    @org.junit.jupiter.api.Test
    void testCadastrarInsumo(){
        assertEquals("Pão", estoque.getInsumo().get(0).getNome());
        assertEquals(10, estoque.getQuantidade().get(0));
    }

    @org.junit.jupiter.api.Test
    void testCadastrarProduto(){
        assertEquals("Big Mac", cardapio.getProdutos().get(0).getNome());
        assertEquals("Pequeno", cardapio.getProdutos().get(0).getTamanho());
    }

    @org.junit.jupiter.api.Test
    void testVendas(){
        venda.adicionarProduto(cardapio.getProdutos().get(0));
        venda.adicionarProduto(cardapio.getProdutos().get(0));
        venda.desconto(25);
        assertEquals(15, venda.getvalorFinal());
    }
}