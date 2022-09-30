/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.professor;

import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Humberto
 */
public class Professor {
    
    private String nome, telefone, siape;
    
    public Professor () {}
    
    public Professor(String nome, String telefone, String siape) throws TelefoneInvalidoException, SiapeInvalidoException{
        this.nome = nome;
        if(!validaNumTelefone(telefone)) {
            throw new TelefoneInvalidoException("Telefone inválido!");
        } else {
            this.telefone = telefone;
        } if(!validaSiape(siape)) {
            throw new SiapeInvalidoException("Siape inválido!");
        } else {
            this.siape = siape;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
       
    }
    
    public boolean validaSiape(String siape) {
        return (siape.length() == 7);
    }
    
    public boolean validaNumTelefone(String phoneNumber){
        boolean isValid = false;
        /* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn
                ^\\(? : May start with an option "(" .
                (\\d{3}): Followed by 3 digits.
                \\)? : May have an optional ")" 
                [- ]? : May have an optional "-" after the first 3 digits or after optional ) character. 
                (\\d{3}) : Followed by 3 digits. 
                 [- ]? : May have another optional "-" after numeric digits.
                 (\\d{4})$ : ends with four digits.
                 Examples: Matches following phone numbers:
                 (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890
        */
        //Initialize reg ex for phone number. 
        String expression = "^\\(?(\\d{2})\\)?[- ]?(\\d{5})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        } 
        return isValid;
     }
    
    
}
