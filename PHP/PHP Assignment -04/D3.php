<!-- Write a PHP program to delete a particular record
from student _info table using mysqli_ connect ().   -->


<?php
include "D2.php";

$conn = mysqli_connect("localhost", "root", "Pankaj#12345", "phplab", 3307);

if (!$conn)

{
    die("Connection failed: " . mysqli_connect_error());
}


else

    {
$sql = "DELETE FROM student_info WHERE Enrollment ='TCA301489' ";
if(mysqli_query($conn , $sql))
{
echo "<center style ='color:red;'>Data Deleted </center>";
}

    }









?>