-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 28, 2021 at 08:44 PM
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
-- Table structure for table `workoutbean`
--

CREATE TABLE `workoutbean` (
  `workoutName` varchar(255) NOT NULL,
  `averageCalorieBurn` int(11) DEFAULT NULL,
  `workoutDescription` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workoutbean`
--

INSERT INTO `workoutbean` (`workoutName`, `averageCalorieBurn`, `workoutDescription`) VALUES
('Barbell Deadlift', 5, 'Squat down and grasp a barbell with your hands roughly shoulder-width apart. Keep your chest up, pull your shoulders back and look straight ahead as you lift the bar. Focus on taking the weight back onto your heels and keep the bar as close as possible to your body at all times. Lift to thigh level, pause, then return under control to the start position.'),
('Barbell Overhead Press', 4, 'Stand with your feet shoulder-width apart with your core set tight and a barbell held at your shoulders, palms facing forwards. From here, tense and drive the bar upward, really squeezing your shoulder blades together at the top of the movement. Lower with control.'),
('Bicycle', 3, 'Lie flat on the back.  Stretch your legs out straight.  Keeping your arms interlocked behind your head, raise your shoulder off the ground.   Raise your legs. To begin the exercise start with the bicycle-pedaling motion - one leg goes in as the other goes out. Simultaneously rotate your upper body while trying to reach your knee with the opposite elbow.'),
('Cable Crossover', 4, 'Stand between two facing cable stations with both pulleys set midway between the top and bottom of the station. Attach a D-handle to each pulley and hold one in each hand. Keep your elbows slightly bent, and step forward so there’s tension on the cables.\r\n'),
('Crunches', 6, 'Lie on your back with your knees bent, put your hands behind your head. Now lift your shoulders and raise your upper body off the floor. Slowly, return to starting position. Repeat this at least 20 times. You can do as many reps depending on your strength and stamina. Crunches can also be done with variations like side crunches, twist crunches, and reverse crunch.'),
('Dumbbell Bench Press\r\n', 5, ':Lie back on a flat bench with a dumbbell in each hand. Hold the weights at shoulder-level, then press the weights straight up.'),
('Dumbbell Press', 6, 'Either stand with a pair of dumbbells at your sides or set up a cable machine so the handles are at the lowest points, grabbing the left handle with your right hand and vice versa.  Set your feet at shoulder width, pivot forward slightly at the hips, engage your core and pull your shoulder blades together to lift the weights out to your sides. Lower with control.'),
('Elevated Hip Thrusters', 5, 'Set up with your back against an elevated surface (like a bench or a box) with your knees bent and feet flat on the ground. The bench should hit just below your shoulder blades, and your feet should be about shoulder-width apart. You can rest your elbows on the bench. \r\nKeeping your chin tucked, push through your heels until your thighs reach parallel to the floor — your legs should form a 90-degree angle. Squeeze your glutes at the top, then return to start. '),
('Floor Press\r\n', 6, 'Lie on the floor with a dumbbell in each hand. Your palms should face each other and your triceps (but not your elbows) should rest on the floor. Explosively press the dumbbells up. Lower them until only your triceps touch the floor. Pause for a moment, then begin the next rep. Increase the weight gradually each set.\r\n'),
('Glute Ham Raise', 4, 'Set up in a GHD with your knees bent, hips extended, and torso upright. Straighten your legs while keeping your hips extended. Continue until your body is in a straight line and parallel to the floor. Pull yourself back to the starting position using your hamstrings. Repeat for the desired number of repetitions. \r\n'),
('Inverted Row\r\n', 4, 'Set up a bar in a rack at waist height. Grab it with a wider than shoulder-width overhand grip and hang underneath. Position yourself with heels out in front of you and arms fully extended. Your body should be straight from shoulders to ankles. Flex at the elbows to pull your chest up to the bar. Lower yourself back to the start position under control.\r\n'),
('Lunges', 6, 'Start by standing up tall. Step forward with one foot until your leg reaches a 90-degree angle. Your rear knee should remain parallel to the ground and your front knee shouldn’t go beyond your toes. Lift your front lunging leg to return to the starting position. Repeat 10 to 12 reps on one leg, or switch off between legs until you’ve totaled 10 to 12 reps per leg.'),
('Plank', 5, 'Lie down facing your stomach towards the floor. Now place your hands on the floor at shoulder length and raise your body, only on the support of your palms and toes. Plank holds are not only challenging but also helps in increasing your endurance in the abs and stability. Again there are variations that can be done like elbow planks, adding weights, rolling planks, side planks and many more.\r\n'),
('Pull Ups', 7, 'Grab the handles of the pull-up station with your palms facing away from you and your arms fully extended.  Your hands should be around shoulder-width apart. Squeeze your shoulder blades together, exhale and drive your elbows towards your hips to bring your chin above the bar. Lower under control back to the start position.\r\n'),
('Renegade Row\r\n', 3, 'Get into a press-up position with your hands on the handles of two dumbbells. Keeping your core tensed, row the right dumbbell up to your abs then return to the start position. Repeat with the left dumbbell to complete one rep.\r\n'),
('Reverse Cable Crossover', 4, 'Stand in between the cable machines, with the handles set at the highest points. As with the cable lateral raise, grab the handles in the opposite hands, but this time draw them to your chest so your arms are crossed a bit like Wolverine. Lean forward slightly and draw your arms out and down. Again, a bit like Wolverine but in his full, claws-out extension. \r\n'),
('Single Leg Deadlift ', 8, 'Stand on one leg with your knee slightly bent and hold a dumbbell in each hand. Start bending at the hips and extend your free leg behind you. Lower your torso until you\'re parallel to the floor. Return to the starting position and repeat with the opposite leg. '),
('Spider Man', 4, 'Get into a plank position with your hands shoulder-width apart on the floor.  Keeping your hips parallel to the floor, lift your left leg and bring it toward your left elbow. Return to the original position and repeat with the other leg.\r\n'),
('Squats', 8, 'Stand with feet a little wider than hip width, toes facing front. Drive your hips back—bending at the knees and ankles and pressing your knees slightly open—as you…Sit into a squat position while still keeping your heels and toes on the ground, chest up and shoulders back. Strive to eventually reach parallel, meaning knees are bent to a 90-degree angle. Press into your heels and straighten legs to return to a standing upright position. '),
('Standard Push-ups\r\n', 7, 'To do a single push up, bend your elbows and get your chest as close to the floor as possible. Make sure to keep your back and legs in a straight line the whole time.'),
('TRX Low Row', 2, 'Lie under the TRX and grab hold of the handles. Raise your body, drawing your shoulders back to focus the work on your lats for that V-shape. '),
('Vertical Leg Raises ', 4, 'Lie down on your back. With palms placed below your hips, slowly lift your legs to a 90-degree angle keeping knee straight and feet pointing the roof. Pause for a moment, and then lower your legs back down while exhaling out. Once you are comfortable with the basic variants, go ahead with hanging leg raise.\r\n'),
('Wide Push-Ups\r\n', 3, 'Rather than having your hands shoulder width apart, try pushing them a little wider.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `workoutbean`
--
ALTER TABLE `workoutbean`
  ADD PRIMARY KEY (`workoutName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
