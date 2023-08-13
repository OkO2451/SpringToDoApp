<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Todo Lists</title>
  </head>
  <body>
    <h1>Todo Lists</h1>
    <br />
    <form action="/add-todo-item" method="POST">
                <input type="text" name="name" placeholder="Enter task name" />
              </td>
              <td></td>
              <td>
                <button type="submit">Add Task</button>
              </td>
      </form>
    <br />
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>name</th>
          <th>isCompleted</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todoItems}" var="todoItem">
          <tr>
            <td>${todoItem.id}</td>
            <td>${todoItem.name}</td>
            <td>${todoItem.isCompleted}</td>
            <td>
              <form action="/toggle-todo-item" method="POST">
                <input type="hidden" name="id" value="${todoItem.id}" />
                <button type="submit">
                  ${todoItem.isCompleted ? 'Mark Incomplete' : 'Mark Complete'}
                </button>
              </form>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <br />
      
  </body>
</html>
