public class ProdutoEsgotado implements ProdutoEstado{

    private ProdutoEsgotado() {};
    private static ProdutoEsgotado instance = new ProdutoEsgotado();
    public static ProdutoEsgotado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Esgotado";
    }
}
