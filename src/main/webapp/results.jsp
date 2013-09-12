<%@page import="cse.maven.sample.exception.InvalidNICNumberException"%>
<%@page import="cse.maven.sample.NIC"%>
<%@page import="cse.maven.sample.NICInterpreter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<h1>Result of the Nic interpretation</h1>
<%
	String nicNumber = request.getParameter("nicNumber");
	
	NICInterpreter nicInterpreter = new NICInterpreter();
	
	try {
		NIC resultNIC = nicInterpreter.createNIC(nicNumber);
		String result = nicInterpreter.interpret(resultNIC);
		out.println(result);
	} catch (InvalidNICNumberException ex) {
		out.println(ex.getMessage());
	}	
%>
</head>
<body>

</body>
</html>