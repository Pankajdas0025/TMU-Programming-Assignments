<!-- Write a php program that initialize the two
dimensional array and also print all array
elements. -->
<?php

$TwoDArr=array(
    array(10,50,90),
    array(80,70,60),
    array(90,70,80)
);

print_r($TwoDArr);
echo "<h1>Array Elements using for loop</h1>";
for($i=0;$i<3;$i++)
{
    for($j=0;$j<3;$j++)
    {
        echo "TwoDArr [$i][$j] = ".$TwoDArr[$i][$j]."<br>";
    }
}

echo "<br><Br> Display 2D Array: <br><br>";
for($i=0;$i<3;$i++)
{
    for($j=0;$j<3;$j++)
    {
        echo $TwoDArr[$i][$j]." ";
    }
    echo "<br> ";
}
?>