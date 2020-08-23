-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2018 at 05:58 PM
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
-- Database: `dbberas`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbbarang`
--

CREATE TABLE `tbbarang` (
  `KodeBeras` varchar(5) NOT NULL,
  `NamaBeras` varchar(20) NOT NULL,
  `JenisBeras` varchar(10) NOT NULL,
  `harga` decimal(11,0) NOT NULL,
  `bonus` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `diskon` decimal(10,0) NOT NULL,
  `totalharga` double NOT NULL,
  `expired` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbbarang`
--

INSERT INTO `tbbarang` (`KodeBeras`, `NamaBeras`, `JenisBeras`, `harga`, `bonus`, `jumlah`, `total`, `diskon`, `totalharga`, `expired`) VALUES
('P001', 'cas', 'a', '10000', 'anak daro', 4, '40000', '4000', 36000, '2018-12-13'),
('P002', 'Anak Daro', 'Pulen', '1000000', 'beras topi koki 4 karung', 8, '8000000', '800000', 7200000, '2018-12-18'),
('p004', 'merpati', 'catu', '6000', '2', 5, '30000', '3000', 27000, '2018-12-05'),
('p005', 'merpati', 'catu', '60000', '2', 5, '300000', '30000', 270000, '2018-12-05'),
('p006', 'merpati', 'catu', '60000', '2', 5, '300000', '30000', 270000, '2018-12-05');

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `namaadmin` varchar(100) NOT NULL,
  `alamatadmin` varchar(100) NOT NULL,
  `emailadmin` varchar(100) NOT NULL,
  `nohp` varchar(100) NOT NULL,
  `shift` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`namaadmin`, `alamatadmin`, `emailadmin`, `nohp`, `shift`) VALUES
('rony', 'jalan merpati', 'ronysuka@gmail.com', '08923734747', 'siang'),
('Arsyad Basofil Amri', 'Jl. flamboyann', 'arsyad', '085278685693', 'malam'),
('fajar', 'jalan tua', 'fajarsuki@gmail.com', '09081208012', 'pagi');

-- --------------------------------------------------------

--
-- Table structure for table `tbllogin`
--

CREATE TABLE `tbllogin` (
  `user` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `repass` varchar(100) NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbllogin`
--

INSERT INTO `tbllogin` (`user`, `pass`, `repass`, `level`) VALUES
('arsyad', '1231', '1231', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tblpelanggan`
--

CREATE TABLE `tblpelanggan` (
  `namapelanggan` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `nomorhp` varchar(100) NOT NULL,
  `ket` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpelanggan`
--

INSERT INTO `tblpelanggan` (`namapelanggan`, `alamat`, `email`, `nomorhp`, `ket`) VALUES
('arsyad', 'jalan mulu jadian kaga', 'ss', 'erd', '0'),
('asdok', 'asdpoasd', 'asdas', '12312', 'mem'),
('andik', 'jalan jalan men', 'arsyadtahu@gmail.com', '089292939', 'member');

-- --------------------------------------------------------

--
-- Table structure for table `tblpenjualan`
--

CREATE TABLE `tblpenjualan` (
  `idpenjualan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlajjual` int(11) NOT NULL,
  `totaljual` int(11) NOT NULL,
  `KodeBeras` varchar(100) NOT NULL,
  `id_pelanggan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbbarang`
--
ALTER TABLE `tbbarang`
  ADD PRIMARY KEY (`KodeBeras`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
