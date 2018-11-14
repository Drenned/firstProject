<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:requestEncoding value="UTF-8" />
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Список пользователей</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body class="w3-light-grey">
    <div class="w3-container w3-center w3-margin-bottom w3-padding">
        <div class="w3-card-4">
    <div class="w3-container w3-light-blue">
        <h1>Список пользователей</h1>
    </div>
    <div>
    <ul class="w3-ul">
<c:forEach items="${usernames}" var="username">
    <li onclick="location.href='addUser?user=${username}'" class="w3-hover-sand">
    ${username}
    </li>
</c:forEach>
</ul>
</div>
</div>
</div>
    <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
        <button class="w3-btn w3-round-large" onclick="location.href='/'">Вернуться на главную</button>   
    </div>
</body>
</html>