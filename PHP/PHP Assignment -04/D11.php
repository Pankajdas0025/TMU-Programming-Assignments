<!-- Write a PHP program to create session variable.
Store your name, email id on session variable
and display it on another PHP page -->


<?php

session_start();

$_SESSION["name"] = "PANKAJ KUMAR DAS";
$_SESSION["email"] = "pd556911@gmail.com";

$myName = $_SESSION["name"];
$myEmail = $_SESSION["email"];

echo "Name : $myName <br> Email: $myEmail";








?>