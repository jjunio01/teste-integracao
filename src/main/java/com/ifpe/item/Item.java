/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.item;

/**
 *
 * @author Humberto
 */
public class Item {
    
    private String tipoItem, codigoItem;
    
    public Item(String codigoItem, String tipoItem) {
        this.codigoItem = codigoItem;
        this.tipoItem = tipoItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }
            
    
    
}
