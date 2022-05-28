<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<form action="RegistroServlet" method="POST">
		<label for="input-1">Nome</label>
		<input id="input-1" name="nome" placeholder="Digite seu nome" type="text"/>
		<br /><br />
		<label for="input-2">Senha</label>
		<input id="input-2" name="senha" placeholder="Digite sua senha" type="password"/>
		<br />
		<input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>