

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
</html>