/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.professor;

import com.ifpe.conexaodb.Banco;
import com.ifpe.professor.Professor;
import com.ifpe.utils.Constantes;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Humberto
 */
public class RepositorioProfessor extends Banco implements IRepositorioProfessor{
   
    
    String queryInsert = "INSERT INTO professor(nome, telefone, siape)" + "VALUES (?, ?, ?)";
    String queryRemove = "DELETE FROM professor WHERE siape = ?";
    
    @Override
    public int inserir(Professor p) {
        int status = 0;
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(queryInsert);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getTelefone());
            ps.setString(3, p.getSiape());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public int remover(String siape) {
        int status = 0;
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(queryRemove);
            ps.setString(1, siape);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
   
    
}
