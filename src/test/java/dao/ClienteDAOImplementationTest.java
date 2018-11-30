package dao;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.Test;

import model.Cliente;

public class ClienteDAOImplementationTest {

	ClienteDAOImplementation clienteDao;

	@Test
	public void adicionarCliente() throws ParseException {		
		try {
			clienteDao = new ClienteDAOImplementation();
			Cliente c = new Cliente("Andrei", "05/03/1995", "Andrei", "275926");
			clienteDao.inserir(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void pesquisarCliente() throws ParseException {		
		try {
			String login = "Andrei";
			clienteDao.pesquisar(login);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// public void naoCriaNegocioComDataNula() {
	// new Negocio(10, 5, null);
	// }

}
