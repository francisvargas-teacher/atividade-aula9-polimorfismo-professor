public class CartaoDebito extends Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado via Cartão de débito no valor de " + valor);
    }

    @Override
    public void processarPagamento(double valor, String data) {
        System.out.println("Pagamento realizado via Cartão de d[ebito no valor de " + valor + "na data " + data );
    }
}
