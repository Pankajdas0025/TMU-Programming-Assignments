<!-- Write a php program to perform arithmetic
operation by using switch case.  -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p></p>
    <h1>Arithmetic Operation</h1>
    <p>choices</p>
    <ol>
        <li> Addition</li>
        <li> Subtraction</li>
        <li> Multiplication</li>
        <li> Division</li>
        <li> Modulus</li>
    </ol>
    <h1>a= 50, b=20</h1>

<form action="A11.php" method="POST">
    <input type="text" placeholder="Enter your choice:-" name="choice">
    <input type="submit" value="Find">
</form>
</body>
</html>
<?php
$a=50;
$b=20;
$sum=$a+$b;
$sub=$a-$b;
$mul=$a*$b;
$div=$a/$b;
$mod=$a%$b;


$choice=$_POST['choice'];

switch($choice)
{
case 1; echo "Addition=".$sum;break;
case 2; echo "Subtraction=".$sub;break;
case 3; echo "Multiplication=".$mul;break;
case 4; echo "Division=".$div;break;
case 5; echo "Modulas=".$mod;break;
default : echo "Wrong Choice !!";
}


?>