<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h1>Thank You for Your Submission!</h1>
    <p>Here is the information you provided:</p>

    <table>
        <tr><th>First Name</th><td>${firstName}</td></tr>
        <tr><th>Last Name</th><td>${lastName}</td></tr>
        <tr><th>Email</th><td>${email}</td></tr>
        <tr><th>Date of Birth</th><td>${birth}</td></tr>
        <tr><th>Heard From</th><td>${heardFrom}</td></tr>
        <tr><th>Wants Updates</th><td>${wantsUpdates}</td></tr>
        <tr><th>Email Announcements</th><td>${emailOK}</td></tr>
        <tr><th>Preferred Contact</th><td>${contactVia}</td></tr>
    </table>

    <a href="index.jsp" class="btn-submit">Go Back</a>
</div>
<div class="footer">Edit by: 23133010 - TranThanhDanh</div>
</body>
</html>