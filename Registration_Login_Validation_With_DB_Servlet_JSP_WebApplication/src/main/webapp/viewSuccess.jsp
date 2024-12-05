<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,com.nit.Bean.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View User Successfully!</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #007bff;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #ffffff;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        a {
            display: block;
            width: fit-content;
            margin: 20px auto;
            text-decoration: none;
            color: #007bff;
            border: 1px solid #007bff;
            padding: 10px 15px;
            border-radius: 5px;
            text-align: center;
        }
        a:hover {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>

<h1>User Details</h1>

<table>
    <thead>
        <tr>
            <th>User Name</th>
            <th>Password</th>
            <th>Address</th>
            <th>Mail ID</th>
            <th>Phone Number</th>
            <th>State</th>
            <th>Country</th>
        </tr>
    </thead>
    <tbody>
        <%
            ArrayList<UserBean> al = (ArrayList<UserBean>) request.getAttribute("alis");
            Iterator<UserBean> it = al.iterator();

            while (it.hasNext()) {
                UserBean ub = (UserBean) it.next();
        %>
        <tr>
            <td><%= ub.getUserName() %></td>
            <td><%= ub.getPassword() %></td>
            <td><%= ub.getAddress() %></td>
            <td><%= ub.getMailId() %></td>
            <td><%= ub.getPhNo() %></td>
            <td><%= ub.getState() %></td>
            <td><%= ub.getCountry() %></td>
        </tr>
        <% } %>
    </tbody>
</table>

<a href="login.html">Back to Home Page</a>

</body>
</html>
