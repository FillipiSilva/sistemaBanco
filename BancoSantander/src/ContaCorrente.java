public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public void depositoCheque(Cheque cheque){

        Cheque preencher = new Cheque();

        preencher.preencherCheque();
        this.saldo += preencher.getValorCheque();
        System.out.println("O valor do cheque depositado foi de R$" + preencher.getValorCheque());

    }

}
