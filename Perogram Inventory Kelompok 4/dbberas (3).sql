-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2018 at 03:59 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbberas`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbbarang`
--

CREATE TABLE IF NOT EXISTS `tbbarang` (
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
('P001', 'cas', 'a', '10000', 'ss', 4, '40000', '4000', 36000, '2018-12-13'),
('P002', 'Anak Daro', 'Pulen', '1000000', 'beras topi koki 4 karung', 8, '8000000', '800000', 7200000, '2018-12-18'),
('p005', 'merpati', 'catu', '60000', '2', 5, '300000', '30000', 270000, '2018-12-05');

-- --------------------------------------------------------

--
-- Table structure for table `tblpelanggan`
--

CREATE TABLE IF NOT EXISTS `tblpelanggan` (
  `namapelanggan` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `nomorhp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpelanggan`
--

INSERT INTO `tblpelanggan` (`namapelanggan`, `alamat`, `email`, `nomorhp`) VALUES
('arsyad', 'jalan mulu jadian kaga', 'ss', 'erd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbbarang`
--
ALTER TABLE `tbbarang`
 ADD PRIMARY KEY (`KodeBeras`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
