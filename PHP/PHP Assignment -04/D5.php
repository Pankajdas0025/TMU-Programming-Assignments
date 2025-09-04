<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Insert Employee Record (PDO)</title>
  <style>
    form {
      height: 300px;
      width: 600px;
      margin: 5% auto;
      background-color: skyblue;
      padding: 25px 0;
    }
    input {
      display: block;
      margin: 10px 15%;
      width: 70%;
      height: 30px;
      padding: 10px;
    }
    input[type="submit"] {
      background-color: green;
      height: 30px;
      width: 74%;
      padding: 5px;
      color: white;
      cursor: pointer;
    }
  </style>
</head>
<body>

<form method="POST">
  <input type="text" name="empid" placeholder="Enter employee ID" required>
  <input type="text" name="empname" placeholder="Enter employee name" required>
  <input type="text" name="empdesign" placeholder="Enter designation" required>
  <input type="submit" value="Submit" name="sbtn">
</form>

<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  try {
    // Connect to database
    $pdo = new PDO("mysql:host=localhost;port=3307;dbname=phplab", "root", "Pankaj#12345");
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Prepare and bind
    $stmt = $pdo->prepare("INSERT INTO emp_details (Emp_ID, Emp_Name, Emp_designation) VALUES (:empid, :empname, :empdesign)");
    $stmt->bindParam(':empid', $_POST['empid']);
    $stmt->bindParam(':empname', $_POST['empname']);
    $stmt->bindParam(':empdesign', $_POST['empdesign']);

    // Execute and confirm
    if ($stmt->execute()) {
      echo "<script>alert('Record inserted successfully');</script>";
    } else {
      echo "<script>alert('Insertion failed');</script>";
    }

  } catch (PDOException $e) {
    echo "<script>alert('Database error: " . $e->getMessage() . "');</script>";
  }
}
?>
</body>
</html>
