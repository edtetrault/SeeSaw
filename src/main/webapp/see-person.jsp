<html>
<head>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Chewy|Kalam">
    <style>
body {background-color:#eeeeee;}
h1 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:300%;}
h3 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:200%;}
h4 {color:#00e676; font-family: 'Chewy', cursive; text-align:center; font-size:115%;}
p {color:#e64a19; font-family: 'Kalam', cursive; text-align: center; font-size:100%;}
form {color:#00e676; font-family: 'Kalam', cursive; text-align: center;}
</style>
</head>

<h3>Tell me some things about the person you are meeting!</h3>

<head><title>All About the Person I See</title></head>


<form action="/newperson" method="doPost">

What is their name?<br>
<input type="text" name="person_one">
<br>
How did you meet them?<br>
<input type="text" name="person_two">
<br>
Are they a family member, friend, or someone else?<br>
 <input type="text" name="person_three">
 <br>
Are they older or younger than you?<br>
<input type="text" name="person_four">
<br>
Where did you see them?<br>
<input type="text" name="person_five">
<br>
What is your favorite thing about them?<br>
<input type="text" name="person_six">
<br>

<input type="submit" value="Save"/>

</form>

</body>
</html>