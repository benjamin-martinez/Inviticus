<%-- 
    Document   : response
    Created on : Mar 2, 2019, 3:56:34 PM
    Author     : Benjamin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <jsp:useBean id="mybean" scope="session" class="org.inviticus.hello.NameHandler" />
    <jsp:setProperty name="mybean" property="name" />
    <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
</body>
</html>
