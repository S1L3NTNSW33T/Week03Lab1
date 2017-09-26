<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>       
        <h1>Login Page</h1>
        <form action='LoginServlet' method='POST'>
        Enter username: <input type='text' name='username' value='${username}'></br>
        Enter password: <input type='text' name='password' value='${password}'></br>
        <input type='submit' value='Login'></br>
        </form>
        ${message}
    </body>
</html>
