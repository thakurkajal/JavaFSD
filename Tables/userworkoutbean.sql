-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2021 at 08:14 AM
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
-- Table structure for table `userworkoutbean`
--

CREATE TABLE `userworkoutbean` (
  `userWorkoutId` int(11) NOT NULL,
  `caloriesBurnedByUser` int(11) DEFAULT 0,
  `workoutName` varchar(255) DEFAULT NULL,
  `workoutTime` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userworkoutbean`
--

INSERT INTO `userworkoutbean` (`userWorkoutId`, `caloriesBurnedByUser`, `workoutName`, `workoutTime`, `user_id`) VALUES
(0, 0, 'Glute Ham Raise', 5, 3),
(1, 0, 'Plank', 2, 1),
(2, 0, 'Pull Ups', 5, 2),
(3, 0, 'Bicycle', 20, 4),
(4, 0, 'Floor Press', 5, 5),
(5, 0, 'Elevated Hip Thrusters', 8, 2),
(6, 0, 'Bicycle', 25, 1),
(7, 0, 'Dumbbell Bench Press', 10, 1),
(8, 0, 'Crunches', 15, 4),
(9, 0, 'Lunges', 8, 2),
(10, 0, 'TRX Low Row', 5, 4),
(11, 0, 'Spider Man', 15, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `userworkoutbean`
--
ALTER TABLE `userworkoutbean`
  ADD PRIMARY KEY (`userWorkoutId`),
  ADD KEY `FKip169gfk8prwolxr09up489si` (`user_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `userworkoutbean`
--
ALTER TABLE `userworkoutbean`
  ADD CONSTRAINT `FKip169gfk8prwolxr09up489si` FOREIGN KEY (`user_id`) REFERENCES `userbean` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
