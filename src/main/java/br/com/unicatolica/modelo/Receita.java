package br.com.unicatolica.modelo;

import br.com.unicatolica.modelo.Transacao;

public class Receita extends Transacao {

    public Receita(String descricao, double valor, String data) {
        super(descricao, valor, data);
    }

    @Override
    public double calcularImpacto() {
        return getValor(); // soma
    }
}