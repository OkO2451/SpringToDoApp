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
          <th>Task</th>
          <th>Description</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todoItems}" var="todoItem">
          <tr>
            <td>${todoItem.task}</td>
            <td>${todoItem.description}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
