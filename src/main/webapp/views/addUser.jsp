<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:requestEncoding value="UTF-8" />
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добавление пользователя</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body class="w3-light-grey">
    <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
        <h1>Добавление пользователя</h1>
    </div>
    <div class="w3-container w3-padding">
        <c:if test="${not empty userName }">
            <p>Пользователь ${userName} успешно добавлен</p>
        </c:if>
    </div>
    <div class="w3-card-4">
     <div class="w3-container w3-center w3-green">
    <form class="w3-selection w3-light-grey w3-padding" method="post">
     <label>Введите имя:
        <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
       </label>

      <label>Пароль:
          <input type="password" name="pass" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
      </label>
     <button type="submit">Подтвердить</button>
    </form>
     </div>
    </div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <div>
        <button onclick="location.href='/'" class="w3-btn w3-round-large">Вернуться на главную</button>   
    </div>
    
</body>
</html>