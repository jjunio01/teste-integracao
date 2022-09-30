/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.ado.item;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.conexaodb.Banco;
import com.ifpe.item.Item;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Humberto
 */
public class RepositorioItem extends Banco implements IRepositorioItem{
    int status = 0;
    String query = "INSERT INTO item(codigo, tipo)" + "VALUES (?, ?)";
    String queryRemove = "DELETE FROM item WHERE codigo = ?";
    
    @Override
    public int inserir(Item i) {
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        }
         PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, i.getCodigoItem());
            ps.setString(2, i.getTipoItem());
            status = ps.executeUpdate();
            System.out.println(status);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
         try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        }
         return status;
    }

    @Override
    public int remover(String codigo) {
       int status = 0;
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(queryRemove);
            ps.setString(1, codigo);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        try {
            super.fecharConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
}
