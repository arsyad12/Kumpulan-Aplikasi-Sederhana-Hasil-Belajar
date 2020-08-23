<?php
include"conf/koneksi.php";

if(isset($_POST['nama'])){

$lokasi_file = $_FILES['file']['tmp_name'];
$nama_file   = $_FILES['file']['name'];


$folder = "foto_ar/$nama_file";


$tgl_upload=date("Ymd");


if (!empty($lokasi_file)) {
	


move_uploaded_file($lokasi_file,'$folder');
	$sql=mysqli_query($con, "insert into barang (nama, id_kategori, deskripsi, jumlah, foto)
		values ('$_POST[nama]','$_POST[kategori]','$_POST[deskripsi]','$_POST[jumlah]','$nama_file')");

header('Location:index.php');
	
		
	}else{
		$sql=mysqli_query($con, "insert into barang (nama, id_kategori, deskripsi, jumlah)
		values ('$_POST[nama]', '$_POST[kategori]', '$_POST[deskripsi]','$_POST[jumlah]')");

header('Location:index.php');
	}
}

?>