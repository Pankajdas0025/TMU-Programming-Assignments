<!--


wrt a program to display the reverse of a number using while loop and do while loop with user input  -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment - 2(e)</title>
</head>
<body>
<center>
    <h1>Reverse of a Number</h1>
    <form  method="POST">
        <input type="number" name="num" placeholder="Enter a number" required>
        <input type="submit" value="Reverse">
    </form>
    <?php

        $num = $_POST['num'];
        $reverse = 0;
        $originalNum = $num;

        // Using while loop
        while ($num > 0) {
            $digit = $num % 10;
            $reverse = ($reverse * 10) + $digit;
            $num = (int)($num / 10);
        }


        echo "Reverse of nuber  $originalNum  using while loop is: $reverse";

        // Resetting num for do-while loop
        $num = $originalNum;
        $reverse = 0;

        // Using do-while loop
        do {
            $digit = $num % 10;
            $reverse = ($reverse * 10) + $digit;
            $num = (int)($num / 10);
        } while ($num > 0);

        echo "<h2>Using Do-While Loop:</h2>";
        echo "Reverse of $originalNum is: $reverse";
    ?>
</center>
</body>
</html>