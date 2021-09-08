<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de personas</title>
    </head>
    <body>
        <h1>listado de Usuarios</h1>
        <ul>
            <c:forEach items="${usuarios}" var="usuario">
                <li>${persona.username} ${persona.password}</li>
            </c:forEach>
        </ul>
    </body>
</html>
