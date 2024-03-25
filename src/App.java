import br.senai.devtubaraosc.model.ContaCorrente;

public class App {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 5.0);
        System.out.println();
        System.out.println("Saldo inicial: " + conta.getSaldo());
        System.out.println();
        conta.depositar(500);
        System.out.println();
        System.out.println("Novo saldo após depósito: " + conta.getSaldo());
        System.out.println();
        conta.sacar(200);
        System.out.println();
        System.out.println("Novo saldo após saque: " + conta.getSaldo());

    }
}
