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
  padding: 10px 20px;
  font-size: 20px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #ff5252;
  border: none;
  border-radius: 10px;
  box-shadow: 0 4px #999;
}

.button:hover {background-color: #ff867f}

.button:active {
  background-color: #ff5252;
  box-shadow: 0 4px #666;
  transform: translateY(4px);
}


h1 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:300%;}
h3 {color:#000000; font-family: 'Chewy', cursive; text-align:center; font-size:200%;}
h4 {color:#000000; font-family: 'Chewy', cursive; text-align:center; font-size:115%;}
p {color:#000000; font-family: 'Kalam', cursive; text-align: center; font-size:100%;}
form {color:#000000; font-family: 'Kalam', cursive; text-align: center;}
</style>

</head>
<body>
 <div class="topnav">
              <a class="active" href="main">Home</a>
              <a href="see-menu">See</a>
              <a href="saw">Saw</a>
              <a href="account">Account</a>
            </div>
<title>Next Steps</title>
<h3>Your flashcard was saved. What would you like to do next?</h3><br><br>

<form style="text-align:center;" action="see-animal.jsp">
    <button class="button">New Animal</button>
</form>
<form style="text-align:center;" action="see-menu.jsp">
    <button class="button">See Menu</button>
</form>

<form style="text-align:center;" action="saw-menu.jsp">
    <button class="button">Saw Menu</button>
</form>
<form style="text-align:center;" action="index.jsp">
    <button class="button">Main Menu</button>
</form>
<br>
<h4>We can have fun learning together!</h4>



</body>
</html>
