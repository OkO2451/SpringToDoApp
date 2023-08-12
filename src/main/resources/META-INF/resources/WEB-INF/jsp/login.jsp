<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Login Page</title>
  </head>
  <body>
    <h1>Login Page</h1>
    <pre>${message}</pre>

    <form method="post" action="login-success" method="get">
      <label for="name">Username:</label>
      <input type="text" id="name" name="name" /><br /><br />
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" /><br /><br />
      <input type="submit" value="Login" />
    </form>
  </body>
</html>
