<!-- Write a php program that initialize associative
array and also print all array elements.  -->

<?php
$student = array("Name"=>"Abhiraj", "City"=>"kishnaganj", "Age"=>21);
print_r($student);

echo "<h1>Array Elements</h1>";
echo $student['Name']."<br>";
echo $student['City']."<br>";
echo $student['Age'];

?>