public class ProdutoVendido implements ProdutoEstado{

    private ProdutoVendido() {};
    private static ProdutoVendido instance = new ProdutoVendido();
    public static ProdutoVendido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendido";
    }
}
