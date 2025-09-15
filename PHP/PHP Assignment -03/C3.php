<!-- Write a PHP program to print array values between
Team Leader to System Administrator in
$roles =array (“Designer”,” Developer”,” Tester”,”
Team
Leader”,”Subject Matter
Expert”,” Data Analyst”,” System Administrator”,
“Project Manager”) using array_slice ().   -->

<?php
$roles = array ("Designer"," Developer"," Tester", "Team Leader","Subject Matter Expert"," Data Analyst"," System Administrator", "Project Manager");
$slicedArray = array_slice($roles ,3 ,6 );
// print_r($slicedArray);

echo implode(" " ,$slicedArray);




?>
