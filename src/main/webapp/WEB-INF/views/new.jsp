<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Create ToDo</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/bootstrap.min.css"/>"/>
</head>
<body>
<div class="container">
    <h1 class="text-center">Create new ToDo</h1>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="<c:url value='/' />">Show all</a></li>
                    <li><a href="<c:url value='/done' />">Show done</a></li>
                    <li><a href="<c:url value='/notDone' />">Show not done</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <div class="span6 center">
                <form:form method="post" modelAttribute="ToDo" cssClass="form-inline">
                    <form:input path="id" id="id" type="hidden"/>
                    <label for="value"></label>
                    <form:input path="value" id="value" cssClass="form-control"/>
                    <input type="submit" value="Add" class="btn btn-default">
                </form:form>
            </div>
        </div>
    </div>
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
