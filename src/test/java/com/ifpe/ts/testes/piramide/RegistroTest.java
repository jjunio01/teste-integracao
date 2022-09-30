package com.ifpe.ts.testes.piramide;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.professor.Professor;
import com.ifpe.utils.DbUtils;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class RegistroTest {
	
	private static DbUtils db = new DbUtils();
	
	@Before
	public void init() throws Exception {
		db.abrirConexao();
	}
	
	@Test(expected = SQLException.class)
	public void insertTest() throws TelefoneInvalidoException, SiapeInvalidoException, SQLException  {
		
        Professor prof = new Professor("Humberto", "81999074393", "1408701");
        RepositorioProfessor repProf = new RepositorioProfessor();
        repProf.inserir(prof);
        assertFalse(throwException());
        
        
	}
	private boolean throwException() throws SQLException{
        throw new SQLException();
    }
	
	@Test
	public void removerTest() throws TelefoneInvalidoException, SiapeInvalidoException {
		Professor prof = new Professor("Humberto", "81999074393", "1408722");
        RepositorioProfessor repProf = new RepositorioProfessor();
        repProf.inserir(prof);
        int i = repProf.remover("1408722");
        assertEquals(1, i);
	}
	
	@After
	public void fechar() throws Exception {
		db.fecharConexao();
	}
}
