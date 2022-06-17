public class ProdutoEnviado implements ProdutoEstado{

    private ProdutoEnviado() {};
    private static ProdutoEnviado instance = new ProdutoEnviado();
    public static ProdutoEnviado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Enviado";
    }
}
