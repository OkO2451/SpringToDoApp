<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todo Lists</title>
</head>
<body>
    <h1>Todo Lists</h1>
    <ul>
        <c:forEach items="${user.todoLists}" var="todoList">
            <li><a href="/todo-list/${todoList.id}">${todoList.name}</a></li>
        </c:forEach>
    </ul>
</body>
</html>