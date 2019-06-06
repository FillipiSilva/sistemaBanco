public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        ContaPoupanca contaP = new ContaPoupanca();
        ContaCorrente contaC = new ContaCorrente();
        Cheque cheque = new Cheque();

//        cliente.preencherDados();
//        conta.fazerDepositos();
//        conta.sacarDinheiro();
//        conta.consultarSaldo();

//        contaP.fazerDepositos();
//        contaP.recolherJuros();
//        contaP.consultarSaldo();


        contaC.depositoCheque(cheque);
        contaC.fazerDepositos();
        contaC.consultarSaldo();





    }
}
