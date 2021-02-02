<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.gerenciador.data.Banco" %>
<%@ page import="br.com.gerenciador.model.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<% 	for(Empresa emp: Banco.list()){
			out.print("<li>"+emp.getNome()+"</li>");
		} %>
	</ul>
</body>
</html>