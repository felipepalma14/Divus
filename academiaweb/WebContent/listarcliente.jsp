<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="br.com.divus.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem de clientes</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Telefone</th>
		</tr>

		<c:forEach var="cliente" items="${clientes}">
			<tr>
				<td>${cliente.getId()}</td>
				<td align='center'>${cliente.getNome()}</td>
				<td align='center'><a href="consultarclienteservlet?id=${cliente.getCpf()}">${cliente.getCpf()}</a></td>
				<td align='center'>${cliente.getTelefone()}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>

<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="br.com.divus.model.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Cliente</title>
</head>
<body>
	<%
		List<Cliente> clientes = (List) request.getAttribute("clientes");
		for(Cliente cliente : clientes){
			out.println("<h5>"+cliente+"</h5>");
		}
	%>
</body>
</html> --%>