 <!-- Write a PHP program to delete a particular record  from emp_ details able using PDO.  -->

 <!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Delete Employee Record</title>
  <style>
    form {
      width: 500px;
      margin: 50px auto;
      background-color: #ffe0e0;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.2);
    }
    input {
      width: 90%;
      padding: 10px;
      margin: 10px 0;
      font-size: 16px;
    }
    input[type="submit"] {
      background-color: #d32f2f;
      color: white;
      border: none;
      cursor: pointer;
    }
    h2 {
      text-align: center;
      font-family: 'Segoe UI', sans-serif;
    }
  </style>
</head>
<body>

<h2>Delete Employee Record</h2>

<form method="POST">
  <input type="text" name="empid" placeholder="Enter Employee ID to delete" required>
  <input type="submit" value="Delete" name="deleteBtn">
</form>

<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  try {
    $pdo = new PDO("mysql:host=localhost;port=3307;dbname=phplab", "root", "Pankaj#12345");
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $empid = $_POST['empid'];

    $stmt = $pdo->prepare("DELETE FROM emp_details WHERE Emp_ID = :empid");
    $stmt->bindParam(':empid', $empid);

    if ($stmt->execute()) {
      if ($stmt->rowCount() > 0) {
        echo "<script>alert('Record deleted successfully');</script>";
      } else {
        echo "<script>alert('No record found with that Employee ID');</script>";
      }
    } else {
      echo "<script>alert('Deletion failed');</script>";
    }

  } catch (PDOException $e) {
    echo "<script>alert('Database error: " . $e->getMessage() . "');</script>";
  }
}
?>

</body>
</html>
