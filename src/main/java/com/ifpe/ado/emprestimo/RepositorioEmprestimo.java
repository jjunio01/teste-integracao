/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.emprestimo;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.conexaodb.Banco;
import com.ifpe.emprestimo.Emprestimo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class RepositorioEmprestimo extends Banco implements IRepositorioEmprestimo {
    int status = 0;
    String query = "INSERT INTO emprestimo(siapeProf, codItem, dataEmp)" + "VALUES (?, ?, ?)";
    String queryRemove = "DELETE FROM emprestimo WHERE codigo = ?";
    
    @Override
    public int efetuarEmprestimo(Emprestimo e) {
        
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
         PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, e.getSiapeProf());
            ps.setString(2, e.getCodItem());
            ps.setString(3, e.getData());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
         try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return status;
    }

    @Override
    public int removerEmprestimo(int id) {
        int status = 0;
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(queryRemove);
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
     
    
}
