<html>
<head>
<title> View</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Form Data Barang</h2>
  <form action="update.php" method="POST">

<?php
	include"conf/koneksi.php";

	if(isset($_GET['id'])){
		$sql=mysqli_query($con,"select * from barang where kd_barang ='$_GET[id]'");
		$r=mysqli_fetch_array($sql);
		
?>	

<div class="card" style="width: 18rem;">
  <img class="card-img-top" src=<?php echo "foto_ar/$r[foto]"; ?> alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">"<?php echo $r['nama']; ?>"</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</form>
</div>

<?php
 }
?>

</body>
</html>