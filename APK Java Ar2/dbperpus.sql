-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2019 at 09:24 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbperpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tpid` date NOT NULL,
  `no_hp` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `foto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `nama`, `status`, `alamat`, `tpid`, `no_hp`, `gender`, `email`, `foto`) VALUES
('AG001', 'Arsyadkun', 'PACARAN DONG KK', 'JL JL MULU NIKAH kAPAN', '2019-05-14', '085278685693', 'MALE', 'arsyadbaso123@gmail.com', ''),
('AG002', 'Arsyadkun', 'PACARAN DONG KK', 'JL JL MULU NIKAH kAPAN', '2019-05-16', '085278685693', 'MALE', 'arsyadbaso123@gmail.com', '');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(100) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `penulis` varchar(100) NOT NULL,
  `terbit` date NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `masuk` date NOT NULL,
  `letak` varchar(100) NOT NULL,
  `foto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `nama_buku`, `genre`, `penulis`, `terbit`, `penerbit`, `masuk`, `letak`, `foto`) VALUES
('P001', 'aku', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P0010', 'akuw', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P002', 'Juli Yg Malang', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P003', 'kamu', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P004', 'ssss', 'Sadss', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P005', 'dia', 'Sadss', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P006', 'lo', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P007', 'kk', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', ''),
('P008', 'jatuh', 'romance', 'ar', '2019-02-11', 'rem', '2019-01-07', 'rak 32', ''),
('P009', 'lsk', 'Sadss', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `nama` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `repass` varchar(100) NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`nama`, `pass`, `repass`, `status`) VALUES
('arsyad', 'arsyad', 'arsyad', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `id_pinjam` varchar(100) NOT NULL,
  `id_buku` varchar(100) NOT NULL,
  `id_anggota` varchar(100) NOT NULL,
  `tanggalpinjam` date NOT NULL,
  `tanggalkembali` date NOT NULL,
  `deadline` date NOT NULL,
  `lamapinjam` varchar(100) NOT NULL,
  `terlambat` varchar(100) NOT NULL,
  `denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`id_pinjam`, `id_buku`, `id_anggota`, `tanggalpinjam`, `tanggalkembali`, `deadline`, `lamapinjam`, `terlambat`, `denda`) VALUES
('PI001', 'BK001', 'AG002', '2019-05-01', '2019-05-09', '2019-05-03', '8', '6', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE `pinjam` (
  `id_pinjam` varchar(100) NOT NULL,
  `id_buku` varchar(100) NOT NULL,
  `id_anggota` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `tglpinjam` date NOT NULL,
  `tglkembali` date NOT NULL,
  `petugas` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`id_pinjam`, `id_buku`, `id_anggota`, `status`, `tglpinjam`, `tglkembali`, `petugas`) VALUES
('PI001', 'BK002', 'AG002', 'Anggota Baru', '2019-05-03', '2019-05-09', 'arsyad'),
('PI002', 'BK001', 'AG001', 'Anggota Baru', '2019-05-02', '2019-05-09', 'arsyad'),
('PI003', 'BK003', 'AG003', 'Anggota Baru', '2019-05-04', '2019-05-09', 'arsyad');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`id_pinjam`);

--
-- Indexes for table `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`id_pinjam`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
