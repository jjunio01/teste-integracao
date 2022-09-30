/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.professor;

import com.ifpe.professor.Professor;

/**
 *
 * @author Humberto
 */
public interface IRepositorioProfessor {
    
    public int inserir(Professor p);
    public int remover(String siape);
}
