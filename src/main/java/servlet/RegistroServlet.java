package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;
import objetos.Aluno;


public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		Aluno a = new Aluno(nome, senha);
		
		Database banco = new Database();
		
		banco.inserirAluno(a);
		
		response.sendRedirect("registrado.jsp");
		
		//doGet(request, response);
	}

}
