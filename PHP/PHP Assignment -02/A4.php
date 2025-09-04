<!-- Write a php program to the print the table of a
no using while loop with user input. -->


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="A4.php" method="POST">
    <h1>Table</h1>
    <input type="text" placeholder="Enter  Number:-" name="num">
    <input type="submit" value="Print Table">
    </form>
    <br>

    <?php
    $num=$_POST['num'];
    echo "<br><br>Table of ".$num;
    $i=1;
    while($i<=10)

    {
    echo "<br>$num * $i = ".$num*$i;
    $i++;
    }


    ?>

</body>
</html>