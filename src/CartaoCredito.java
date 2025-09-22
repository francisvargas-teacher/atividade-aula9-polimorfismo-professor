public class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado via Cartão de Crédito no valor de " + valor);
    }

    @Override
    public void processarPagamento(double valor, String data) {
        System.out.println("Pagamento processado via Cartão de Crédito no valor de " + valor + "na data " + data);
    }
    public void processarPagamento(double valor, String data, int parcelas){
        System.out.println("Pagamento processado via Cartão de Crédito no valor de " + valor + "Em " + parcelas +"Parcelas" + "na data " + data);
    }

}
