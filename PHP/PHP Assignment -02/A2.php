<!-- Write a php program to check entered character is vowel or consonant -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assinment-2 (b)</title>
</head>
<body>
    <center>

    <form method="post" action="">
        <h1>Check Vowel or Consonant</h1>
        <input type="text" name="charvalue" placeholder="Enter a character" required>
      <button type="submit">Check</button>
    </form>

    <?php


$character= $_POST['charvalue'];
$Upchar = strtoupper($character);
$Vowels = array('A', 'E', 'I', 'O', 'U');

foreach ($Vowels as $vowel) {
    if ($Upchar == $vowel) {
        echo "Entered character <b>$character</b> is a Vowel";
        exit;
    }
    else {
        echo "Entered character <b>$character</b> is a Consonant";
        exit;
    }
}


?>  </center>

</body>
</html>


