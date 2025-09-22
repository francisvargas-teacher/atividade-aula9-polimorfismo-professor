import java.sql.SQLOutput;

public class Boleto extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento Processado via Boleto no valor de " + valor);
    }

    @Override
    public void processarPagamento(double valor, String data) {
        System.out.println("Pagamento Processado via Boleto no valor de " + valor);
    }
}
