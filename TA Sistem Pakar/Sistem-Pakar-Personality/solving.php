<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="stylesolv.css">
</head>
<body>

<div class="conten">
    
<?php 
include("koneksi.php"); 
 
   
  if(!isset($_GET['idpertanyaan'])){ 
    //tampilkan pertanyaan pertama 
    $sqlp = "select * from diagnosa where mulai='Y'"; 
    $rs=mysql_query($sqlp); 
    $data=mysql_fetch_array($rs); 
     
    //bentuk pertanyaan 
    echo "<form>"; 
    echo "<CENTER><H1>SISTEM PAKAR DIAGNOSA PERSONALITY </H1></CENTER>"; 
    echo "<CENTER><H1>4 JENIS KARAKTER MANUSIA</H1></CENTER>"; 
    echo "<CENTER><IMG SRC='4.jpg' WIDTH='500'HEIGHT='300' BORDER=0 ALT=''></CENTER>"; 
    echo "<center><p>Pencarian Anda Tidak Valid Silahkan Ulang Kembali</p></center>";
    echo "<center><p>Pastikan Kalau Anda Sudah Mendapat Jawban</p></center>";
    echo "<center><p style='fontsize=200'>Dan Pastikan Anda Telah Memilih Salah Satu Jawaban !!!</p></center>";

  
  }else{ 

    //tampilkan pertanyaan pertama 
    $idsolusi=$_GET['idpertanyaan']; 
    $sqlp = "select * from tbl_diagnosa where kode_personal=$idsolusi"; 
    $rs=mysql_query($sqlp); 
    $data=mysql_fetch_array($rs); 
     
    //bentuk pertanyaan 
    echo "<form>"; 
    echo "<CENTER><H1>SISTEM PAKAR DIAGNOSA PERSONALITY </H1></CENTER>"; 
    echo "<CENTER><H1>4 JENIS KARAKTER MANUSIA</H1></CENTER>"; 
    echo "<CENTER><IMG SRC='3.jpeg' WIDTH='300'HEIGHT='300' BORDER=0 ALT=''></CENTER>"; 
     
    echo "<center><h1>DIAGNOSA</h1></center>"; 
    echo"<center>";
    echo $data['solusi_dan_jawaban']."<br><br><br>";
    echo"</center>"; 
}



    if($data['selesai']!="y"){ 
    
    echo "<center>";
    echo "<input type='radio' name='idpertanyaan' value='".$data['benar']."'>YA TENTU<BR><BR>"; 
    echo "<input type='radio' name='idpertanyaan' value='".$data['salah']."'>SEPETINYA TIDAK <BR><BR>"; 
    echo "<input type='submit' value='LANJUT ' >"; 
    echo "</center>";


    }






?> 

</div>


<div class="footer">
<center>
<p>Directed By</p>
<p>Arsyad Basofil Amri  1755201065</p>
<p>Afriliansyah  1755201066</p>
<p>Nurfika Sari  1755201074</p>
</center>
</div>



</body>
</html>
