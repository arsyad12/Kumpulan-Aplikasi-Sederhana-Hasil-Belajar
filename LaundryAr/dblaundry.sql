-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2019 at 12:00 PM
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
-- Database: `dblaundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id_client` varchar(100) NOT NULL,
  `nama_client` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tpid` date NOT NULL,
  `no_hp` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `foto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id_client`, `nama_client`, `status`, `alamat`, `tpid`, `no_hp`, `gender`, `email`, `foto`) VALUES
('CL001', 'Arsyad', 'Tetap', 'JLJL', '2019-05-15', '0898989', 'male', 'ar@gmail.com', '');

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
('ar', 'ar', 'ar', 'admin'),
('arsyad', 'arsyad', 'arsyad', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(100) NOT NULL,
  `nama_petugas` varchar(100) NOT NULL,
  `jam_kerja` varchar(100) NOT NULL,
  `spesialis` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `no_hp` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sepatu`
--

CREATE TABLE `sepatu` (
  `id_sepatu` varchar(100) NOT NULL,
  `nama_sepatu` varchar(100) NOT NULL,
  `jenis_sepatu` varchar(100) NOT NULL,
  `banyak_sepatu` int(11) NOT NULL,
  `tgl_kirim` date NOT NULL,
  `tgl_jemput` date NOT NULL,
  `letak` varchar(100) NOT NULL,
  `foto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sepatu`
--

INSERT INTO `sepatu` (`id_sepatu`, `nama_sepatu`, `jenis_sepatu`, `banyak_sepatu`, `tgl_kirim`, `tgl_jemput`, `letak`, `foto`) VALUES
('SP001', 'EAZY', 'kulit', 4, '2019-03-12', '2019-03-21', 'rak 4', ''),
('SP002', 'LOL', 'kain', 41, '2019-03-12', '2019-03-21', 'rak 12', '');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_pengembalian` varchar(100) NOT NULL,
  `id_sepatu` varchar(100) NOT NULL,
  `id_client` varchar(100) NOT NULL,
  `id_petugas` varchar(100) NOT NULL,
  `tglantar` date NOT NULL,
  `tgljemput` date NOT NULL,
  `banyaksepatu` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_pengembalian`, `id_sepatu`, `id_client`, `id_petugas`, `tglantar`, `tgljemput`, `banyaksepatu`, `harga`, `total`) VALUES
('KB001', 'SP001', 'CL001', 'PT004', '2019-05-01', '2019-05-07', 5, 10000, 50000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_client`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`nama`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `sepatu`
--
ALTER TABLE `sepatu`
  ADD PRIMARY KEY (`id_sepatu`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD KEY `id_sepatu` (`id_sepatu`,`id_client`),
  ADD KEY `id_client` (`id_client`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id_client`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_sepatu`) REFERENCES `sepatu` (`id_sepatu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
