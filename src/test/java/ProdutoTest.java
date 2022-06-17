import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void deveArmazenarEstados() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEnviado.getInstance());
        produto.setEstado(ProdutoVendido.getInstance());
        assertEquals(2, produto.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEmEstoque.getInstance());
        produto.setEstado(ProdutoEnviado.getInstance());
        produto.restauraEstado(0);
        assertEquals(ProdutoEmEstoque.getInstance(), produto.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEnviado.getInstance());
        produto.setEstado(ProdutoEmEstoque.getInstance());
        produto.setEstado(ProdutoVendido.getInstance());
        produto.setEstado(ProdutoEsgotado.getInstance());
        produto.restauraEstado(2);
        assertEquals(ProdutoVendido.getInstance(), produto.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Produto produto = new Produto();
            produto.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }



}