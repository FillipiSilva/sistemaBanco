import java.util.Scanner;

public class Cliente {

    private int numerodeCliente;
    private String sobrenome;
    private String cpf;
    private String rg;

    public int getNumerodeCliente() {
        return numerodeCliente;
    }

    public void setNumerodeCliente(int numerodeCliente) {
        this.numerodeCliente = numerodeCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Cliente(int numerodeCliente, String sobrenome, String cpf, String rg) {
        this.numerodeCliente = numerodeCliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Cliente() {
    }

    Scanner dado = new Scanner(System.in);

    public void preencherDados(){

        System.out.println("Preencha o numero da conta");
        this.numerodeCliente = dado.nextInt();

        System.out.println("Preencha seu CPF");
        this.cpf = dado.next();

        System.out.println("Preencha seu RG");
        this.rg = dado.next();

        System.out.println("Preencha seu sobrenome");
        this.sobrenome = dado.next();

    }
}
