<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
    <h1>Hello ${name}!!</h1>
    <div>
        <form action="/demo/hello" method="POST">
            <label>Name: </label>
            <input name="name" type="text">
            <input type="submit" value="Salutami">
        </form>
    </div>
</body>
</html>
