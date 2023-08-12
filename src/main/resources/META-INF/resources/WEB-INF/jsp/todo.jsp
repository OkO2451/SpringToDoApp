<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todo List</title>
</head>
<body>
    <h1>Todo List</h1>
    <ul>
        <c:forEach items="${todoItems}" var="todoItem">
            <li>${todoItem.description}</li>
        </c:forEach>
    </ul>
</body>
</html>