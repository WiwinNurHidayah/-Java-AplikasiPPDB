-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2020 at 10:31 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dsiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `biosiswa`
--

CREATE TABLE `biosiswa` (
  `id` int(100) NOT NULL,
  `noun` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `namaOrangTuaWali` varchar(150) NOT NULL,
  `alamat` varchar(250) NOT NULL,
  `kabupaten` varchar(150) NOT NULL,
  `asalSekolah` varchar(100) NOT NULL,
  `agama` varchar(50) NOT NULL,
  `nilaiMtk` varchar(10) NOT NULL,
  `nilaiBindo` varchar(10) NOT NULL,
  `nilaiBingg` varchar(10) NOT NULL,
  `nilaiIpa` varchar(10) NOT NULL,
  `sumun` varchar(50) NOT NULL,
  `pil1` varchar(10) NOT NULL,
  `pil2` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biosiswa`
--

INSERT INTO `biosiswa` (`id`, `noun`, `nama`, `namaOrangTuaWali`, `alamat`, `kabupaten`, `asalSekolah`, `agama`, `nilaiMtk`, `nilaiBindo`, `nilaiBingg`, `nilaiIpa`, `sumun`, `pil1`, `pil2`) VALUES
(1, 'K001', 'Rizal', 'Arhim', 'Jl Gryu', 'Jina', 'SMP Wane', 'Islam', '100', '100', '100', '100', '400', 'RPL', 'TKJ'),
(2, 'K029', 'Taufiq', 'Arhim', 'Jl.Solo-Purwodadi km.10', 'Karanganyar', 'MTsN Gondangrejo', 'Islam', '2', '3', '2', '3', '10', 'MULTIMEDIA', 'RPL'),
(3, 'K987', 'Hidayat', 'Arhim', 'Jl.Solo-Purwodadi km.10', 'Karanganyar', 'MTsN Gondangrejo', 'Islam', '2', '2', '2', '2', '8', 'TKJ', 'RPL'),
(4, 'K827', 'Gantz', 'Edwin', 'Jl. Gatot Subriti no 12', 'Skywalk', 'SMP United', 'Islam', '1', '2', '3', '4', '10', 'TKJ', 'RPL'),
(5, 'K8721', 'wef', 'keke', 'qwer', '3eq', 'werf', '3eqwe', '1', '2', '1', '1', '5', 'RPL', 'MULTIMEDIA'),
(6, 'K3518062', 'wiwin', 'Kodrat', 'Bendosari, Sukoharjo', 'Sukoharjo', 'SMK N X Sukoharjo', 'Islam', '90', '90', '90', '90', '', 'RPL', 'MULTIMEDIA'),
(7, 'K3518062', 'nur', 'Kodrat', 'Sumedangan rt 2/rw 6', 'Sukoharjo', 'SMK N X Sukoharjo', 'Islam', '90', '90', '90', '90', '360', 'RPL', 'MULTIMEDIA'),
(9, 'kaka', 'kiki', 'burhan', 'Bandung', 'b', 'c', 's', '90', '90', '90', '90', '360', 'TKJ', 'MULTIMEDIA'),
(10, 'haha', 'hoho', 'huhu', 'Sumedangan', 'Sukoharjo', 'SMK n', 'Islam', '90', '90', '90', '90', '360', 'MULTIMEDIA', 'RPL'),
(11, 'haha', '', 'huhu', 'Sumedangan', 'Sukoharjo', 'SMK n', 'Islam', '90', '90', '90', '90', '360', 'null', 'null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biosiswa`
--
ALTER TABLE `biosiswa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `noun` (`noun`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biosiswa`
--
ALTER TABLE `biosiswa`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
