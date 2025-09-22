public class Pix extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado via Pix no valor de " + valor);
    }

    @Override
    public void processarPagamento(double valor, String data) {
        System.out.println("Pagamento realizado via Pix no valor de " + valor + "na data " + data);
    }
}
