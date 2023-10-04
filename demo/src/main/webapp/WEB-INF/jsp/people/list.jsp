<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>People List</title>
  </head>
  <body>
    <h1>People List</h1>
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>Name</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${people}" var="person">
          <tr>
            <td>${person.id}</td>
            <td>${person.name}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
