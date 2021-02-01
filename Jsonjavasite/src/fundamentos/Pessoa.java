package fundamentos;

import java.io.Serializable;


public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String nome;
	String sexo;
	String email;
	int idade;
	int id;

	public Pessoa(){
		
		
		
	}
	public Pessoa(String nome, String sexo, String email, Integer idade, Integer id){
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.idade = idade;
		this.id = id;

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
}
