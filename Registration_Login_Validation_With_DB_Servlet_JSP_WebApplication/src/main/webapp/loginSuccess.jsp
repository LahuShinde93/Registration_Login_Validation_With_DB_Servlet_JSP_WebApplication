<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            text-align: center;
            margin-top: 20%;
        }
        .message {
            color: #28a745;
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
    <p class="message">Welcome, <%= request.getAttribute("userName") %>! Login Successful!</p>
    <a href="login.html">Back to Login Page</a>
</body>
</html>
