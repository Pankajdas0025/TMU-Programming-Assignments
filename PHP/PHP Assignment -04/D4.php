<!-- Write a PHP program to update address in student_
info table using mysqli_ connect ().  -->


<?php
include "D2.php";

$conn = mysqli_connect("localhost", "root", "Pankaj#12345", "phplab", 3307);

if (!$conn)

{
    die("Connection failed: " . mysqli_connect_error());
}

else

    {
$sql = "UPDATE student_info  SET Address = 'Bahadurganj ' WHERE Enrollment ='TCA2301489' ";
if(mysqli_query($conn , $sql))
{
echo "<center style ='color:blue;'>Data Updated </center>";
}

    }









?>