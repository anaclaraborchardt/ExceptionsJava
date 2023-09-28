public class Conta {

    private int numero;
    private double saldo;
    Banco banco = new Banco();

    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    //Throws + Classe da exceção = garante tratamento da exceção - checked exceptions
    void saque(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if(this.saldo < valor){
            //Exceção em tempo de execução
            //Throw = lança a exceção
            throw new SaldoInsuficienteException("Usuário");
        }
        if(valor <= 0){
            throw new ValorInvalidoException();

        }if(banco.getSaldoCaixa() < valor){
            throw new SaldoInsuficienteException("Caixa");
        }

        this.saldo-=valor;
    }

    void deposito(double valor){
        if(valor < 0){
            throw new RuntimeException("Você não pode depositar um valor negativo");
        }
        this.saldo+=valor;

    }

    void transferencia(double valor, int numero){
        if(valor < 0){
            throw new RuntimeException("Você não pode transferir um valor negativo");
        }
        for(Conta conta : Main.contas){
            if(numero != conta.getNumero()){
                throw new RuntimeException("Conta não existe");
            }
        }

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
