<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="br.com.gerenciador.data.Banco" %>
<%@ page import="br.com.gerenciador.model.Empresa" %>
<c:url value ="/cadastro.jsp" var="cadastroForm"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${cadastroForm}">Voltar</a>
 	<ul> 	
		<c:forEach items="${Banco.list()}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yy"/></li>	
		</c:forEach>
 	</ul>
</body>
</html>