<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Todo List</title>
</head>
<body>
    <h1>Create Todo List</h1>
    <form action="/save-todo-list" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>
        <label for="description">Description:</label>
        <textarea id="description" name="description"></textarea><br><br>
        <input type="submit" value="Create">
    </form>
</body>
</html>