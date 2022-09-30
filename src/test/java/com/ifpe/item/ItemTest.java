package com.ifpe.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.utils.DbUtils;

public class ItemTest {
	
private static DbUtils db = new DbUtils();
	
	@Before
	public void init() throws Exception {
		db.abrirConexao();
	}

	@Test(expected = SQLException.class)
	public void inserirTest() throws SQLException {
		Item novoItem = new Item("123","Cabo USB");
		RepositorioItem repItem = new RepositorioItem();
		repItem.inserir(novoItem);
		assertFalse(throwException());
		
	}
	
	private boolean throwException() throws SQLException{
        throw new SQLException();
    }

	@Test
	public void RemoverTest() {
		Item novoItem = new Item("007","Teclado");
		RepositorioItem repItem = new RepositorioItem();
		repItem.inserir(novoItem);
		int i = repItem.remover("007");
		assertEquals(1, i);
	}
	
	@After
	public void fechar() throws Exception {
		db.fecharConexao();
	}

}
