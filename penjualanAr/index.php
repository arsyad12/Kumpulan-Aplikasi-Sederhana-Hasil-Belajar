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
$sql=mysqli_query($con, "select * from barang order by nama asc");
?>

<div class="container">
	<center><h2>data barang</h2></center>
	<p> ini data
		<a href=tambah.php>
		<center><button type = "button" class ="btn btn-primary"> Tambah data barang</button></center>
		</a>
		</p>


<!--tabel--->

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>no</th>			
					<th>Kode Barang</th>
					<th> Nama Barang </th>
					<th>Kategori</th>	
					<th>Deskripsi</th>
					<th>Jumlah</th>					
					<th>Aksi</th>

				</tr>
				</thead>




<!--PAgination--->

<?php
	$batas=5;
	$halaman= @$_GET['halaman'];
	if(empty($halaman)){
		$posisi = 0;
		$halaman = 1;
	}
	else{
		$posisi = ($halaman-1) * $batas;
	}

include"conf/koneksi.php";
	$show=mysqli_query($con,"select * from barang LIMIT $posisi,$batas");
	

	$no=1 +$posisi;
	
	while($r=mysqli_fetch_array($show)){
		echo"	<tr><td>$no</td>
				<td>$r[kd_barang]</td>
				<td>$r[nama]</td>";
				
				$datakategori=mysqli_query($con,"select * from kategori where id_kategori='$r[id_kategori]'");
				$r2=mysqli_fetch_array($datakategori);
				
		echo"	<td>$r2[nama_kategori]</td>
				<td>$r[deskripsi]</td>
				<td>$r[jumlah]</td>
				
				<td>";
				
				?>


				<a href=<?php echo 'view.php?id=', $r["kd_barang"]?>>
				<button type='button' class='btn btn-info'>Liat Foto</button>
				</a>

				<a href=<?php echo 'edit.php?id=', $r["kd_barang"]?>>
				<button type='button' class='btn btn-primary'>Edit</button>
				</a>
				<a href=<?php echo 'delete.php?id=', $r["kd_barang"]?>>
				<button type='button' class='btn btn-danger'>Hapus</button>
				</a>

			






							<?php
						$no++;
					}


?>	
    </tbody>
  </table>
  
  <?php
	$query2		= mysqli_query($con, "select * from barang");
	$jmldata	= mysqli_num_rows($query2);
	$jmlhalaman	= ceil($jmldata/$batas);
	
	?>




  
  <nav aria-label="Page navigation example">
  <ul class="pagination">
  
  <?php
	for($i=1;$i<=$jmlhalaman;$i++)
		if($i != $halaman){
			echo "<li class='page-item'><a class='page-link' href=\"index.php?halaman=$i\">$i</a></li>";
		}
		else{
			echo " <li class='page-item'>$i</li> ";
		}
	?>

  </ul>
</nav>




			</div>
		</body>
		</html>






