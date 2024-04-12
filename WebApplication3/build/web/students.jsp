<%@ page import="java.util.List" %>
<%@ page import="newpackage3.dblogin" %>
<%@ page import="newpackage3.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
    <style>
        .user {
            width: 25%;
            float: left;
            padding: 10px;
            box-sizing: border-box;
            text-align: center;
        }
        .user img {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h1>Student Details</h1>
    <div class="max-container">
    <% 
    List<User> userList = dblogin.getAllUsers();
    for (User user : userList) {
    %>
    <div class="user">
        <img src="user.jpg" alt="User Image">
        <div>User Name: <%= user.getUname() %></div>
        <div>Password: <%= user.getPasswd() %></div>
        <form action="PrefectServlet" method="post">
            <input type="hidden" name="uname" value="<%= user.getUname() %>">
            <input type="hidden" name="passwd" value="<%= user.getPasswd() %>">
            <button class="button" type="submit">Prefect</button>
        </form>
    </div>
    <% } %>
    <div style="clear: both;"></div>
    </div>
</body>
</html>
