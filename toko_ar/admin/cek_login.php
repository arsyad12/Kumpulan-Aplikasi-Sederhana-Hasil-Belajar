<?php
include "../config/koneksi.php";
//mencegah terjadinya sql injection




function anti_injection($data){
$filter=mysqli_real_escape_string(stripcslashes(strip_tags(htmlspecialchars($data,ENT_QUOTES))));

return $filter;	
}






$username=$_POST['username'];
$password=md5($_POST['password']);

$login=mysqli_query($con, "select * from user where username ='$username' AND password='$password'");
$ketemu=mysqli_num_rows($login);
$r=mysqli_fetch_array($login);







if ($ketemu >0) {
	session_start();
$SESSION[username]=$r[username];
$SESSION[namalengkap]=$r[namalengkap];
$SESSION[passuser]=$r[password];


$id_lama=session_id();
session_regenerate_id();
$sid_baru=session_id();

echo "<script>alert('selamat $_SESSION[namalengkap]');window.location=media.php</script>";

header('location:media.php');



}else{

echo "<script>alert('login gagal pass user salah'); window.location=index.php</script>";
header('location:index.php');

}

?>