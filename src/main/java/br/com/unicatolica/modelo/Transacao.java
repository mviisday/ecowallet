package br.com.unicatolica.modelo;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public abstract class Transacao {
    private long id;
    private static long contador = 0;

    private String descricao;
    private double valor;
    private String data;

    public Transacao(String descricao,double valor, String data) {
        this.id = ++contador;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    public abstract double calcularImpacto();

    public long getId() { return id;

    }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
    public String getData() { return data; }


}


