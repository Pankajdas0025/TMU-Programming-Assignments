<!-- Write a php program that initialize the three 
dimensional array and also print all array 
elements. -->

<?php
// Define a 3D array
$threeDArray = array(
    array(
        array(1, 2, 3),
        array(4, 5, 6),
        array(7, 8, 9)
    ),
    array(
        array(10, 11, 12),
        array(13, 14, 15),
        array(16, 17, 18)
    ),
    array(
        array(19, 20, 21),
        array(22, 23, 24),
        array(25, 26, 27)
    )
);

for($i=0;$i<3;$i++)
{
    for($j=0;$j<3;$j++)
    {
        for($k=0;$k<3;$k++)
        {
            echo "threeDArray"."[$i]"."[$j]"."[$k]=".$threeDArray[$i][$j][$k]."<br>";
        }
    }
   
}
?>
