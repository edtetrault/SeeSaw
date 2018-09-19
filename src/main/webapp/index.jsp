<html>
<head>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Chewy|Kalam">
    <style>
body {
      margin: 0;
      font-family: Arial, Helvetica, sans-serif;
    }

    .topnav {
      overflow: hidden;
      background-color: #66ffa6;
    }

    .topnav a {
      float: left;
      color: #ff7d47;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
      font-size: 17px;
    }

    .topnav a:hover {
      background-color: #00e676;
      color: black;
    }

    .topnav a.active {
      background-color: #00b248;
      color: white;
    }
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 23px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #ff5252;
  border: none;
  border-radius: 10px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #ff867f}

.button:active {
  background-color: #ff5252;
  box-shadow: 0 9px #666;
  transform: translateY(4px);
}

h1 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:300%;}
h3 {color:#000000; font-family: 'Chewy', cursive; text-align:center; font-size:200%;}
h4 {color:#000000; font-family: 'Chewy', cursive; text-align:center; font-size:115%;}
p {color:#000000; font-family: 'Kalam', cursive; text-align: center; font-size:100%;}
form {color:#000000; font-family: 'Kalam', cursive; text-align: center;}
</style>
<title>Welcome to See-Saw</title>
</head>
<body>
<div class="topnav">
              <a class="active" href="index.jsp">Home</a>
              <a href="see-menu.jsp">See</a>
              <a href="saw-menu.jsp">Saw</a>
              <a href="account.jsp">Account</a>

            </div>
<h1>Welcome!</h1><br><br>
<h3>See-Saw in an interactive app that helps you remember all the new things you see when you are out exploring by creating flash cards!</h3>
<br>
<p>If you would like to make new flash cards click "See" below.</p><br>
<form style="text-align:center;" action="see-menu.jsp">
     <button class="button">See</button>
</form>
<br>
<p>If you would like to look at flash cards you have already created click "Saw" below.</p>
<form style="text-align:center;" action="saw-menu.jsp">
     <button class="button">Saw</button>
</form>




</body>
</html>
