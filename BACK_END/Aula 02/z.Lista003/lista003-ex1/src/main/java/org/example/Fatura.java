package org.example;

public class Fatura {
    private String numero;
    private String descricao;
    private Integer qtde;
    private Double precoPorItem;

    public Fatura (String numero, String descricao, Integer qtde, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;

        if (qtde < 0) {
            this.qtde = 0;
        } else {
            this.qtde = qtde;
        }

        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde () {
        return qtde;
    }

    public void setQtde (int qtde) {
        if (qtde < 0){
            this.qtde = 0;
        } else {
            this.qtde = qtde;
        }
    }

    public double getPrecoPorItem () {
        return precoPorItem;
    }

    public void setPrecoPorItem (double precoPorItem) {
        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public double getTotalFatura() {
        return qtde * precoPorItem;
    }

}
