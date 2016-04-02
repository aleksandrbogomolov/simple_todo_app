<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Simple TODO app</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/style.css"/>"/>
</head>
<body>
<main>
    <h1 class="title">Simple TODO app</h1>
    <div align="center">
        <h2>List of ToDo</h2>
        <nav>
            <ul>
                <li><a href="<c:url value='/new' />">Add new ToDo</a></li>
                <li><a href="<c:url value='/' />">Show all</a></li>
                <li><a href="<c:url value='/done' />">Show done</a></li>
                <li><a href="<c:url value='/notDone' />">Show not done</a></li>
            </ul>
        </nav>
        <table>
            <tr class="cap">
                <td>Value</td>
                <td>Done</td>
            </tr>
            <c:forEach items="${list}" var="toDo">
                <tr>
                    <td class="value">${toDo.value}</td>
                    <td>
                        <c:choose>
                            <c:when test="${toDo.done == true}">
                                <input type="checkbox" name="done" disabled checked/>
                            </c:when>
                            <c:otherwise>
                                <input type="checkbox" name="done" disabled/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td><a href="<c:url value='/edit-${toDo.id}-ToDo' />">Edit</a></td>
                    <td><a href="<c:url value='/done-${toDo.id}-ToDo' />">Done</a></td>
                    <td><a href="<c:url value='/delete-${toDo.id}-ToDo' />">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<footer>
    &copy; 2016, Aleksandr Bogomolov
</footer>
</body>
</html>
