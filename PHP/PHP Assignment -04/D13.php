<!-- Write a PHP program to create cookies that can be
accessed by another page.  -->



<?php

setcookie("username" , "pd5569121@gmail.com");
$result = $_COOKIE["username"];
echo $result;

?>