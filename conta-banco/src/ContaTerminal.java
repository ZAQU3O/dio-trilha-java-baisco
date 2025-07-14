import java.util.Scanner;

public class ContaTerminal {

    // Atributos da conta
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor da classe ContaTerminal
    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters para acessar os atributos
    public int getNumeroConta() {
        return numeroConta;
    }   

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        String status = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.",
                getNomeCliente(), getAgencia(), getNumeroConta(), getSaldo());
        return status;
    }

    public double Depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        return this.saldo;
    }

    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do cliente
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Cria uma nova conta
        ContaTerminal conta01 = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        // Exibe os dados da conta
        System.out.println(conta01.toString());

        scanner.close();

    }
}
