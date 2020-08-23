<!DOCTYPE html>
<html>
<head>
<title>Personality</title>
<link rel="stylesheet" type="text/css" href="styleindex.css">
</head>

<body>

<div class="head">

<CENTER><H1>SISTEM PAKAR DIAGNOSA PERSONALITY </H1></CENTER>
<CENTER><H1>4 JENIS KARAKTER MANUSIA</H1></CENTER>
</div>

<div class="conten">
<CENTER><img src="1.png" style="width: 500px; height: 300px; border:solid; border-color: blue; border-radius: 20px;"></CENTER><br><br>

<?php

include '../config.php';

// mengaktifkan session
session_start();

// cek apakah user telah login, jika belum login maka di alihkan ke halaman login
if($_SESSION['status'] !="login"){
	header("location:../index.php");
}


?> 

<p style="position: left;">Sistem Pakar(dalam bahasa Inggris :expert system) adalah sistem informasi yang berisi dengan pengetahuan dari pakar sehingga dapat digunakan untuk konsultasi. Pengetahuan dari pakar di dalam sistem ini digunakan sebagi dasar oleh Sistem Pakar untuk menjawab pertanyaan (konsultasi).<br>
Kepakaran (expertise) adalah pengetahuan yang ekstensif dan spesifik yang diperoleh melalui rangkaian pelatihan, membaca, dan pengalaman. Pengetahuan membuat pakar dapat mengambil keputusan secara lebih baik dan lebih cepat daripada non-pakar dalam memecahkan problem yang kompleks. Kepakaran mempunyai sifat berjenjang, pakar top memiliki pengetahuan lebih banyak daripada pakar yunior. Tujuan Sistem Pakar adalah untuk mentransfer kepakaran dari seorang pakar ke komputer, kemudian ke orang lain (yang bukan pakar).</p>

<p>Sistem pakar adalah suatu program komputer yang mengandung pengetahuan dari satu atau lebih pakar manusia mengenai suatu bidang spesifik. Jenis program ini pertama kali dikembangkan oleh periset kecerdasan buatan pada dasawarsa 1960-an dan 1970-an dan diterapkan secara komersial selama 1980-an. Bentuk umum sistem pakar adalah suatu program yang dibuat berdasarkan suatu set aturan yang menganalisis informasi (biasanya diberikan oleh pengguna suatu sistem) mengenai suatu kelas masalah spesifik serta analisis matematis dari masalah tersebut.<br> Tergantung dari desainnya, sistem pakar juga mampu merekomendasikan suatu rangkaian tindakan pengguna untuk dapat menerapkan koreksi. Sistem ini memanfaatkan kapabilitas penalaran untuk mencapai suatu simpulan. </p>

<p>Tergantung dari desainnya, sistem pakar juga mampu merekomendasikan suatu rangkaian tindakan pengguna untuk dapat menerapkan koreksi. Sistem ini memanfaatkan kapabilitas penalaran untuk mencapai suatu simpulan. </p>


<p>Nah pada kesempatan kali ini saya Arsyad Basofil Amri Dan Nurfika Sari, membuat sebuah sistem pakar untuk mengetahui kepribadian seseorang, karna menurut ilmu sosiologi ada 4 macam kepribadian manusia<br>
<p>
1. Sanguinis. Enerjik, ramah, memberikan kesan ceria dalam kondisi apapun, dan suka memotivasi orang lain. ...<br>
2. Koleris. Memiliki sikap tegas, berorientasi pada tujuan, dan dapat mengatur sebuah tindakan dengan cepat. ...<br>
3. Melankolis. Adalah tipe kepribadian yang memiliki ciri sikap pendiam, pemikir, dan perfeksionis. ...<br>
4. Plegmatis.
</p>

<center>
<p>Lalu Tipe Yang Manakah Kamu?</p>
<p>Silahkan Mulai Diagnosa Dibawah</p>
</center>

<center><a href="http://localhost/Sistem-Pakar-Personality/solving.php?idpertanyaan=0" style="text-decoration:none;"><input type="submit" value="MULAI DIAGOSA" style="border: none; font-size: 20px; background: orange; border-radius: 20px; padding: 10px;"></a></center>




</div>

<div class="footer">
<center>
<p>Directed By</p>
<p>Arsyad Basofil Amri 	1755201065</p>
<p>Afriliansyah  1755201066</p>
<p>Nurfika Sari  1755201074</p>
</center>
</div>

</body>
</html>

