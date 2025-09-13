<!-- Write a php program to print the current ,next and end
element of $roles array in prog3   -->


<?php
$roles =array ("Designer"," Developer"," Tester"," Team Leader","Subject Matter  Expert"," Data Analyst"," System Administrator", "Project Manager");

echo current($roles) . "<br>";

echo next($roles) . "<br>";

echo end($roles) . "<br>";
?>