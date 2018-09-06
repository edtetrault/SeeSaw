<html>
<head>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Chewy|Kalam">
    <style>
body {background-color:#eeeeee;}
h1 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:300%;}
h3 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:115%;}
p {color:#e64a19; font-family: 'Kalam', cursive; text-align: center; font-size:105%;}
form {color:#00e676; font-family: 'Kalam', cursive; text-align: center;}
</style>
<title>Welcome to See-Saw</title>
</head>

<h1>Welcome!</h1><br><br>
<h3>See-Saw in an interactive app that helps you remember all the new things you see when you are out exploring by creating flash cards!</h3>
<br>
<p>If you would like to make new flash cards click "See" below.</p><br>
<form style="text-align:center;" action="see-menu.jsp">
    <input type="submit" value="See">
</form>
<br>
<p>If you would like to look at flash cards you have already created click "Saw" below.</p>
<form style="text-align:center;" action="SawMenuServlet">
    <input type="submit" value="Saw">
</form>




</body>
</html>
