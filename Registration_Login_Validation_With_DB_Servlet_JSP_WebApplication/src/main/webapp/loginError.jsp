<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ffe6e6;
            text-align: center;
            margin-top: 20%;
        }
        .message {
            color: #dc3545;
            font-size: 24px;
            font-weight: bold;
        }
        a {
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <p class="message">Login Failed! Please enter a valid username and password.</p>
    <a href="login.html">Back to Login Page</a>
</body>
</html>
