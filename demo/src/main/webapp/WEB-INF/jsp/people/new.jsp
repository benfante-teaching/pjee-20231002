<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a person</title>
</head>
<body>
    <h1>Add a person</h1>
    <div>
        <form action="/demo/people/add" method="POST">
            <label>Name: </label>
            <input type="text" name="newName" >
            <input type="submit" value="Add person">
        </form>
    </div>
</body>
</html>
