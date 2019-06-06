import java.util.Scanner;

public class Cheque{

    private double valorCheque;
    private String bancoEmissor;
    private String dataPagamento;

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    Scanner dado = new Scanner(System.in);

    public void preencherCheque(){

        System.out.print("Preencha o valor do cheque: ");
        valorCheque = dado.nextDouble();

        System.out.print("Preencha o banco emissor: ");
        bancoEmissor = dado.next();

        System.out.print("Preencha a data de pagamento: ");
        dataPagamento = dado.next();


    }

}
