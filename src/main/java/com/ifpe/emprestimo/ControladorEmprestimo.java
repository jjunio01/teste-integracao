/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.emprestimo;

import com.ifpe.ado.emprestimo.IRepositorioEmprestimo;
import com.ifpe.ado.emprestimo.RepositorioEmprestimo;

/**
 *
 * @author Aluno
 */
public class ControladorEmprestimo {
    private IRepositorioEmprestimo repEmprestimo;
    
    public ControladorEmprestimo() {
        repEmprestimo = new RepositorioEmprestimo();
    }
    
    public int inserir(Emprestimo e) {
       return repEmprestimo.efetuarEmprestimo(e);
    }
    
    public int remover(int id) {
        return repEmprestimo.removerEmprestimo(id);
    }
}
