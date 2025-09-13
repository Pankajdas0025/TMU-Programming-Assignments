
<?php


$Numbers = array(10, 50, 40, 60, 30 , 20);
print_r($Numbers);
sort($Numbers);

echo" <br>Sorted Array <br>";
foreach($Numbers as $num)
{
echo" $num ";
}


?>