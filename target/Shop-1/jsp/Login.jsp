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
        <h1>Login Here</h1>
        
        <%@include file="/WEB-INF/jspf/NavBar.jspf" %> <br />
        
        <c:if test="${!empty param.notLoggedIn}">
            <h3>Login Required: ${param.notLoggedIn}</h3>
        </c:if>
        
        <form action="${pageContext.request.contextPath}${initParam.authenticate}" method="GET">
            User Name: <input type="text" name="uName"><br>
            Password: <input type="password" name="pass"><br>
            <button type="submit" value="submit">Submit</button>
            <button type="reset" value="reset">Reset</button>
            <c:if test="${!empty param.origUrl}">
                <input type="hidden" name="origUrl" value="${fn:escapeXml(param.origUrl)}">
            </c:if>
        </form>
    </body>
</html>
