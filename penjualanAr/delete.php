<?php
include"conf/koneksi.php";

if(isset($_GET['id'])){

	$sql=mysqli_query($con,"delete from barang where kd_barang='$_GET[id]'");

	if(sql){
	header('location:index.php');
	}
	else{
	echo"Gagal Menghapus";
	}

}
?>