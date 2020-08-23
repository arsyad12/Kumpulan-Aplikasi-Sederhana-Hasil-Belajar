<?php
include"conf/koneksi.php";

if(isset($_POST['nama'])){

	$sql=mysqli_query($con,"update barang set nama= '$_POST[nama]',
												id_kategori= '$_POST[id_kategori]',
												deskripsi= '$_POST[deskripsi]',
												jumlah= '$_POST[jumlah]'
											where kd_barang= '$_POST[kode]'");

	if(sql){
	header('location:index.php');
	}
	else{
	echo"Gagal Menyimpan";
	}

}
?>