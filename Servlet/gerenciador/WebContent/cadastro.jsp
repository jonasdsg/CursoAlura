<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="br.com.gerenciador.model.Empresa" %>
<c:url value="/cadastrar" var="linkCadastro"></c:url>
<c:url value="/editar" var="linkEdicao"></c:url>
<%
	Empresa empresa = (Empresa) request.getAttribute("empresa");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<title>Cadastro</title>
	</head>
	<body>
		<c:if test="${empresa==null }">		
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
		</c:if>
		<c:if test="${empresa!=null }">
			<form action="${linkEdicao}" method="post">
				<div>			
					<label for="id_empresa"><b> id </b></label>
					<input type="text" name="id" id="id_empresa" value="${empresa.id}" readonly="readonly"/>
				</div>
				<div>			
					<label for="nome_empresa"><b> Nome: </b></label>
					<input type="text" name="nome" id="nome_empresa" value="${empresa.nome}"/>
				</div>
				<div>
					<label for="data_criacao"><b> Data: </b></label>
					<input type="text" name="data" id="data_criacao" value="<fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/>">
				</div>
				
				<button type="submit">editar</button>
			</form>
		</c:if>
	</body>
</html>
</body>
</html>