/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Aluno
 */
public class GuiUtils {
    ImageIcon icon32 = new ImageIcon(getClass().getResource("images/icon32.png"));
    
    public static void mostraMsgSucesso() {
         JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("images/icon32.png"));
    }
    
    public static void mostraMsgFalhaSiapeIgual() {
         JOptionPane.showMessageDialog(null, "A operação falhou. Verifique se os campos estão "
                        + "corretos ou se já não existe um SIAPE com esse número.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgFalhaCodigoIgual() {
         JOptionPane.showMessageDialog(null, "A operação falhou. Verifique se os campos estão "
                        + "corretos ou se já não existe um item com esse cÃ³digo.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
     
    public static void mostraMsgFalhaAoRemoverProfessor() {
          JOptionPane.showMessageDialog(null, "A operaçãoo falhou. Verifique se o SIAPE está correto ou se não existe um "
                        + "empréstimo associado a este professor.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgFalhaAoRemoverItem() {
         JOptionPane.showMessageDialog(null, "A operação falhou. Verifique se o código está correto ou se não existe um "
                        + "empréstimo associado a este item.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static String recebeSiapeParaRemoverProfessor() {
        return (String)JOptionPane.showInputDialog(null, "Siape do professor: ", "IFEmpréstimo", JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("images/icon32.png"), null, null);
    }
    
    public static String recebeCodigoParaRemoverItem() {
        return (String)JOptionPane.showInputDialog(null, "Código do item: ", "IFEmpréstimo", JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("images/icon32.png"), null, null);
    }
    
    public static int mostraTabelaProfessor(JTable professores) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(professores), "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE,
                        JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static int mostraTabelaItem(JTable itens) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(itens), "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE,
                            JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static int mostraTabelaEmprestimo(JTable emprestimos) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(emprestimos), "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE,
                        JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    public static int mostraConfirmacaoEmprestimo(String siapeProf, String codItem) {
        return JOptionPane.showConfirmDialog(null, "Empréstimo para o siape "+siapeProf+" do item "
                                + "com código "+codItem, "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    
    public static int mostraConfirmacaoRemoverEmprestimo(int codEmp) {
        return JOptionPane.showConfirmDialog(null, "Encerrar empréstimo com o código "+codEmp, "IFEmpréstimo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static void mostraMsgTodosItensEmprestados() {
         JOptionPane.showMessageDialog(null, "Não há mais itens disponíveis para empréstimo.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
    
    public static void mostraMsgTelefoneInvalido() {
         JOptionPane.showMessageDialog(null, "O telefone digitado não é válido.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgSiapeInvalido() {
         JOptionPane.showMessageDialog(null, "O siape digitado não é váliddo.", "IFEmpréstimo", JOptionPane.ERROR_MESSAGE);
    }
    
}
