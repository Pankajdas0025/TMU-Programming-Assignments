  <!-- Write a PHP to merge two strings using user defined
function.   --><?php
// Define a user function to merge two strings
function mergeStrings($str1, $str2) {
    return $str1 . " " . $str2;
}

// Example usage
$string1 = "Welcome to";
$string2 = "CampusXchange";

$merged = mergeStrings($string1, $string2);
echo "Merged String: " . $merged;
?>
