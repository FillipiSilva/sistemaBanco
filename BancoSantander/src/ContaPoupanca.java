public class ContaPoupanca extends Conta{

    private double taxaJuros = 0.007;

    public void recolherJuros(){
        this.taxaJuros = this.taxaJuros * saldo;
        System.out.println("A sua taxa a recolher é R$" + this.taxaJuros);
        this.saldo += this.taxaJuros;
    }

}
