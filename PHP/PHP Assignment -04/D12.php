<!-- Create a log inform that is authenticate by register_
data table using PHP.  -->


 <!-- Create a registration Form with (username,
password, full_ name, DOB, email_ id, address,
mob_ no) and insert it in register_ data table
using PHP.  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
    form
    {
        background-color:skyblue;
        height: 400px;
        width: 350px;
        margin: 50px auto;
        padding: 30px;
    }input
    {
        display: block;
        width: 80%;
        height: 40px;
        margin: 30px 0;
        padding:0 10px;
    }input[type="submit"]
    {
        display: block;
        width: 86%;
        height: 40px;
        margin: 25px 0;
        padding:0 10px;
    }
    span
    {
background-color:lightyellow;
padding: 10px 15px;
    }
    </style>
</head>
<body>
<form method="POST" autocomplete="off">
<h1>Login Page</h1>
<input type="email" name="email_id" id="" placeholder="Enter email"  required>
<input type="password" name="password" id="" placeholder="Enter password"  required>
<input type="submit" value="Login">

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
$email_id = $_POST['email_id'];
$password = $_POST['password'];
$sql = "SELECT *FROM register_data WHERE Email_ID = '$email_id'";
$response = $conn->query($sql);
if($response)

    {

        if($response->num_rows!=0)
        {
        $sql2 = "SELECT *FROM register_data WHERE Password = '$password'";
        $response2 = $conn->query($sql2);
        if($response2)
        {
               if($response2->num_rows!=0)
               {
echo "<span style='color:green;'>Login Sucess!</span>";
               }
               else
               {

                echo "<span style='color:red;'>Incorrect Password!</span>";



               }
        }
        }
        else
        {
echo "<span style='color:red;'>User Not Found !</span>";
        }
    }
}
}

?>
</form>

</body>
</html>

