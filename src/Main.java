//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Boleto pagamentoBoleto = new Boleto();
        pagamentoBoleto.processarPagamento(10,"22 de setembro de 2025");
        Pix pagamentoPix = new Pix();
        pagamentoPix.processarPagamento(30,"21 de setembro de 2025");
        CartaoCredito pagamentoCartaoCredito = new CartaoCredito();
        pagamentoCartaoCredito.processarPagamento(10,"22 de setembro de 2025", 5);
        CartaoDebito pagamentoCartaoDebito = new CartaoDebito();
        pagamentoCartaoDebito.processarPagamento(10);
    }
}