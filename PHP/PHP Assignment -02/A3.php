<!-- Write a php program to print the factorial of a
no using for loop.  -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <center>
          <h1>Factorial calculator</h1>
    <form action="A3.php" method="POST">
    <input type="number" placeholder="Enter a Number:-" name="num">
    <input type="submit" value="Find Factorial">
    </form>


    <br>
    <?php
    $num=$_POST['num'];
    $fact=1;
    for($i=$num; $i>0;$i--)
    {
     $fact=$fact*$i;
    }
    echo "Factorial of  $num is ". $fact;
    ?>   </center>

</body>
</html>