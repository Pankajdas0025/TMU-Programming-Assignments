<!-- Write a PHP program to update the designation in
emp_ details table using PDO. -->

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Update Employee Designation</title>
  <style>
    form {
      width: 500px;
      margin: 50px auto;
      background-color: #e0f7fa;
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
      background-color: #0077ff;
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

<h2>Update Employee Designation</h2>

<form method="POST">
  <input type="text" name="empid" placeholder="Enter Employee ID" required>
  <input type="text" name="new_designation" placeholder="Enter New Designation" required>
  <input type="submit" value="Update" name="updateBtn">
</form>

<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  try {
    $pdo = new PDO("mysql:host=localhost;port=3307;dbname=phplab", "root", "Pankaj#12345");
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $empid = $_POST['empid'];
    $newDesignation = $_POST['new_designation'];

    $stmt = $pdo->prepare("UPDATE emp_details SET Emp_designation = :designation WHERE Emp_ID = :empid");
    $stmt->bindParam(':designation', $newDesignation);
    $stmt->bindParam(':empid', $empid);

    if ($stmt->execute()) {
      echo "<script>alert('Designation updated successfully');</script>";
    } else {
      echo "<script>alert('Update failed');</script>";
    }

  } catch (PDOException $e) {
    echo "<script>alert('Database error: " . $e->getMessage() . "');</script>";
  }
}
?>

</body>
</html>
