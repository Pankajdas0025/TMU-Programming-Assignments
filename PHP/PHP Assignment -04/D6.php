<!-- Write a PHP program to show the record from
emp_ details table that is inserted in prog 4 with
PDO.   -->

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Employee Records</title>
  <style>
    table {width: 600px;margin: 50px auto;
    }
    th, td {
      padding: 12px;
      border: 1px solid #ccc;
      text-align: center;
    }
    th {
      background-color: #0077ff;
      color: white;
    }
    h2 {
      text-align: center;
      margin-top: 40px;
      font-family: 'Segoe UI', sans-serif;
    }
  </style>
</head>
<body>

<h2>Employee Details</h2>

<?php
try {
  // Connect to the database
  $pdo = new PDO("mysql:host=localhost;port=3307;dbname=phplab", "root", "Pankaj#12345");
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

  // Prepare and execute query
  $stmt = $pdo->prepare("SELECT *FROM emp_details");
  $stmt->execute();

  // Fetch and display records
  if ($stmt->rowCount() > 0) {
    echo "<table>";
    echo "<tr><th>Employee ID</th><th>Name</th><th>Designation</th></tr>";
    while ($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
      echo "<tr>
              <td>{$row['Emp_ID']}</td>
              <td>{$row['Emp_Name']}</td>
              <td>{$row['Emp_designation']}</td>
            </tr>";
    }
    echo "</table>";
  } else {
    echo "<p style='text-align:center;'>No records found.</p>";
  }

} catch (PDOException $e) {
  echo "<p style='text-align:center; color:red;'>Database error: " . $e->getMessage() . "</p>";
}
?>

</body>
</html>
