<!-- Create HTML page with form tag with
Following input elements Name, Address, Mobile No.
and submit button. Write PHP program to print html
form value with $_POST variable.   -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment-2(i)
    </title>
    <style>
.box{height: 450px;width:20%;background-color: rgb(131, 160, 160);margin: 50px auto;color: white;padding:0 0 0 50px;border-radius: 10px 0px 10px 0;}
input{ margin: 15px 0%;width: 80%; height: 30px;border-radius:5px; border: none; outline: none; padding: 0 10px; }
.output{background-color: skyblue;  margin: 0 25%; padding: 25px;}
input:focus
        {
        border-radius:0;
        border: 2px solid green;

        }input::placeholder
        {
    padding: 2px 10px;

        }input[type="submit"]
        {

        background-color:green;
        color: white;

        }
    </style>
</head>
<body>
<div class="box">
    <br>
    <h1 style="color: black;">
        Registration Form
    </h1>
    <hr>
    <form method="POST" action="">
    Name:<br>
    <input type="text" name="name" placeholder="Enter your name only Letters allowed" required><br>
    Address:<br>
    <input type="text" name="address" placeholder="Enter your address" required><br>
    Mobile:<br>
    <input type="tel" name="mobile" placeholder="Mobile Number" maxlength="10" required><br>
    <input type="submit" value="SUBMIT"><br>
    <span>Already Registred ? </span><a href="#">Login .</a>
     </form>
</div>
<div class="output">
<?php

if($_SERVER['REQUEST_METHOD']=="POST")
{
$Name = $_POST['name'];
$Mobile = $_POST['mobile'];
$Address  = $_POST ['address'];

echo "Name : ".$Name;
echo "<br>Address : ".$Address;
echo "<br>Mobile : ".$Mobile;


}
?>
</div>
</body>
</html>