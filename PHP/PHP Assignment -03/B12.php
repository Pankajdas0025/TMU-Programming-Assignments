<!-- Write a php program to validate textbox for integer
value.  -->
<!DOCTYPE html>
<html>
    <head>
        <title>Assignment - 3 (l)</title>
        <style>

            div{
                height: 100px;
                width: 300px;
                background-color: skyblue;
                padding: 1% 5%;
                margin: 10% auto;
            }
        </style>
    </head>
<body>
<div>
<form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>">
  Name: <input type="text" name="fname" required>
  <input type="submit" value="SEND">
  <br>
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // collect value of input field
    $name = trim($_REQUEST['fname']);
    if (preg_match("/[0-9]/" , $name))
    {
        echo "<br>Nubers not allowed ";
    } else {
        echo "<br>Valid Name : ".$name;
    }
}
?>
</div>
</body>
</html>