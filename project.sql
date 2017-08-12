-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2017 at 06:49 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `id` int(10) NOT NULL,
  `comment_data` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `comment_data`) VALUES
(9009, 'How can I draw this Logic Diagram?'),
(9003, 'How can i solve this Problem? Sir'),
(9005, 'Is it Important for our Lab final?'),
(9002, 'It\'s DAtabase'),
(9004, 'It\'s Easy. just follow the rules'),
(9007, 'Sir, Is This Chapter essential for DSD?'),
(9001, 'which course is it?'),
(9008, 'Yes, It\'s.'),
(9006, 'Yes, It\'s. You will regularly coding'),
(9010, 'You can Buy This book and read.It will help you.');

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

CREATE TABLE `content` (
  `content_id` int(11) NOT NULL,
  `content_title` varchar(255) NOT NULL,
  `content_url` varchar(255) NOT NULL,
  `content_type` varchar(64) NOT NULL,
  `content_summary` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`content_id`, `content_title`, `content_url`, `content_type`, `content_summary`) VALUES
(2014001, '8085', 'www.micropro.com', 'Data Type', 'Information'),
(2015002, '8086 Interrupt', 'www.micro.com', 'Byte Type', 'Information'),
(2015003, '8085_stack_subroutine_interrupt', 'www.proccessor.com', 'Byte Type', 'Information'),
(2015004, 'Introduction to MDA-8086', 'www.microcomputer.com', 'Binary', 'Information'),
(2015005, '8086-datasheet', 'www.proccessr.com', 'Data Type', 'Information'),
(2015006, 'DSD', 'www.dsd.com', 'logic', 'information'),
(2015007, 'Logic', 'www.digital.com', 'Diagram', 'Information'),
(2015008, 'Booth', 'www.booth.com', 'Diagram', 'Information'),
(2015009, 'Sap', 'www.sap.com', 'Diagram', 'Information\r\n'),
(2015010, 'Arithmatic', 'www.dsb.com', 'Diagram', 'Information'),
(2015011, 'Query', 'www.query.com', 'Database', 'Information'),
(2015012, 'Subquery', 'www.subquery.com', 'Database', 'Information'),
(2015013, 'Database query', 'www.allquery.com', 'Typing', 'Information\r\n'),
(2015014, 'FlipFlop', 'www.dld.com', 'Diagram', 'Information'),
(2015015, 'Timing Diagram', 'www.digitallogin.com', 'Diagram', 'Information'),
(2015016, 'Logic Diagram', 'www.digitallogic.com', 'Diagram', 'Information'),
(2015017, 'Truth Table', 'www.truthlogic.com', 'Diagram', 'Information'),
(2015018, 'Java ', 'www.java.com', 'Language', 'Information'),
(2015019, 'Java Code', 'www.javacode.com', 'Language', 'Information\r\n'),
(2015020, 'JavaMain ', 'www.javaadmin.com', 'Language', 'Information');

-- --------------------------------------------------------

--
-- Table structure for table `content_course`
--

CREATE TABLE `content_course` (
  `content_course_id` int(10) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `content_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `content_course`
--

INSERT INTO `content_course` (`content_course_id`, `course_name`, `content_name`) VALUES
(1, 'Microprocessor', '8086-datasheet'),
(2, 'Microprocessor', '8085'),
(3, 'Microprocessor', '8086 Interrupt'),
(4, 'Microprocessor', '8085_stack_subroutine_interrupt'),
(5, 'Microprocessor', '8085'),
(6, 'DSD', 'Booth'),
(7, 'DSD', 'Sap'),
(8, 'DSD', 'Arithmatic'),
(9, 'DSD', 'DSD'),
(10, 'DSD', 'Logic'),
(11, 'Database', 'Subquery'),
(12, 'Database', 'Query'),
(13, 'Database', 'Database query'),
(14, 'DLD', 'FlipFlop'),
(15, 'DLD', 'Timing Diagram'),
(16, 'DLD', 'Logic Diagram'),
(17, 'DLD', 'Truth Table'),
(18, 'JAVA', 'Java '),
(19, 'JAVA', 'Java Code'),
(20, 'DSD', 'JavaMain ');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` int(10) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `course_dept` varchar(25) NOT NULL DEFAULT 'CSE',
  `course_hour` varchar(10) NOT NULL DEFAULT '3'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `course_name`, `course_dept`, `course_hour`) VALUES
(3101, 'Microprocessor', 'CSE', '3'),
(3102, 'DSD', 'CSE', '3'),
(3103, 'Database', 'CSE', '3'),
(3104, 'DLD', 'CSE', '3'),
(3105, 'JAVA', 'CSE', '3');

-- --------------------------------------------------------

--
-- Table structure for table `information`
--

CREATE TABLE `information` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(32) NOT NULL,
  `last_name` varchar(32) NOT NULL,
  `birth_date` date NOT NULL,
  `gender` varchar(8) NOT NULL,
  `creation_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `access_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `information`
--

INSERT INTO `information` (`user_id`, `first_name`, `last_name`, `birth_date`, `gender`, `creation_date`, `access_id`) VALUES
(2017001, 'Adam ', 'Johnson', '1997-07-13', 'Male', '2017-07-28 19:16:12', 1000001),
(2017002, 'Matt', 'Taylor', '1996-07-13', 'Male', '2017-07-28 19:16:12', 1000002),
(2017003, 'Simon', 'Hodge', '1997-07-12', 'Male', '2017-07-19 07:17:32', 1000003),
(2017004, 'Ricky', 'Ponting', '1998-07-10', 'Male', '2017-07-31 12:20:20', 1000005),
(2017005, 'Smith ', 'Taylor', '1998-01-09', 'Male', '2017-07-16 04:21:19', 1000005),
(2017006, 'Pathan', 'Khan', '1996-07-30', 'Male', '2017-07-28 14:40:35', 1000006),
(2017007, 'Steven', 'Johnson', '1999-03-01', 'Male', '2017-07-23 05:25:24', 1000007),
(2017008, 'Joe', 'Root', '1997-07-02', 'Male', '2017-07-28 13:41:15', 1000008),
(2017009, 'Peterson', 'Paul', '1997-04-23', 'Male', '2017-07-23 08:24:11', 1000009),
(2017010, 'Taylor', 'Johnson', '1997-07-02', 'Male', '2017-07-03 07:31:30', 1000010);

-- --------------------------------------------------------

--
-- Table structure for table `takes`
--

CREATE TABLE `takes` (
  `takes_id` int(10) NOT NULL,
  `course_id` int(10) NOT NULL,
  `grade` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teaches`
--

CREATE TABLE `teaches` (
  `teaches_id` int(10) NOT NULL,
  `course_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teaches`
--

INSERT INTO `teaches` (`teaches_id`, `course_id`) VALUES
(2016001, 3101),
(2016001, 3102);

-- --------------------------------------------------------

--
-- Table structure for table `tutor`
--

CREATE TABLE `tutor` (
  `tutor_id` int(10) NOT NULL,
  `tutor_name` varchar(64) NOT NULL,
  `access_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tutor`
--

INSERT INTO `tutor` (`tutor_id`, `tutor_name`, `access_id`) VALUES
(2016001, 'Ahsan', 1000011),
(2016002, 'Shuvo', 1000012),
(2016003, 'Rabbi', 1000013),
(2016004, 'Sabbir', 1000014),
(2016005, 'Salman', 1000015);

-- --------------------------------------------------------

--
-- Table structure for table `tutor_review`
--

CREATE TABLE `tutor_review` (
  `id` int(10) NOT NULL,
  `tutor_id` int(10) NOT NULL,
  `comment_data` varchar(100) DEFAULT NULL,
  `time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `status` int(2) NOT NULL,
  `access_key` varchar(15) NOT NULL,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`, `email`, `status`, `access_key`, `time`) VALUES
(2017001, 'Adam', '123', 'adam@gmail.com', 1, '1000001', '2017-07-04 06:17:19'),
(2017002, 'Matt', '456', 'matt@gmail.com', 2, '1000002', '2017-07-17 08:11:44'),
(2017003, 'Simon', '789', 'simon@gmail.com', 2, '1000003', '2017-07-23 13:34:09'),
(2017004, 'Ricky', '123', 'ricky@gmail.com', 6, '1000004', '2017-07-26 14:15:35'),
(2017005, 'Smith', '456', 'smith@gmail.com', 5, '1000005', '2017-07-10 07:19:14'),
(2017006, 'Pathan', '789', 'pathan@gmail.com', 4, '1000006', '2017-07-24 05:31:32'),
(2017007, 'Steven', '123', 'steven@gmail.com', 7, '1000007', '2017-07-02 07:18:35'),
(2017008, 'Joe', '456', 'joe@gmail.com', 8, '1000008', '2017-07-30 05:15:40'),
(2017009, 'Peterson', '789', 'peterson@gmail.com', 3, '1000009', '2017-07-17 05:17:18'),
(2017010, 'Taylor', '000', 'taylor@gmail.com', 5, '1000010', '2017-07-24 06:15:21');

-- --------------------------------------------------------

--
-- Table structure for table `user_review`
--

CREATE TABLE `user_review` (
  `id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `comment_data` varchar(100) DEFAULT NULL,
  `time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `comment_data` (`comment_data`);

--
-- Indexes for table `content`
--
ALTER TABLE `content`
  ADD PRIMARY KEY (`content_id`),
  ADD UNIQUE KEY `ContentUrl` (`content_url`),
  ADD UNIQUE KEY `content_title` (`content_title`);

--
-- Indexes for table `content_course`
--
ALTER TABLE `content_course`
  ADD UNIQUE KEY `content_course_id_2` (`content_course_id`),
  ADD KEY `content_course_id` (`content_course_id`),
  ADD KEY `course_name` (`course_name`),
  ADD KEY `content_name` (`content_name`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`),
  ADD UNIQUE KEY `course_name` (`course_name`);

--
-- Indexes for table `information`
--
ALTER TABLE `information`
  ADD UNIQUE KEY `user_id_2` (`user_id`),
  ADD KEY `AccessId` (`access_id`),
  ADD KEY `user_id` (`user_id`) USING BTREE;

--
-- Indexes for table `takes`
--
ALTER TABLE `takes`
  ADD KEY `takes_id` (`takes_id`),
  ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `teaches`
--
ALTER TABLE `teaches`
  ADD KEY `teaches_id` (`teaches_id`),
  ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `tutor`
--
ALTER TABLE `tutor`
  ADD PRIMARY KEY (`tutor_id`),
  ADD KEY `AccessId` (`access_id`);

--
-- Indexes for table `tutor_review`
--
ALTER TABLE `tutor_review`
  ADD KEY `id` (`id`),
  ADD KEY `tutor_id` (`tutor_id`),
  ADD KEY `comment_data` (`comment_data`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`) USING BTREE,
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `user_review`
--
ALTER TABLE `user_review`
  ADD KEY `id` (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `comment_data` (`comment_data`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `content_course`
--
ALTER TABLE `content_course`
  MODIFY `content_course_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `course_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3106;
--
-- AUTO_INCREMENT for table `tutor`
--
ALTER TABLE `tutor`
  MODIFY `tutor_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2016006;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2017011;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `content_course`
--
ALTER TABLE `content_course`
  ADD CONSTRAINT `content_course_ibfk_2` FOREIGN KEY (`course_name`) REFERENCES `course` (`course_name`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `content_course_ibfk_3` FOREIGN KEY (`content_name`) REFERENCES `content` (`content_title`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `information`
--
ALTER TABLE `information`
  ADD CONSTRAINT `information_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `takes`
--
ALTER TABLE `takes`
  ADD CONSTRAINT `takes_ibfk_1` FOREIGN KEY (`takes_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `takes_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `teaches`
--
ALTER TABLE `teaches`
  ADD CONSTRAINT `teaches_ibfk_1` FOREIGN KEY (`teaches_id`) REFERENCES `tutor` (`tutor_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `teaches_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `tutor_review`
--
ALTER TABLE `tutor_review`
  ADD CONSTRAINT `tutor_review_ibfk_1` FOREIGN KEY (`id`) REFERENCES `comment` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `tutor_review_ibfk_2` FOREIGN KEY (`tutor_id`) REFERENCES `tutor` (`tutor_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `tutor_review_ibfk_3` FOREIGN KEY (`comment_data`) REFERENCES `comment` (`comment_data`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `user_review`
--
ALTER TABLE `user_review`
  ADD CONSTRAINT `user_review_ibfk_1` FOREIGN KEY (`id`) REFERENCES `comment` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `user_review_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `user_review_ibfk_3` FOREIGN KEY (`comment_data`) REFERENCES `comment` (`comment_data`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
