/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.item;

import com.ifpe.ado.item.IRepositorioItem;
import com.ifpe.ado.item.RepositorioItem;

/**
 *
 * @author Humberto
 */
public class ControladorItem {
    
    private IRepositorioItem repItem;
    
    public ControladorItem() {
        repItem = new RepositorioItem();
    }
    
    public int inserir(Item i) {
       return repItem.inserir(i);
    }
    
    public int remover(String codigo) {
        return repItem.remover(codigo);
    }
}
