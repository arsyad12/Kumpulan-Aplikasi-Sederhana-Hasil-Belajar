<html lang=eng>
<head>
<title>Tampil Barang</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<?php
include"conf/koneksi.php";
$sql=mysqli_query($con,"select * from kategori");
?>

<div class="container">
<h2>Form Data Barang</h2>
	<form method="POST" action="simpan.php">
		<div class="form-group">
			<label for="nama">Nama Barang</label>
			<input type="nama" class="form-control" id="nama"
			placeholder="Masukkan Nama Barang" name="nama">
		</div>
		<div class="form-group">
			<label for="sell">Kategori Barang</label>
			<select name="kategori" class="form-control" id="sell">
				<?php
				while($r=mysqli_fetch_array($sql)){
				echo"<option value=$r[id_kategori]>$r[nama_kategori]</option>";
			}
			?>
		</select>
	</div>
	<div class="form-group">
		<label for="deskripsi">Deskripsi</label>
		<textarea class="form-control" rows="5" id="comment" name="deskripsi"></textarea>
	</div>
	<div class="form-group">
		<label for="jumlah">Jumlah Barang</label>
		<input type="jumlah" class="form-control" id="jumlah" placeholder="Silahkan Masukkan Jumlah" name="jumlah">
	</div>

	<div class="form-group">
		<label for="file">FOTO</label>
		<input type="file" class="form-control" id="file" placeholder="Silahkan Masukkan Foto" name="file">
	</div>

	<button type="submit" class="btn btn-default">Simpan</button>
</form>
</div>

</body>
</html>