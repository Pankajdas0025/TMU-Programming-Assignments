<!-- Write a php program that initialize the one
dimensional array and also print all array
elements by using foreach loop.  -->


<?php
$Numbers=array(10,30,50,40);
print_r($Numbers);
echo "<h1>Array Elements using foreach loop</h1>";
foreach($Numbers as $i)
{
    echo "<br>$i";
}



?>