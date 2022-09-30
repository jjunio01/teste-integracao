/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.emprestimo;

/**
 *
 * @author Aluno
 */
public class Emprestimo {
    
    private String siapeProf, codItem, data;

    public Emprestimo(String siapeProf, String codItem, String data) {
        this.siapeProf = siapeProf;
        this.codItem = codItem;
        this.data = data;
    }

    public String getSiapeProf() {
        return siapeProf;
    }

    public void setSiapeProf(String siapeProf) {
        this.siapeProf = siapeProf;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
