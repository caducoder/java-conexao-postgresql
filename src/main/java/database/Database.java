package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import objetos.Aluno;

public class Database {
	private final String url = "jdbc:postgresql://localhost:5432/faculdade";
	private final String user = "postgres";
	private final String password = ""; //colocar senha
	
	public Connection connect() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to PostgreSQL database successfully.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public void inserirAluno(Aluno aluno) {
		Connection conn = connect();
		String SQL = "INSERT INTO alunos(nome, senha) VALUES(?, ?)";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(SQL);
			pstm.setString(1, aluno.getNome());
			pstm.setString(2, aluno.getSenha());
			
			pstm.execute();
			pstm.close();
			System.out.println("Aluno adicionado ao banco.");
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
