<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Hello Java Web application</title>
  </head>
  <body>
    <h1>Hello Java Web Application</h1>
    <p>Questo è un nuovo paragrafo!!!</p>

    <%= new java.util.Date() %>

    <p><%= Math.sqrt(16) * 3 %></p>

    <ul>
      <% for(int i = 0; i < 10; i++) { %>
      <li>Elemento <%= i %> (prodotto con un expression tag)</li>
      <% } %>
    </ul>

    <div><% out.println("This is produced by a scriptlet tag"); %></div>
  </body>
</html>
