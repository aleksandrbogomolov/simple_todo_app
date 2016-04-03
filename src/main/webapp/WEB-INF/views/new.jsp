<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Create ToDo</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/bootstrap.min.css"/>"/>
</head>
<body>
<div class="container">
    <h1 class="text-center">Create new ToDo</h1>
    <form class="form-inline">
        <form:form method="post" modelAttribute="ToDo">
            <form:input path="id" id="id" type="hidden"/>
            <table>
                <tr>
                    <td><label for="value">Value: </label></td>
                    <td><form:input path="value" id="value"/></td>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table>
        </form:form>
        <form action="/">
            <input type="submit" value="Back">
        </form>
    </form>
</div>
<div class="panel panel-default navbar-fixed-bottom">
    <div class="panel-footer">
        <p class="text-center">
            <small>&copy; 2016, Aleksandr Bogomolov</small>
        </p>
    </div>
</div>
</body>
</html>
