package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.ClienteDao;
import model.Cliente;

public class ClienteDAOImplementation implements ClienteDao {

	public Cliente c;
	Connection con = null;

	@Override
	public Cliente pesquisar(String login) throws SQLException {

		try {
			con = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM `cliente` WHERE `login` LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				c.setNome(rs.getString("Nome"));
				c.setNasc(rs.getString("Nasc"));
				c.setLogin(rs.getString("Login"));
				c.setSenha(rs.getString("Senha"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			con.close();
		}
		return c;

	}

	@Override
	public void inserir(Cliente cliente) throws SQLException {
		try {
			con = ConnectionFactory.getConnection();
			String sql = "INSERT INTO `cliente` (`codigo`, `nome`, `nasc`, `login`, `senha`)"
					+ " VALUES (NULL, ?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getNasc());
			ps.setString(3, cliente.getLogin());
			ps.setString(4, cliente.getSenha());

			ps.execute();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}
	
//	public void altera(Cliente cliente) {
//	    
//	    try {
//	    	con = ConnectionFactory.getConnection();
//	    	String sql = "update cliente set nome=?, email=?, endereco=?," +
//		            "dataNascimento=? where id=?";
//	        PreparedStatement ps = con.prepareStatement(sql);
//	        ps.setString(1, cliente.getNome());
//	        ps.setString(2, cliente.getEmail());
//	        ps.setString(3, cliente.getEndereco());
//	        ps.setDate(4, new Date(cliente.getDataNascimento()
//	                .getTimeInMillis()));
//	        ps.setLong(5, cliente.getId());
//	        ps.execute();
//	        ps.close();
//	    } catch (SQLException e) {
//	        throw new RuntimeException(e);
//	    }
//	}
//
//	@Override
//	public void excluir(Cliente cliente) throws SQLException {
//		try {
//			con = ConnectionFactory.getConnection();
//			String sql = "delete " +
//	                "from contatos where id=?";
//			PreparedStatement ps = con.prepareStatement(sql);
//	        ps.setLong(1, cliente.getId());
//	        ps.execute();
//	        ps.close();
//	    } catch (SQLException e) {
//	        throw new RuntimeException(e);
//	    }
//	}

//	@Override
//	public List<Cliente> getLista() throws SQLException{
//		try {
//			con = ConnectionFactory.getConnection();
//			List<Cliente> contatos = new ArrayList<Cliente>();
//			PreparedStatement ps = con.prepareStatement("select * from contatos");
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				// criando o objeto Contato
//				Cliente cliente = new Cliente();
//				cliente.setNome(rs.getString("nome"));
//				Calendar data = Calendar.getInstance();
//				data.setTime(rs.getDate("dataNascimento"));
//				cliente.setNasc(data);
//				cliente.setLogin(rs.getString("login"));
//				cliente.setSenha(rs.getString("senha"));
//
//				// adicionando o objeto à lista
//				contatos.add(cliente);
//			}
//			rs.close();
//			ps.close();
//			return contatos;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			con.close();
//		}
//
//	}

}
