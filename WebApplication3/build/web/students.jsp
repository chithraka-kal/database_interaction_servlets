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
        <div class="wishlist-summary">
            <% List<User> userList = dblogin.getAllUsers(); %>
            <p>Total Students: <%= userList.size() %></p>
        </div>    
    <div class="max-container">
    <% 
    
    for (User user : userList) {
    %>
    <div class="user">
        <img src="img/<%= user.getImg() %>" alt="User Image">
        <div>User Name: <%= user.getUname() %></div>
        <div>Password: <%= user.getPasswd() %></div>
        <form action="PrefectServlet" method="post" enctype="multipart/form-data">
            <input type="hidden" name="uname" value="<%= user.getUname() %>">
            <input type="hidden" name="passwd" value="<%= user.getPasswd() %>">
            <input type="hidden" name="imgg" value="img/<%= user.getImg() %>">
            <button class="button" id="myButton" type="submit" value="add" >Prefect</button>
        </form>
    </div>
    <% } %>
    <div style="clear: both;"></div>
    </div>
    <script>
</body>
</html>

<%--<%= user.getImgFileName() %>--%>