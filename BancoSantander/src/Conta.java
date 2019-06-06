import java.util.Scanner;

public class Conta{

    private Cliente cliente;
    protected double saldo = 0;
    protected double valorDeposito;
    protected double valorSaque;

    public Conta() {
    }

    Scanner dado = new Scanner(System.in);

    public void fazerDepositos(){

        System.out.print("Digite o valor a ser depositado: ");
        this.valorDeposito = dado.nextDouble();
        this.saldo += this.valorDeposito;
        System.out.println("Depósito de R$" + this.valorDeposito + " realizado com sucesso!");

    }

    public double sacarDinheiro(){

        System.out.print("Digite o valor a ser sacado: ");
        this.valorSaque = dado.nextDouble();

        if (this.valorSaque > this.saldo){
            System.out.println("Saldo insuficiente\nSeu saldo é de R$" + this.saldo);
            return this.saldo;
        } else {
            this.saldo -= this.valorSaque;
            System.out.println("Saque de R$" + this.valorSaque + " realizado com sucesso!");
            return this.saldo;
        }

    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é de R$" + this.saldo);
    }

}
