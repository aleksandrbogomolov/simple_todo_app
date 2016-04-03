<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Simple TODO app</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/bootstrap.min.css"/>"/>
</head>
<body>
<div class="container">
    <h1 class="text-center">List of ToDo</h1>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="<c:url value='/new' />">Add new ToDo</a></li>
                    <li><a href="<c:url value='/' />">Show all</a></li>
                    <li><a href="<c:url value='/done' />">Show done</a></li>
                    <li><a href="<c:url value='/notDone' />">Show not done</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <table class="table table-striped">
        <tr>
            <th>Value</th>
            <th>Done</th>
            <th>Settings</th>
        </tr>
        <c:forEach items="${list}" var="toDo">
            <tr>
                <td class="">${toDo.value}</td>
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
                <td>
                    <ul class="nav nav-pills">
                        <li role="presentation"><a href="<c:url value='/edit-${toDo.id}-ToDo' />">Edit</a></li>
                        <li role="presentation"><a href="<c:url value='/done-${toDo.id}-ToDo' />">Done</a></li>
                        <li role="presentation"><a href="<c:url value='/delete-${toDo.id}-ToDo' />">Delete</a></li>
                    </ul>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="panel panel-default navbar-fixed-bottom">
        <div class="panel-footer">
            <p class="text-center">
                <small>&copy; 2016, <a href="mailto:ksandr_ua@mail.ru">Aleksandr Bogomolov</a></small>
            </p>
        </div>
    </div>
</div>
</body>
</html>
