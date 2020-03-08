<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math</title>
</head>
<body>
	<%
		String errorA = "";
		if (request.getAttribute("errorA") != null) {
			errorA = (String) request.getAttribute("errorA");
		}
		String errorB = "";
		if (request.getAttribute("errorB") != null) {
			errorB = (String) request.getAttribute("errorB");
		}
		String a;
		String b;
		int c;
		if (request.getAttribute("parametaraA") != null) {
			a = (String) request.getAttribute("parametaraA");
		} else {
			a = "0";
		}
		if (request.getAttribute("parametaraB") != null) {
			b = (String) request.getAttribute("parametaraB");
		} else {
			b = "0";
		}
		if (request.getAttribute("c") != null) {
			c = (Integer) request.getAttribute("c");
		} else {
			c = 0;
		}
	%>
	<form action="../Web0203/math" method="POST">
	a:
	<input type="text" id='a' name='a' value='<%=a%>' />
	<br>
	<%=errorA%>
	<br> b:
	<input type="text" id='b' name='b' value='<%=b%>' />
	<br>
	<%=errorB%>
	<br> c:
	<input type="text" disabled id='c' name='c' value='<%=c%>' />
	<br>
	<input type="submit" name="plus" id='operation' value='plus' />
	<br>
	<input type="submit"  name="minus" id='operation' value='minus' />
	</form>
</body>
</html>