<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta charset="utf-8">
<title>Simple TODO app</title>
<style>
    .title {
        text-align: center;
    }
    .value {
        font-size: large;
    }
</style>
<body>
<header>
    <h1 class="title">Simple TODO app</h1>
</header>
<main>
    <div align="center">
        <h2>List of ToDo</h2>
        <a href="<c:url value='/new' />">Add new ToDo</a>
        <table>
            <tr>
            </tr>
            <c:forEach items="${list}" var="toDo">
                <tr>
                    <td class="value">${toDo.value}</td>
                    <td><a href="<c:url value='/edit-${toDo.id}-ToDo' />">Edit</a></td>
                    <td><a href="<c:url value='/delete-${toDo.id}-ToDo' />">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<footer>

</footer>
</body>
</html>
