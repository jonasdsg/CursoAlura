<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<c:url value="/cadastrar" var="linkCadastro"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<title>Cadastro</title>
	</head>
	<body>
		<form action="${linkCadastro}">
			<div>			
				<label for="nome_empresa"><b> Nome: </b></label>
				<input type="text" name="nome" id="nome_empresa"/>
			</div>
			<div>
				<label for="data_criacao"><b> Data: </b></label>
				<input type="text" name="data" id="data_criacao">
			</div>
			
			<button type="submit">Cadastrar</button>
		</form>
		
	</body>
</html>
</body>
</html>