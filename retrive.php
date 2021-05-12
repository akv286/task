 <?php
 
 $server="localhost";
$user="root";
$password="8090866024";
 $database="myDB";
 
 // connection checking
 $link= mysqli_connect($server,$user,$password,$database );
 
 if($link == false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
	
}
// query for Retrieveing data from database
 
$result = mysqli_query($link,"SELECT * FROM client");
?>
 
<html>
 <head>
 <title> Retrive data</title>
 </head>
<body>
<?php
if (mysqli_num_rows($result) > 0) {
?>
  <table>
  
  <tr>
    <td>First Name</td>
    <td>Last Name</td>
    <td>Email id</td>
  </tr>
<?php
$i=0;
while($row = mysqli_fetch_array($result)) {
?>
<tr>
    <td><?php echo $row["firstname"]; ?></td>
    <td><?php echo $row["lastname"]; ?></td>
    <td><?php echo $row["email"]; ?></td>
</tr>
<?php
$i++;
}
?>
</table>
 <?php
}
else{
    echo "No result found";
}
 ?>
 </body>
</html>
 