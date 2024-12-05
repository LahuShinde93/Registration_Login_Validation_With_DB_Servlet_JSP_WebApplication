<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ffe6e6;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            margin-top: 15%;
        }
        .message {
            font-size: 24px;
            font-weight: bold;
            color: #dc3545;
            margin-bottom: 20px;
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
    <div class="container">
        <p class="message">Fail to register! Please enter correct and valid data.</p>
        <a href="login.html">Go Back to Login Page</a>
    </div>

     
</body>
</html>
