<%-- 
    Document   : Login
    Created on : Dec 27, 2019, 4:26:29 PM
    Author     : Saif
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/NavStyle.css" />
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@include file="/WEB-INF/jspf/NavBar.jspf" %> <br />
        <h5>Login required: ${param.notLoggedIn}</h5>
        <h5>Original url is: ${param.origUrl}</h5>
        <form action="${pageContext.request.contextPath}${initParam.authenticate}" method="get">
            User Name: <input type="text" name="uName"><br>
            Password: <input type="password" name="pass"><br>
            <button type="submit" value="submit">Submit</button>
            <button type="reset" value="reset">Reset</button>
            <!--<input type="hidden" name="origUrl" value="<c:out value='${param.origUrl}' />" />-->
            <input type="hidden" name="origUrl" value="${fn:escapeXml(param.origUrl)}">
        </form>
    </body>
</html>
