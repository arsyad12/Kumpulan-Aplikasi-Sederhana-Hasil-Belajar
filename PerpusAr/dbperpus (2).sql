-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2019 at 07:46 AM
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
-- Database: `dbperpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `nama` varchar(100) NOT NULL,
  `id` varchar(100) NOT NULL,
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

INSERT INTO `anggota` (`nama`, `id`, `status`, `alamat`, `tpid`, `no_hp`, `gender`, `email`, `foto`) VALUES
('roki', '12', 'kk', 'dsds', '2019-03-13', '3303030303', 'male', 'asdasa', 'null'),
('arsyad', '12', 'kk', 'dsds', '2019-03-13', '3303030303', 'male', 'asdasa', 'C:UserslenovoDownloads145845_skck_20190108092307.jpg'),
('arsyadbaso', '12', 'kk', 'dsds', '2019-03-13', '3303030303', 'male', 'asdasa', 'C:UserslenovoDownloads145845_skck_20190108092307.jpg'),
('arsyadbasofi', '12', 'kk', 'dsds', '2019-03-13', '3303030303', 'male', 'asdasa', 'C:UserslenovoDownloads145845_skck_20190108092307.jpg'),
('sam', '12', 'kk', 'dsds', '2019-03-13', '3303030303', 'male', 'asdasa', 'C:UserslenovoDownloads145845_skck_20190108092307.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id` varchar(100) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `penulis` varchar(100) NOT NULL,
  `terbit` date NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `masuk` date NOT NULL,
  `letak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id`, `nama_buku`, `genre`, `penulis`, `terbit`, `penerbit`, `masuk`, `letak`) VALUES
('P008', 'jatuh', 'romance', 'ar', '2019-02-11', 'rem', '2019-01-07', 'rak 32'),
('P002', 'Juli Yg Malang', 'Sad', 'Arsyad', '2019-01-06', 'roy', '2019-02-05', 'rak 2');

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
