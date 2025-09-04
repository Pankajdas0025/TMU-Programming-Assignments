<!-- Write a PHP program to insert a record (Enr_
no, name, address) in student_ info table using
mysqli _connect ().   -->


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
form{ height: 300px; width: 600px;  margin: 5% auto; background-color: skyblue;padding: 25px 0;}
input {display: block; margin: 10px 15%; width: 70%; height: 30px; padding: 10px;}
input[type="submit"]{background-color: green; height: 30px; width: 74%; padding:5px; color: white; align-items: center;align-content: center;}
    </style>
</head>
<body>


<form method="POST">

<input type="text" name="enroll_no" id="" placeholder="Enter enrollment no " required>
<input type="text" name="full_name" id="" placeholder="Enter full name" required>
<input type="text" name="address" id="" placeholder="Enter address" required>
<input type="submit" value="Submit" name="sbtn" >

</form>

<?php
$conn = mysqli_connect ("localhost", "root","Pankaj#12345","phplab" ,3307);
if(!$conn)

    {
    die("Connection failed: " . mysqli_connect_error());
    }
else
{
    if($_SERVER['REQUEST_METHOD'] == "POST")
{

$enrollment = $_POST['enroll_no'];
$full_name = $_POST['full_name'];
$address = $_POST['address'];
if(!empty($enrollment) || !empty($full_name) || !empty($addresss))
{
$sql = "INSERT INTO student_info values( '$enrollment', '$full_name','$address')";
$check =$conn->query($sql);
if($check)

    {
        echo "<script>  alert('Data Inserted'); </script>";
    }
}

else
{
 echo "<script>  alert('all field should be field'); </script>";
}

}
}
?>
</body>
</html>
