<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hola</h1>

<!-- Declaracion  -->
<%! String nombre = "Pepe"; %>
<%! Integer edad = 50; %>

<!--  Scriptlet  -->
<% nombre = "Jose"; edad =20; %>

<!--  Expresion  -->
<%=nombre %>
<%=edad %>



</body>
</html>