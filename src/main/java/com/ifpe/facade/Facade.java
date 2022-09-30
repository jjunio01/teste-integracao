/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.facade;

import com.ifpe.emprestimo.ControladorEmprestimo;
import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.item.ControladorItem;
import com.ifpe.item.Item;
import com.ifpe.professor.ControladorProfessor;
import com.ifpe.professor.Professor;

/**
 *
 * @author Humberto
 */
public class Facade implements IFacade{
    
    private ControladorProfessor controlProfessor;
    private ControladorItem controlItem;
    private ControladorEmprestimo controlEmprestimo;
    
    public Facade() {
        controlProfessor = new ControladorProfessor();
        controlItem = new ControladorItem();
        controlEmprestimo = new ControladorEmprestimo();
    }

    @Override
    public int inserirProfessor(Professor p) {
        return controlProfessor.inserir(p);
    }

    @Override
    public int removerProfessor(String siape) {
        return controlProfessor.remover(siape);
    }

    @Override
    public int inserirItem(Item i) {
       return controlItem.inserir(i);
    }

    @Override
    public int removerItem(String codigo) {
        return controlItem.remover(codigo);
    }

    @Override
    public int inserirEmprestimo(Emprestimo e) {
        return controlEmprestimo.inserir(e);
    }

    @Override
    public int removerEmprestimo(int id) {
        return controlEmprestimo.remover(id);
    }
    
    
}
