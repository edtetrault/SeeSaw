<html>
<head>

<link rel="stylesheet"
href="https://fonts.googleapis.com/css?family=Chewy|Kalam">
<style>
body {background-color:#4D9078;}
p {color:#F2C14E; font-family: 'Kalam', cursive;}
ul {color:#F2C14E; font-family: 'Kalam', cursive;}
</style>
</head>
<body style="background-color:#4D9078;">

<head><title>Registration Confirmation</title></head>
<p>Here is what you told us!</p>

<p>Your name is: <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %></p>
<p>Your email is: <%=request.getParameter("eMail") %></p>
<p>Here is your age: <%= request.getParameter("Age") %></p>
<p>Here are the things you saw today: </p>
<ul>
<%
    String[] topic = request.getParameterValues("topic");
    for (String tempTopic : topic) {
    out.println("<li>" + tempTopic + "</li>");
    }
    %>
    </ul>


</body>
</html>