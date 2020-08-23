<head>
	<title>Tampil Barang</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type"text/css" href="css/bootstrap.css">
<script src="jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.bundle.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<?php

include"conf/koneksi.php";
$sql=mysqli_query($con, "select * from kategori order by nama asc");


?>
<div class ="container">
	<h2> form data barang</h2>
	<from method="POST"