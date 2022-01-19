package br.recife.ifpe.agenda.model;

public class User {

	private int id;
	private String nome;
	private String username;
	
	public String getNome() {
		return nome;	
	}
	public void setNome(String nome) {
		
		this.nome=nome;
		
	}
	public int getId() {
		return id;	
	}
	public void setId(int id) {
		
		this.id=id;
		
	}
	public String getUsername() {
		
		return username;
	}
	public void setUsername(String username) {
		
		this.username=username;
	}
}
