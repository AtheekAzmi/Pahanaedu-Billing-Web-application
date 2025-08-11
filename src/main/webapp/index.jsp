<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(120deg, #4facfe, #00f2fe);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }

        .login-container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0px 6px 18px rgba(0, 0, 0, 0.2);
            width: 350px;
        }

        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .login-container label {
            font-weight: bold;
            display: block;
            margin: 10px 0 5px;
            color: #555;
        }

        .login-container input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        .login-container button {
            width: 100%;
            padding: 10px;
            background-color: #4facfe;
            border: none;
            border-radius: 8px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        .login-container button:hover {
            background-color: #3b8ddb;
        }

        .error-message {
            color: red;
            text-align: center;
            margin-bottom: 10px;
        }

        .login-container p {
            text-align: center;
            margin-top: 15px;
            font-size: 14px;
            color: #555;
        }

        .login-container a {
            color: #4facfe;
            text-decoration: none;
        }

        .login-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>

    <!-- Display error message -->
    <div class="error-message">
        ${errorMessage}
    </div>

    <form action="login" method="post">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required placeholder="Enter your username">

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required placeholder="Enter your password">

        <button type="submit">Login</button>
    </form>

    <p>Don't have an account? <a href="#">Sign up</a></p>
</div>
</body>
</html>
