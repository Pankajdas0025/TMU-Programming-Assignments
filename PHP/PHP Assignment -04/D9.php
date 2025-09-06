 <!-- Create a registration Form with (username,
password, full_ name, DOB, email_ id, address,
mob_ no) and insert it in register_ data table
using PHP.  -->


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
form{ height: 550px; width: 600px;  margin: 5% auto; background-color: skyblue;padding: 25px 0;}
input {display: block; margin: 10px 15%; width: 70%; height: 30px; padding: 10px;}
input[type="submit"]{background-color: green; height: 30px; width: 74%; padding:5px; color: white; align-items: center;align-content: center;}
    </style>
</head>
<body>


<form method="POST">

<input type="text" name="username" id="" placeholder="Enter username" required>
<input type="text" name="full_name" id="" placeholder="Enter full name" required>
<input type="email" name="email_id" id="" placeholder="Enter email" required>
<input type="password" name="password" id="" placeholder="Enter password" required>
<input type="date" name="DOB" id="" placeholder="Enter birth date " required>
<input type="text" name="address" id="" placeholder="Enter your address" required>
<input type="tel" name="mob_no" id="" placeholder="Enter mobile number" required>
<input type="submit" value="Register" name="sbtn" >

</form>

<?php
$conn = new mysqli ("localhost", "root","Pankaj#12345","phplab" , 3307);
if($conn->connect_error)
{
    echo "Failed to connect database! ";
}
else
{
    if($_SERVER['REQUEST_METHOD'] == "POST")
{

$Username = $_POST['username'];
$full_name = $_POST['full_name'];
$email_id = $_POST['email_id'];
$password = $_POST['password'];
$dob = $_POST['DOB'];
$address = $_POST['address'];
$mobile = $_POST['mob_no'];
$sql = "INSERT INTO register_data values( '$Username', '$full_name' , '$email_id' , '$password', '$dob' , '$address' ,'$mobile')";
$check =$conn->query($sql);
if($check)

    {
        echo "Data Inserted";
    }

}
}
?>
</body>
</html>
