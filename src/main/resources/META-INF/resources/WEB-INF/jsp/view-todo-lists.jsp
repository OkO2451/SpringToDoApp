<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Todo Lists</title>
  </head>
  <body>
    <h1>Todo Lists</h1>
    <table>
      <thead>
        <tr>
          <th>name</th>
          <th>isCompleted</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todoItems}" var="todoItem">
          <tr>
            <td>${todoItem.name}</td>
            <td>${todoItem.isCompleted}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
