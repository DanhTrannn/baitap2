<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email List Form</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>Join our email list</h1>

<form action="emaillist" method="post">
    <input type="hidden" name="action" value="add">

    <label>Email:</label>
    <input type="email" name="email" required><br>

    <label>First Name:</label>
    <input type="text" name="firstName" required><br>

    <label>Last Name:</label>
    <input type="text" name="lastName" required><br>

    <input type="submit" value="Join Now" id="submit">
</form>
</body>
</html>