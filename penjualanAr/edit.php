<html>
<head>
<title> Edit Barang</title>
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
    <div class="form-group">
      <label for="kode">Kode Barang:</label>
      <input type="kode" class="form-control" id="kd_barang" placeholder="Masukkan Kode Barang" name="kd_barang" 
	  value="<?php echo $r['kd_barang']; ?>" disabled>
	  <input type="hidden" class="form-control" id="kode" name="kode" value="<?php echo $r['kd_barang']; ?>"
    </div>

   <div class="form-group">
      <label for="nama">Nama Barang:</label>
      <input type="nama" class="form-control" id="nama" placeholder="Masukkan Nama Barang" name="nama"
	  value="<?php echo $r['nama']; ?>">
    </div>
	
	<div class="form-group">
  <label for="kategori">Kategori barang</label>
  <select class="form-control" id="sel1" name="id_kategori">
  <?php
	$tampil=mysqli_query($con,"select * from kategori order by nama_kategori");
		if($r[id_kategori]==0){
			echo "<option value=0 selected>- Pilih Kategori -</option>";
		}	
				while($w=mysqli_fetch_array($tampil)){
					if($r[id_kategori]==$w[id_kategori]){
						echo "<option value=$w[id_kategori] selected>$w[nama_kategori]</option>";
					}
					else{
						echo "<option value=$w[id_kategori]>$w[nama_kategori]</option>";
					}
				}
  ?>
  </select>
</div>

<div class="form-group">
  <label for="comment">Deskripsi</label>
  <textarea class="form-control" rows="5" id="deskripsi" name="deskripsi">
  <?php echo $r['deskripsi']; ?>
  </textarea>
</div>

    <div class="form-group">
      <label for="jumlah">Jumlah Barang:</label>
      <input type="jumlah" class="form-control" id="kode" placeholder="Masukkan Jumlah Barang" name="jumlah"
	  value="<?php echo $r['jumlah']; ?>">
    </div>

    <button type="submit" class="btn btn-primary">Update</button>
  </form>
</div>

	<?php
	}
	?>

</body>
</html>