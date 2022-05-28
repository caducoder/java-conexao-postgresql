package objetos;

public class Aluno {

	public String nome;
	public String senha;
	
	public Aluno(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public Aluno() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
