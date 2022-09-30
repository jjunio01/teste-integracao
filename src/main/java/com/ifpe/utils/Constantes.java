/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.utils;

/**
 *
 * @author Humberto
 */
public final class Constantes {
    
    public static String DRIVER = "com.mysql.jdbc.Driver";
    public static String USER = "root";
    public static String PASSWORD = "root";
    public static String URL = "jdbc:mysql://localhost:3306/ts?useSSL=false";	
    
    
    private Constantes() {
        throw new AssertionError();
    }
}


/*
create database ts;
use ts;
CREATE table professor (nome varchar (50), telefone varchar (30), siape varchar (20) PRIMARY KEY);
create table item (codigo varchar (10) PRIMARY KEY, tipo varchar (30));
create table emprestimo (codigo INT AUTO_INCREMENT PRIMARY KEY, siapeProf varchar (20), codItem varchar (10), FOREIGN KEY (siapeProf) REFERENCES professor(siape), FOREIGN KEY (codItem) REFERENCES item(codigo), dataEmp TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
*/

