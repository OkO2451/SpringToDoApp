<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 0;
        }
        .error-message {
            text-align: center;
            font-size: 24px;
            font-weight: bold;
            color: red;
        }
    </style>
</head>
<body>
    <div class="error-message">
        ${errorMessage}
    </div>
</body>
</html>