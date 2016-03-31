<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Create ToDo</title>
    <style>
        body {
            font-family: sans-serif;
        }
        .title {
            text-align: center;
        }
    </style>
</head>
<body>
<header>
    <h1 class="title">Simple TODO app</h1>
</header>
<main>
    <div align="center">
        <h2>Create new ToDo</h2>
        <form:form method="post" modelAttribute="ToDo">
            <form:input path="id" id="id" type="hidden"/>
            <table>
                <tr>
                    <td><label for="value">Value: </label></td>
                    <td><form:input path="value" id="value"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table>
        </form:form>
    </div>
</main>
</body>
</html>
