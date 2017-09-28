<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/includes/header.html"/>
        <h1>Main Page</h1>
        Hello, ${user.username} <a href="LoginServlet?message=Logged out.">Logout</a>
<c:import url="/includes/footer.html"/>