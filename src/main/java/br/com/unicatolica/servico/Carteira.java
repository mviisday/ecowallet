package br.com.unicatolica.servico;

import br.com.unicatolica.modelo.Transacao;

import java.util.ArrayList;
import java.util.List;

public class Carteira {

    private List<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public double calcularSaldo() {
        double saldo = 0;

        for (Transacao t : transacoes) {
            saldo += t.calcularImpacto();
        }

        return saldo;
    }
}