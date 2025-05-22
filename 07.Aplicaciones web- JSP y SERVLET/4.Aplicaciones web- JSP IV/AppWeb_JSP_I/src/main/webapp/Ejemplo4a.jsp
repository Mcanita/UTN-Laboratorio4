<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Ejemplo4b.jsp" method="get">

<b>Seleccione un pais:</b>

	<select name="pais">
	<option>Mexico</option>
	<option>Colombia</option>
	<option>Chile</option>
	<option>Perú</option>
	<option>Argentina</option>
	<option>España</option>

</select>

<br/>
<br/>

<b>Seleccione un idioma:</b>

Java 		<input type="radio" name="tecnologias" value="Java" >
PHP			<input type="radio" name="tecnologias" value="PHP" >
JavaScript	<input type="radio" name="tecnologias" value="JavaScript" >

<br />
<br />

<b>Seleccione experiencia:</b>

Programador  		<input type="checkbox" name="chk1" value="Programador" >
Soporte técnico		<input type="checkbox" name="chk2" value="Soporte técnico" >

<input type="submit" value ="Aceptar" name="btnAceptar">





</form>

</body>
</html>