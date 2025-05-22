<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="Ejemplo2.jsp">
Ingrese su nombre: <input type= "text" name= "txtNombre" />
<input type="submit" name="btnSaludar" value="Saludar" />
<input type="submit" name="btnDespedir" value="Despedir" />
</form>

<%
String texto = "";
if(request.getParameter("btnDespedir")!= null)
{
	texto = "adios "+ request.getParameter("txtNombre");
}
if(request.getParameter("btnSaludar")!= null)
{
	texto = "hola "+ request.getParameter("txtNombre");
}

%>

<%=texto%>

<!--  alternativa -->
<br><br>

<%
if(request.getParameter("btnDespedir")!=null)
{
	%>
	Adios  <%=request.getParameter("txtNombre") %>
	<% 
}

%>




</body>
</html>