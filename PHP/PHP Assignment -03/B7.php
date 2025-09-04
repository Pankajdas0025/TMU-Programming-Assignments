<!-- Write a php program to print tomorrow’s date.  -->

<?php

$tomorrow = date("Y-m-d", strtotime("+1 day"));

echo "Tomorrow's Date: " . $tomorrow;


?>