<%@ page language="java" import="org.apache.cxf.systest.jaxrs.*" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:books="http://www.w3.org/books">
<head> <title>Testing XML Example</title> </head>
<jsp:useBean id="book" scope="request" class="com.github.rmannibucau.cxf.requestdisatcherprovider.demo.Resource$Book" />
<body>
	<h1>Request Book</h1>
	<p><%= book.getName() %></p>
</body>
</html>
