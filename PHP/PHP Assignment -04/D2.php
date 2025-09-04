<!-- Write a PHP program to show the records
from student_ info table that is inserted in
prog 1 with mysqli_ connect ()-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <center>
        <h2>Students Data </h2>
<table border="1" width="600" >
    <tr style="background-color: skyblue;" >
        <th>Enroll_No</th>
        <th>Name</th>
        <th>Address</th>
    </tr>

<?php
$conn = mysqli_connect("localhost", "root", "Pankaj#12345", "phplab", 3307);

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

$sql = "SELECT * FROM student_info";
$response = $conn->query($sql);

if ($response && $response->num_rows > 0) {
    while ($row = $response->fetch_assoc()) {
        echo "
        <tr>
            <td>{$row['Enrollment']}</td>
            <td>{$row['Fullname']}</td>
            <td>{$row['Address']}</td>
        </tr>";
    }
} else {
    echo "<tr><td colspan='3'>No records found.</td></tr>";
}

$conn->close();
?>
</table>
</center>

</body>
</html>