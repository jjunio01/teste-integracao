package com.ifpe.emprestimo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.item.Item;
import com.ifpe.professor.Professor;
import com.ifpe.utils.DbUtils;

public class EmprestimoTest {
	
	private static DbUtils db = new DbUtils();
	
	@Before
	public void init() throws Exception {
		db.abrirConexao();
	}

	@Test
	public void inserirTest() throws TelefoneInvalidoException, SiapeInvalidoException {
		
		Professor prof = new Professor("Junio", "81696969669", "1408709");
        RepositorioProfessor repProf = new RepositorioProfessor();
        repProf.inserir(prof);
        Item novoItem = new Item("001","Monitor");
		RepositorioItem repItem = new RepositorioItem();
		repItem.inserir(novoItem);
		Emprestimo novoEmprestimo = new Emprestimo("1408709", "001", "30/09/2022");
		RepositorioEmprestimo repoEmprest = new RepositorioEmprestimo();
		repoEmprest.efetuarEmprestimo(novoEmprestimo);
		
	}
	
	@Test
	public void removerItem() throws TelefoneInvalidoException, SiapeInvalidoException {
		
		Professor prof = new Professor("Junio", "81696969669", "1408705");
        RepositorioProfessor repProf = new RepositorioProfessor();
        repProf.inserir(prof);
        Item novoItem = new Item("002","Monitor");
		RepositorioItem repItem = new RepositorioItem();
		repItem.inserir(novoItem);
		Emprestimo novoEmprestimo = new Emprestimo("1408705", "002", "20/09/2022");
		RepositorioEmprestimo repoEmprest = new RepositorioEmprestimo();
		repoEmprest.efetuarEmprestimo(novoEmprestimo);
		
	}
	
	@After
	public void fechar() throws Exception {
		db.fecharConexao();
	}

}
