/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.professor;

import com.ifpe.ado.professor.IRepositorioProfessor;
import com.ifpe.ado.professor.RepositorioProfessor;

/**
 *
 * @author Humberto
 */
public class ControladorProfessor {
    
    private IRepositorioProfessor repProf;
    
    
    public ControladorProfessor() {
        repProf = new RepositorioProfessor();
    }
    
    
    public int inserir(Professor p) {
        return repProf.inserir(p);
    }
    
    public int remover(String siape) {
        return repProf.remover(siape);
    }
    
}
