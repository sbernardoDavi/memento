public class ProdutoEmEstoque implements ProdutoEstado{

    private ProdutoEmEstoque() {};
    private static ProdutoEmEstoque instance = new ProdutoEmEstoque();
    public static ProdutoEmEstoque getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em estoque";
    }
}
