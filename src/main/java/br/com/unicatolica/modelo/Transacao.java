package br.com.unicatolica.modelo;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public abstract class Transacao {
    private String descricao;
    private double valor;
    private String data;

    public Transacao(String descricao,double valor, String data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    public abstract double calcularImpacto();

    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
    public String getData() { return data; }


}


