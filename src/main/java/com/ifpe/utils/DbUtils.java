/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.utils;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.conexaodb.Banco;
import com.ifpe.professor.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class DbUtils extends Banco {
  
    public ResultSet listar(String query) {
        ResultSet rs = null;
        try {
            super.abrirConexao();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement ps = null;
               
        try {
            ps = con.prepareStatement(query); 
            rs = ps.executeQuery();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return rs;
    }
    
   
    
    public DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException, Exception {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        super.fecharConexao();

        return new DefaultTableModel(data, columnNames);

    }
    
    public static String selectEmprestimo() {
        return "SELECT * FROM emprestimo";
    }
    public static String selectItem() {
        return "SELECT i.codigo, i.tipo FROM item i LEFT JOIN emprestimo e ON e.codItem = i.codigo WHERE e.codItem IS NULL";
    }
    public static String selectProfessor() {
        return "SELECT * FROM professor";
    }
    
}
