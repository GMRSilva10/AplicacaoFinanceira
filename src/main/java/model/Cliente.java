package model;

public class Cliente {
	private String nome;
	private String nasc;
	private String login;
	private String senha;
	
	public Cliente(String nome, String nasc, String login, String senha) {
		super();
		this.nome = nome;
		this.nasc = nasc;
		this.login = login;
		this.senha = senha;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
