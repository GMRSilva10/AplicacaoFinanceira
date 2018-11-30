package controller;

import java.sql.SQLException;

import model.Cliente;

public interface ClienteDao {
	public Cliente pesquisar(String login) throws SQLException;
	public void inserir(Cliente cliente) throws SQLException;
//	public void alterar(Cliente cliente) throws SQLException;
//	public void excluir(Cliente cliente) throws SQLException;
//	public List<Cliente> getLista() throws SQLException;

}
