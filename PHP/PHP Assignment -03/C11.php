<!-- Write a php program to implement  $_REQUEST
variable.  -->
<!DOCTYPE html>
<html>
    <head>
        <title>Assignment - 3 (k)</title>
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
  Name: <input type="text" name="fname">
  <input type="submit" value="SEND">
  <br>
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // collect value of input field
    $name = $_REQUEST['fname'];
    if (empty($name)) {
        echo "<br>Name is empty";
    } else {
        echo "<br>" .$name;
    }
}
?>
</div>
</body>
</html>