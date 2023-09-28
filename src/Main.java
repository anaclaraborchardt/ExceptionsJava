import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Conta conta = new Conta(50, 1);
    static Conta conta2 = new Conta(100, 2);
    static Conta contaLogada = conta;
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Conta> contas = new ArrayList<>(List.of(conta, conta2));

    public static void main(String[] args) {
        contaLogada.setSaldo(300);

        metodo2();
        System.out.println(contaLogada.getSaldo());
    }

    //O valorInvalidoException é checado, logo tem que dar "throws ValorInvalidoException,
    // caso quisesse retornar"
    //caso lançasse o throw novamente, ele teria que ir passando para frente, portanto
    //printamos a exceção

    static void metodo2() {
        try {
            System.out.println("Digite valor");
            double valor = sc.nextDouble();
            contaLogada.saque(valor);
        }catch(ValorInvalidoException valorInvalidoException){
            System.out.println(valorInvalidoException);
        }
    }

}
