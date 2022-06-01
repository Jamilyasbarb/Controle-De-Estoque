
package com.mycompany.produtosapp;

import java.util.Calendar;
import java.util.Date;


public class Movimento {
    private String id;
    private Date data;
    private double quant;
    
    public Movimento(){
        
    }

    public Movimento(String id, Date data, int quant) {
        this.id = id;
        this.data = data;
        this.quant = quant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }
}
