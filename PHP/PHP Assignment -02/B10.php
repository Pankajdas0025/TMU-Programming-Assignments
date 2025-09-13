<!-- Write a php program to find the largest no 
among three numbers.  -->
<?php

echo $a=100 . "<br>";
echo $b=200 . "<br>";
echo $c=180 . "<br>";

if($a>$b&&$a>$c)
{
    echo "Largest Number is : ". $a;
}
else if($b>$a&&$b>$c)
{
    echo "Largest Number is : ". $b;
}
else
{

    echo "Largest Number is : ". $c;
}

?>