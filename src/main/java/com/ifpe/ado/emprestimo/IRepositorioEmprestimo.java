/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.emprestimo;

import com.ifpe.emprestimo.Emprestimo;

/**
 *
 * @author Aluno
 */
public interface IRepositorioEmprestimo {
    
    public int efetuarEmprestimo(Emprestimo e);
    public int removerEmprestimo(int id);
}
