-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 20, 2020 at 02:04 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `areas`
--

DROP TABLE IF EXISTS `areas`;
CREATE TABLE IF NOT EXISTS `areas` (
  `idAreas` int(11) NOT NULL DEFAULT '0',
  `increment` double DEFAULT NULL,
  `preBasic` double DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `idEmployee` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idAreas`),
  KEY `fk_Areas_Employee1_idx` (`idEmployee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `designation`
--

DROP TABLE IF EXISTS `designation`;
CREATE TABLE IF NOT EXISTS `designation` (
  `idDesignation` int(11) NOT NULL DEFAULT '0',
  `dName` varchar(200) DEFAULT NULL,
  `bSalary` double DEFAULT NULL,
  `sCat` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDesignation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `designation`
--

INSERT INTO `designation` (`idDesignation`, `dName`, `bSalary`, `sCat`) VALUES
(1, 'Apprentice Surveyor', 16720, 'Normal');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `idEmployee` int(11) NOT NULL DEFAULT '0',
  `name` varchar(200) DEFAULT NULL,
  `bDate` date DEFAULT NULL,
  `gender` varchar(200) DEFAULT NULL,
  `nic` varchar(200) DEFAULT NULL,
  `pAddress` varchar(200) DEFAULT NULL,
  `tAddress` varchar(200) DEFAULT NULL,
  `mobile` varchar(200) DEFAULT NULL,
  `telephone` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `acntNo` varchar(45) DEFAULT NULL,
  `bank` varchar(100) DEFAULT NULL,
  `jDate` date DEFAULT NULL,
  `aDate` date DEFAULT NULL,
  `oDetails` varchar(200) DEFAULT NULL,
  `idDesignation` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idEmployee`),
  KEY `fk_Employee_Designation1_idx` (`idDesignation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`idEmployee`, `name`, `bDate`, `gender`, `nic`, `pAddress`, `tAddress`, `mobile`, `telephone`, `email`, `acntNo`, `bank`, `jDate`, `aDate`, `oDetails`, `idDesignation`) VALUES
(10031, 'Nimal', '1995-10-10', 'Male', '951111111v', 'Kaluthara', 'Kaluthara', '0777123456', '0777123456', 'nimal@gmail.com', '545454545', 'BOC', '2020-05-19', '2020-05-31', '', 1),
(10032, 'Nadeesha', '1997-08-01', 'Female', '972222222v', '', '', '0758965412', '0115565566', 'nadeesha@gmail.com', '', '', '2020-05-19', '2021-01-01', 'qaqaqaq', 1);

-- --------------------------------------------------------

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
CREATE TABLE IF NOT EXISTS `loan` (
  `idLoan` int(11) NOT NULL DEFAULT '0',
  `lAmount` double DEFAULT NULL,
  `mInstalment` double DEFAULT NULL,
  `lPeriod` float DEFAULT NULL,
  `sDate` date DEFAULT NULL,
  `eDate` date DEFAULT NULL,
  `bank` varchar(100) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `idEmployee` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idLoan`),
  KEY `fk_Loan_Employee1_idx` (`idEmployee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE IF NOT EXISTS `salary` (
  `idSalary` int(11) NOT NULL DEFAULT '0',
  `month` varchar(45) DEFAULT NULL,
  `basic` double DEFAULT NULL,
  `allowance` double DEFAULT NULL,
  `cLiving` double DEFAULT NULL,
  `sAllowance` double DEFAULT NULL,
  `tel` double DEFAULT NULL,
  `lAlowance` double DEFAULT NULL,
  `fuel` double DEFAULT NULL,
  `lanR` double DEFAULT NULL,
  `areas` double DEFAULT NULL,
  `stamp` double DEFAULT NULL,
  `union` double DEFAULT NULL,
  `welfare` double DEFAULT NULL,
  `festival` double DEFAULT NULL,
  `agrahara` double DEFAULT NULL,
  `wop` double DEFAULT NULL,
  `tax` double DEFAULT NULL,
  `sClub` double DEFAULT NULL,
  `loan` double DEFAULT NULL,
  `hRent` double DEFAULT NULL,
  `electricity` double DEFAULT NULL,
  `water` double DEFAULT NULL,
  `noPayDays` double DEFAULT NULL,
  `noPayTotal` double DEFAULT NULL,
  `tEarning` double DEFAULT NULL,
  `tGross` double DEFAULT NULL,
  `tDeduction` double DEFAULT NULL,
  `nPay` double DEFAULT NULL,
  `idEmployee` int(11) NOT NULL DEFAULT '0',
  `idSUser` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idSalary`),
  KEY `fk_Salary_Employee1_idx` (`idEmployee`),
  KEY `fk_Salary_SUser1_idx` (`idSUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ssettings`
--

DROP TABLE IF EXISTS `ssettings`;
CREATE TABLE IF NOT EXISTS `ssettings` (
  `idSSettings` int(11) NOT NULL DEFAULT '0',
  `sType` varchar(70) DEFAULT NULL,
  `percentage` double DEFAULT NULL,
  PRIMARY KEY (`idSSettings`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ssettings`
--

INSERT INTO `ssettings` (`idSSettings`, `sType`, `percentage`) VALUES
(1, 'Cost of Living', 100),
(2, 'Allowance', 5),
(3, 'Special Allowance', 10000),
(4, 'Fuel', 3),
(5, 'Lecturer Allowance', 6),
(6, 'LAN', 30),
(7, 'Telephone', 50),
(8, 'Stamp', 20),
(9, 'Union', 15),
(10, 'Welfare', 60),
(11, 'W&OP', 10),
(12, 'Agrahara', 40),
(13, 'Tax', 6),
(14, 'Sports Club', 20);

-- --------------------------------------------------------

--
-- Table structure for table `suser`
--

DROP TABLE IF EXISTS `suser`;
CREATE TABLE IF NOT EXISTS `suser` (
  `idSUser` int(11) NOT NULL DEFAULT '0',
  `userName` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `type` varchar(200) NOT NULL DEFAULT '',
  `idEmployee` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idSUser`),
  KEY `fk_SUser_UserType1_idx` (`type`),
  KEY `fk_SUser_Employee1_idx` (`idEmployee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `suser`
--

INSERT INTO `suser` (`idSUser`, `userName`, `password`, `type`, `idEmployee`) VALUES
(2, 'Nimal', '678', 'Admin', 10031),
(3, 'Nadeesha', '123', 'OfficeUser', 10032);

-- --------------------------------------------------------

--
-- Table structure for table `usertype`
--

DROP TABLE IF EXISTS `usertype`;
CREATE TABLE IF NOT EXISTS `usertype` (
  `type` varchar(200) NOT NULL DEFAULT '',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usertype`
--

INSERT INTO `usertype` (`type`) VALUES
('Admin'),
('OfficeUser');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `areas`
--
ALTER TABLE `areas`
  ADD CONSTRAINT `fk_Areas_Employee1` FOREIGN KEY (`idEmployee`) REFERENCES `employee` (`idEmployee`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `fk_Employee_Designation1` FOREIGN KEY (`idDesignation`) REFERENCES `designation` (`idDesignation`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `loan`
--
ALTER TABLE `loan`
  ADD CONSTRAINT `fk_Loan_Employee1` FOREIGN KEY (`idEmployee`) REFERENCES `employee` (`idEmployee`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `salary`
--
ALTER TABLE `salary`
  ADD CONSTRAINT `fk_Salary_Employee1` FOREIGN KEY (`idEmployee`) REFERENCES `employee` (`idEmployee`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Salary_SUser1` FOREIGN KEY (`idSUser`) REFERENCES `suser` (`idSUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `suser`
--
ALTER TABLE `suser`
  ADD CONSTRAINT `fk_SUser_Employee1` FOREIGN KEY (`idEmployee`) REFERENCES `employee` (`idEmployee`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_SUser_UserType1` FOREIGN KEY (`type`) REFERENCES `usertype` (`type`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
