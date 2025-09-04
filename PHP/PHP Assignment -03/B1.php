<!-- 1  Write a PHP program to implement various string
operations. You can take the string as first String="the
LABORIOUS student” and second String="performed at
his LEVEL BEST.”

  (i) Show both string in lowercase.
  (ii) Show both string in uppercase
  (iii) Convert the first letter of first string in uppercase.
  (iv) Convert the first letter of every word in upper case.
Do it for both string.

  (v) Show the string whose starting word will be
over.

  (vi) Replace LABORIOUS word in the first String with
HARDWORKING.  -->
<?php
$firstString="the LABORIOUS student";
$secondString="performed at his LEVEL BEST.";
// (i)Show both string in lowercase.

echo strtolower($firstString);
echo strtolower($secondString);
// (ii)Show both string in uperrcase.

echo "<br>".strtoupper($firstString);
echo "<br>".strtoupper($secondString);

// (iii) Convert the first letter of first string in  uppercase.
echo "<br>".ucfirst($firstString);
echo "<br>".ucfirst($secondString);


// (iv) Convert the first letter of every word in  uppercase. Do it for both string.
echo "<br>".ucwords($firstString);
echo "<br>".ucwords($secondString);

// (v) Show the string whose starting word will be over.

if (str_starts_with($firstString, "over")) {
    echo "First string starts with 'over': ";
}

else if (str_starts_with($secondString, "over")) {
    echo "Second string starts with 'over': ";
}
else echo "<br><Br>No any string start with over ";


// (vi) Replace quick word by super-fast word in the firstString.
str_replace("LABORIOUS","HARDWORKING",$firstString);
echo $firstString;

?>