public abstract class Pagamento {

    private double valor;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private String data;

    public abstract void processarPagamento(double valor);

    public abstract void processarPagamento(double valor, String data);
}
