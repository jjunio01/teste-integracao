/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.item;

import com.ifpe.item.Item;

/**
 *
 * @author Humberto
 */
public interface IRepositorioItem {
    
    public int inserir(Item i);
    public int remover(String codigo);
    
}
