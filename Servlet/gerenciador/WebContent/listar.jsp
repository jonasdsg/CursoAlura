<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page import="br.com.gerenciador.data.Banco" %>
<%@ page import="br.com.gerenciador.model.Empresa" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="cadastro.html">Voltar</a>
 	<ul> 	
		<c:forEach items="${Banco.list()}" var="empresa">
			<li>${empresa.nome}</li>	
		</c:forEach>
 	</ul>
</body>
</html>