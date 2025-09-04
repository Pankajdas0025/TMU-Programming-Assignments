<!-- Write a PHP program to create session and load
another page after session validation -->

<?php
session_start();


$_SESSION['email'] = 'pd556911@gmail.com';

// Redirect to dashboard
header("Location: D11.php");
exit;
?>