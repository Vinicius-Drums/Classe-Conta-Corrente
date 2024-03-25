package br.senai.devtubaraosc.model;

public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao;

    public ContaCorrente(double saldoInicial, double taxaDeOperacao) {
        super(saldoInicial);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaDeOperacao;
        if (valorComTaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque de " + valor + " realizado com sucesso. Taxa de operação: " + taxaDeOperacao);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
