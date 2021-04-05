-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2021 at 08:37 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fitnesstracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `userbean`
--

CREATE TABLE `userbean` (
  `id` int(11) NOT NULL,
  `bmi` double DEFAULT NULL,
  `fullName` varchar(255) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(11) DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `yearsOfSubscription` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userbean`
--

INSERT INTO `userbean` (`id`, `bmi`, `fullName`, `height`, `password`, `phoneNumber`, `weight`, `yearsOfSubscription`) VALUES
(1, 22, 'Kajal T', 159, 'Kajal', '534231', 48, 0),
(2, 19, 'Sahithi A', 160, 'Sahithi', '656576576', 48, 0),
(3, 21, 'Deepthi S', 160, 'Deepthi', '65467456', 50, 1),
(4, 23, 'Divija C', 163, 'Divija ', '54765467', 52, NULL),
(5, 22, 'Nikhil L', 170, 'Nikhil', '46768998', 70, 1),
(6, 21, 'Muskaan S', 166, 'Muskaan', '3456789', 54, NULL),
(7, 25, 'Raj K', 177, 'Rajk', '34567892', 77, NULL),
(8, 18, 'Sneha D', 157, 'Sneha', '8653456', 44, 1),
(9, 26, 'Sonam K', 168, 'Sonam', '9876543', 82, 1),
(10, 20, 'Supriya T', 161, 'Supriya', '98765435', 59, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `userbean`
--
ALTER TABLE `userbean`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
