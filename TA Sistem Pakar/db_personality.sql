-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2018 at 03:03 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_personality`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_diagnosa`
--

CREATE TABLE `tbl_diagnosa` (
  `kode_personal` int(11) NOT NULL,
  `solusi_dan_jawaban` varchar(200) NOT NULL,
  `benar` int(11) NOT NULL,
  `salah` int(11) NOT NULL,
  `mulai` char(100) NOT NULL,
  `selesai` char(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_diagnosa`
--

INSERT INTO `tbl_diagnosa` (`kode_personal`, `solusi_dan_jawaban`, `benar`, `salah`, `mulai`, `selesai`) VALUES
(1, 'Sabar, santai, tenang, dan pendengar yang baik', 2, 9, 'y', 'n'),
(3, 'Tidak banyak bicara, namun cenderung bijaksana', 4, 9, 'y', 'n'),
(2, 'Simpatik dan baik hati namun cenderung menyembunyikan emosi', 3, 9, 'y', 'n'),
(4, 'Penengah masalah yang baik ', 5, 9, 'y', 'n'),
(5, 'Menyenangkan, mudah bergaul dan tidak suka menyinggung perasaan orang lain', 6, 9, 'y', 'n'),
(6, 'Bisa bekerja dibawah tekanan', 7, 9, 'y', 'n'),
(7, 'Senang melihat dan mengawasi, peduli dan mudah diajak damai', 8, 9, 'y', 'n'),
(8, '.Analitis, mendalam, serius dan bertujuan, berorientasi pada jadwal', 36, 36, 'y', 'n'),
(9, 'Artistik, kreatif, sensitif', 10, 17, 'y', 'n'),
(10, 'Mau mengorbankan diri dan idealis', 11, 17, 'y', 'n'),
(11, 'Standar tinggi dan perfeksionis, tekun, rapi, dan hemat', 12, 17, 'y', 'n'),
(12, 'Mencari solusi pemecahan masalah dengan kreatif (sering terlalu kreatif)', 13, 17, 'y', 'n'),
(13, 'Selalu menyelesaikan apa yang sudah dimulai', 14, 17, 'y', 'n'),
(0, 'Yakin Ingin Diagnosa?', 1, 35, 'n', 'n'),
(14, 'Sulit bersosialisasi (cenderung pilih-pilih)', 15, 17, 'y', 'n'),
(15, 'Sulit mengungkapkan perasaan dan memiliki rasa curiga yang besar (skeptis terhadap pujian)', 16, 17, 'y', 'n'),
(16, 'Suka bicara, antusias, ekspresif, emosional dan demonstratif', 37, 37, 'y', 'n'),
(17, 'Ceria dan penuh rasa ingin tahu', 18, 26, 'y', 'n'),
(18, 'Hidup di masa sekarang', 19, 26, 'y', 'n'),
(19, 'Mudah menyesuaikan diri dengan lingkungan', 20, 26, 'y', 'n'),
(20, 'Berhati tulus dan terkadang kekanak-kanakan', 21, 26, 'y', 'n'),
(21, 'Senang berkumpul, mudah berteman dan menyukai orang lain', 22, 26, 'y', 'n'),
(22, 'Senang dengan pujian dan ingin menjadi perhatian', 23, 26, 'y', 'n'),
(23, 'Menyenangkan, mudah memaafkan (tidak menyimpan dendam)', 24, 26, 'y', 'n'),
(24, 'Mengambil inisiatif/ menghindari hal-hal atau keadaan yang membosankan', 25, 26, 'y', 'n'),
(25, 'Menyukai hal-hal spontan', 38, 38, 'y', 'n'),
(26, 'Senang memimpin, membuat keputusan, dinamis dan aktif', 27, 1, 'y', 'n'),
(27, 'Bebas, mandiri dan berkemauan keras untuk mencapai sasaran', 28, 5, 'y', 'n'),
(28, 'Berani menghadapi tantangan dan masalah', 29, 7, 'y', 'n'),
(29, 'Prinsip \"hari esok harus lebih baik dari hari ini\"', 30, 15, 'y', 'n'),
(30, 'Mencari solusi dengan cepat', 31, 13, 'y', 'n'),
(31, 'Terdorong dengan tantangan, mampu menentukan tujuan, dan mendelegasikan pekerjaan dengan baik', 32, 20, 'y', 'n'),
(32, 'Tidak begitu perlu teman', 33, 8, 'y', 'n'),
(33, 'Biasanya benar dan punya visi ke depan', 39, 39, 'y', 'n'),
(35, 'Terimakasih Atas Kunjungan Anda', 0, 0, 'n', 'n'),
(36, 'Anda Merupakan Tipe Manusia Melankolis', 0, 0, 'n', 'y'),
(37, 'Anda Merupakan Tipe Manusia Plagmatis', 0, 0, 'n', 'y'),
(38, 'Anda Merupakan Tipe Manusia Koleris', 0, 0, 'n', 'y'),
(39, 'Anda Merupakan Tipe Manusia Sanguinis', 0, 0, 'n', 'y');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_diagnosa`
--
ALTER TABLE `tbl_diagnosa`
  ADD PRIMARY KEY (`kode_personal`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
