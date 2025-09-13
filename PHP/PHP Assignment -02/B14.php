<!-- Write a simple php program to display division
according to the marks obtained in 5 subjects
by the student.  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>MAX MARKS=100</h1>
<form action="A14.php" method="POST">
<input type="text" placeholder="Enter your Science Marks:-" name="Sc">
<br><br>
<input type="text" placeholder="Enter your S.Science Marks:-" name="Ssc">
<br><br>
<input type="text" placeholder="Enter your Mathematics Marks:-" name="Math">
<br><br>
<input type="text" placeholder="Enter your English Marks:-" name="Eng">
<br><br>
<input type="text" placeholder="Enter your Hindi Marks:-" name="Hin">
<br><br>
<input type="submit" value="Check Result"><br>
<form>
</body>
</html>

<?php
$a=$_POST['Sc'];
$b=$_POST['Ssc'];
$c=$_POST['Math'];
$d=$_POST['Eng'];
$e=$_POST['Hin'];
$TM=$a+$b+$c+$d+$e;
echo "TOTAL-MARKS:500\n"; echo "Obtain marks: $TM <br>";
if($TM>=300)
{
    echo "Your result is First Division";
}

else if($TM<300 && $TM>=245)
{
    echo "Your result is Second Division";
}

else if($TM<245 && $TM>=150)
{
    echo "Your result is Third Division";
}
else
{
    echo "Your result is Faild !";
}




?>