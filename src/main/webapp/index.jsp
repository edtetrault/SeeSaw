<html>
<head>
<link rel="stylesheet"
href="https://fonts.googleapis.com/css?family=Chewy|Kalam">
<style>
body {background-color:#4D9078;}
h1 {color:#FE5F55; font-family: 'Chewy', cursive; text-align:center; font-size:300%;}
p {color:#F2C14E; font-family: 'Kalam', cursive; text-align: center; font-size:105%;}
form {color:#F2C14E; font-family: 'Kalam', cursive; text-align: center;}
</style>
</head>
<body style="background-color:#4D9078;">



<h1>Welcome to See-Saw!</h1>
  <br/>
 <form style="text-align:center;" action="register-response.jsp">

 <p>To get started, fill out the information below. If you need help, ask an adult!</p>
 <br/><br/>
 First name: <input type=text" name="firstName" />

 <br/><br/>

 Last name: <input type="text" name="lastName" />
 <br/><br/>
 Email: <input type="text" name="eMail" />
 <br/><br/>
 How old are you?
     <select name="Age">
         <option>Younger than 5</option>
         <option>Between 5 and 10</option>
         <option>Between 11 and 20</option>
         <option>21 and wiser</option>
     </select>
     <br/><br/>
 What kinds of things did you see today? <br/>
    <input type="checkbox" name="topic" value="Animals"> Animals
  <input type="checkbox" name="topic" value="Vehicles"> Vehicles
  <input type="checkbox" name="topic" value="People"> People
  <input type="checkbox" name="topic" value="Activities"> Activities
    <br/><br/>
       <input type="submit" value="Submit" />

     </form>

</body>
</html>
