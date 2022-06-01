
package com.mycompany.produtosapp;

import java.util.ArrayList;
import java.util.List;


public class Produtos {
    private int id;
    private String descricao;
    private double quant;
    private double valorUnit;
    private boolean clicando;
    private List<Movimento> listaMovto;
    
    public Produtos(){
        listaMovto = new ArrayList<Movimento>();
    }

    public Produtos(int id, String descricao, double quant, double valorUnit, boolean clicando) {
        this.id = id;
        this.descricao = descricao;
        this.quant = quant;
        this.valorUnit = valorUnit;
        this.clicando = false;
        listaMovto = new ArrayList<Movimento>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }
    
    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
    
    public boolean getClicando() {
        return clicando;
    }
    
    public void setClicando(boolean clicando){
        this.clicando = clicando;
    }
    
    public Double getTotal() {
        return this.valorUnit * this.getQuant();
    }
    
    public void addMovimento(Movimento m) {
        this.listaMovto.add(m);
        this.quant = this.quant + m.getQuant();
    }
    
    public List<Movimento> getList(){
        return this.listaMovto;
    }
}
