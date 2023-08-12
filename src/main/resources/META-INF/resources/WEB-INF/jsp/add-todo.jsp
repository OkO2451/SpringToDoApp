<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Todo Item</title>
</head>
<body>
    <h1>Add Todo Item</h1>
    <form action="/add-todo" method="post">
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required>
        <br>
        <label for="dueDate">Due Date:</label>
        <input type="date" id="dueDate" name="dueDate" required>
        <br>
        <button type="submit">Add Todo Item</button>
    </form>
</body>
</html>