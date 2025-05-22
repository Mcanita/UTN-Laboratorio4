<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String valorSelect ="";
String valorRadio ="";
String valorChk1 ="";
String valorChk2 ="";

if(request.getParameter("btnAceptar")!= null)
{
	valorSelect = request.getParameter("pais");
	valorRadio = request.getParameter("tecnologias");
	valorChk1 = request.getParameter("chk1");
	valorChk2 = request.getParameter("chk2");
}

%>

<h1>Elementos seleccionados</h1>
Descolgable:
<%=valorSelect %>
<br>
RadioButton:
<%=valorRadio %>
<br>
Checkbox:
<%=valorChk1 %> <%=valorChk2 %>



</body>
</html>