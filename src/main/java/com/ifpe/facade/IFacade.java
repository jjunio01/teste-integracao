/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.facade;

import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.item.Item;
import com.ifpe.professor.Professor;

/**
 *
 * @author Humberto
 */
public interface IFacade {
    
    public int inserirProfessor(Professor p);
    public int removerProfessor(String siape);
    
    public int inserirItem(Item i);
    public int removerItem(String codigo);
    
    public int inserirEmprestimo(Emprestimo e);
    public int removerEmprestimo(int id);
    
}
