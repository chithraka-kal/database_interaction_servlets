<%@ page import="java.util.List" %>
<%@ page import="newpackage3.dblogin" %>
<%@ page import="newpackage3.Prefect" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prefects</title>
    <style>
        .prefect {
            width: 25%;
            float: left;
            padding: 10px;
            box-sizing: border-box;
            text-align: center;
        }
        .prefect img {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h1>Prefect Details</h1>
    <% 
    List<Prefect> prefectList = dblogin.getAllPrefects();
    for (Prefect prefect : prefectList) {
    %>
    <div class="prefect">
        <img src="img/<%= prefect.getImg() %>" alt="User Image">
        <div><%= prefect.getUsername() %></div>
        <div><%= prefect.getPassword() %></div>
         <form action="PrefectServlet" method="post">
            <input type="hidden" name="username" value="<%= prefect.getUsername() %>">
            <input type="hidden" name="password" value="<%= prefect.getPassword() %>">
            <button class="button" type="submit" name="action" value="remove">Remove</button>
        </form>
    </div>
    <% } %>
    <div style="clear: both;"></div>
</body>
</html>
