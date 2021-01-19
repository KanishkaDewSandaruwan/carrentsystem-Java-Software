-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2020 at 06:10 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carrent`
--

-- --------------------------------------------------------

--
-- Table structure for table `carreg`
--

CREATE TABLE `carreg` (
  `id` int(11) NOT NULL,
  `car_reg` varchar(255) NOT NULL,
  `delar_code` varchar(255) NOT NULL,
  `manufacture` varchar(255) NOT NULL,
  `model` varchar(255) NOT NULL,
  `color` varchar(100) NOT NULL,
  `chasi_number` varchar(255) NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `rent_fee` int(255) NOT NULL,
  `available` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `carreg`
--

INSERT INTO `carreg` (`id`, `car_reg`, `delar_code`, `manufacture`, `model`, `color`, `chasi_number`, `car_number`, `rent_fee`, `available`) VALUES
(1, 'C0001', 'D0001', 'Honda', 'Civic', 'black', 'CH2547', 'SPBGY4774', 1500, 'Yes'),
(2, 'C0002', 'D0001', 'Honda', 'Fit', 'Maroon', 'CH1245', 'SPGTR4578', 1200, 'Yes'),
(7, 'C0003', 'D0002', 'Toyota', 'Air', 'get Black', 'KT458712', 'SPCAE1245', 1500, 'Yes'),
(8, 'C0004', 'D0002', 'TATA', 'CIVi', 'white', 'MK1245', 'SPDFG7845', 1800, 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `customer_id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `mobile` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `nic` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `customer_id`, `name`, `address`, `mobile`, `email`, `gender`, `nic`) VALUES
(2, 'U0001', 'Kanishak Dew Sandaruwan', 'Kosmulla, Neluwa', '0713664071', 'kanishkadewsandaruwan@gmail.com', 'Male', '962670423V'),
(3, 'U0002', 'Thilini Maheshika', 'Thawalama Neluwa Galle', '0713664071', 'kthini1999@gmail.com', 'Female', '992670423V'),
(5, 'U0003', 'Shashika Wishvajith', 'Thiniyawala Neluwa', '0774578965', 'w@gmail.com', 'Male', '97568978V');

-- --------------------------------------------------------

--
-- Table structure for table `delar`
--

CREATE TABLE `delar` (
  `id` int(11) NOT NULL,
  `delar_reg_id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `nic` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delar`
--

INSERT INTO `delar` (`id`, `delar_reg_id`, `name`, `address`, `mobile`, `email`, `gender`, `nic`) VALUES
(1, 'D0001', 'M.A.Kanishka Dew Sanaruwan', 'Banvalgodalla, Kosmulla, Neluwa Galle', '713664071', 'kanishkadewsandaruwan@gmail.com', 'Male', '962670423V'),
(6, 'D0002', 'Thilini Maheshika', 'Thawalama Neluwa', '0713664071', 'thili@gmail.com', 'Female', '992670423V');

-- --------------------------------------------------------

--
-- Table structure for table `delar_payment`
--

CREATE TABLE `delar_payment` (
  `id` int(11) NOT NULL,
  `dp_id` varchar(255) NOT NULL,
  `delar_name` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `year` varchar(255) NOT NULL,
  `month` int(255) NOT NULL,
  `delar_totle_income` int(11) NOT NULL,
  `delar_number_of_income` int(11) NOT NULL,
  `delar_id` varchar(255) NOT NULL,
  `paid` varchar(100) NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delar_payment`
--

INSERT INTO `delar_payment` (`id`, `dp_id`, `delar_name`, `date`, `year`, `month`, `delar_totle_income`, `delar_number_of_income`, `delar_id`, `paid`, `profit`) VALUES
(6, 'DP02', 'M.A.Kanishka Dew Sanaruwan', '2020-06-22 00:02:49', '2020', 6, 32200, 2, 'd0001', 'No', 9660);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `employee_id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `mobile` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `nic` varchar(115) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `basic_salary` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `employee_id`, `name`, `address`, `mobile`, `email`, `gender`, `nic`, `username`, `password`, `basic_salary`) VALUES
(3, 'W0002', 'Ravidu', 'thawalama', '0713664071', 't@gamil.com', 'Male', '96233370423V', 'ravi', '12345', 11000),
(4, 'W0003', 'Thilini Maheshika', 'thawalama', '0713664071', 't@gamil.com', 'Male', '96233370423V', 'a', 'a', 12000),
(5, 'W0004', 'Kanishka', 'Neluwa', '0713664071', 'k@gamil.com', 'Male', '964578124V', 'kaniya', '12345', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `expensive`
--

CREATE TABLE `expensive` (
  `id` int(11) NOT NULL,
  `expensive_id` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `year` varchar(255) NOT NULL,
  `month` varchar(255) NOT NULL,
  `other_payment_total` int(11) NOT NULL,
  `repair_total` int(11) NOT NULL,
  `delar_paymet_totale` int(11) NOT NULL,
  `total_expensive` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expensive`
--

INSERT INTO `expensive` (`id`, `expensive_id`, `date`, `year`, `month`, `other_payment_total`, `repair_total`, `delar_paymet_totale`, `total_expensive`) VALUES
(3, 'EX001', '2020-06-22 22:44:23', '2020', '6', 4300, 25000, 32200, 61500),
(4, 'EX02', '2020-06-22 23:23:29', '2020', '4', 0, 6100, 0, 6100);

-- --------------------------------------------------------

--
-- Table structure for table `extend_rent`
--

CREATE TABLE `extend_rent` (
  `id` int(11) NOT NULL,
  `extend_id` varchar(255) NOT NULL,
  `rent_id` varchar(255) NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `due_date` date NOT NULL,
  `extend_date` date NOT NULL,
  `aditional_amount` int(100) NOT NULL,
  `last_amount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `extend_rent`
--

INSERT INTO `extend_rent` (`id`, `extend_id`, `rent_id`, `car_number`, `due_date`, `extend_date`, `aditional_amount`, `last_amount`) VALUES
(1, 'E0001', 'r0001', 'WPCAR7833', '2020-06-10', '2020-06-15', 10000, 28000),
(2, 'E0002', 'r0001', 'WPCAR7833', '2020-06-10', '2020-06-15', 10000, 28000),
(3, 'E0003', 'r0002', 'SPDFG7845', '2020-06-11', '2020-06-15', 7200, 25200),
(4, 'E0004', 'r0002', 'SPCAR7833', '2020-06-17', '2020-06-18', 2000, 18000);

-- --------------------------------------------------------

--
-- Table structure for table `income`
--

CREATE TABLE `income` (
  `id` int(11) NOT NULL,
  `income_id` varchar(255) NOT NULL,
  `trn_date` datetime NOT NULL,
  `year` varchar(255) NOT NULL,
  `month` varchar(255) NOT NULL,
  `total_income` int(255) NOT NULL,
  `number_of_income` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `income`
--

INSERT INTO `income` (`id`, `income_id`, `trn_date`, `year`, `month`, `total_income`, `number_of_income`) VALUES
(3, 'I00001', '2020-06-22 14:07:27', '2020', '6', 78700, 5),
(4, 'I0002', '2020-06-22 14:07:55', '2020', '5', 12000, 1),
(5, 'I0003', '2020-06-22 21:02:06', '2020', '4', 108100, 1);

-- --------------------------------------------------------

--
-- Table structure for table `other_payment`
--

CREATE TABLE `other_payment` (
  `id` int(11) NOT NULL,
  `payment_id` varchar(100) NOT NULL,
  `bile_code` varchar(100) NOT NULL,
  `amount` int(100) NOT NULL,
  `date` date NOT NULL,
  `reson` varchar(255) NOT NULL,
  `paid` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `other_payment`
--

INSERT INTO `other_payment` (`id`, `payment_id`, `bile_code`, `amount`, `date`, `reson`, `paid`) VALUES
(2, 'P0001', 'A0001', 4200, '2020-06-20', 'clean', 'Yes'),
(3, 'P0002', 'A0002', 100, '2020-06-18', 'Pay', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `profit`
--

CREATE TABLE `profit` (
  `id` int(11) NOT NULL,
  `profit_id` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `year` varchar(255) NOT NULL,
  `month` varchar(255) NOT NULL,
  `total_expensive` int(11) NOT NULL,
  `totale_income` int(11) NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profit`
--

INSERT INTO `profit` (`id`, `profit_id`, `date`, `year`, `month`, `total_expensive`, `totale_income`, `profit`) VALUES
(1, 'P0001', '2020-06-22 23:20:22', '2020', '6', 61500, 198800, 137300),
(3, 'P0002', '2020-06-22 23:27:25', '2020', '4', 6100, 108100, 102000);

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE `rent` (
  `id` int(11) NOT NULL,
  `rent_id` varchar(255) NOT NULL,
  `car_id` varchar(255) NOT NULL,
  `customer_id` varchar(255) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `car_fee` int(255) NOT NULL,
  `due_date` date NOT NULL,
  `totle_fee` int(255) NOT NULL,
  `paid_amount` int(255) NOT NULL,
  `balance` int(255) NOT NULL,
  `trn_date` date NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `extend` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rent_backup`
--

CREATE TABLE `rent_backup` (
  `id` int(11) NOT NULL,
  `rent_id` varchar(255) NOT NULL,
  `car_id` varchar(255) NOT NULL,
  `customer_id` varchar(255) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `car_fee` int(255) NOT NULL,
  `due_date` date NOT NULL,
  `totle_fee` int(255) NOT NULL,
  `paid_amount` int(255) NOT NULL,
  `balance` int(255) NOT NULL,
  `trn_date` date NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `extend` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rent_backup`
--

INSERT INTO `rent_backup` (`id`, `rent_id`, `car_id`, `customer_id`, `customer_name`, `car_fee`, `due_date`, `totle_fee`, `paid_amount`, `balance`, `trn_date`, `car_number`, `extend`) VALUES
(1, 'R0004', 'C0004', 'u0001', 'Kanishak Dew Sandaruwan', 1800, '2020-06-27', 14400, 1000, 13400, '2020-06-19', 'spdfg7845', ''),
(2, 'R0005', 'C0005', 'U0002', 'Thilini Maheshika', 2000, '2020-06-15', 16000, 6000, 10000, '2020-06-07', 'WPCAR7833', ''),
(3, 'R0001', 'C0005', 'U0001', 'Kanishak Dew Sandaruwan', 2000, '2020-06-15', 28000, 10000, 18000, '2020-06-01', 'WPCAR7833', 'Yes'),
(4, 'R0002', 'C0004', 'U0002', 'Thilini Maheshika', 1800, '2020-06-18', 18000, 8000, 12000, '2020-06-01', 'SPDFG7845', 'Yes'),
(5, 'R0003', 'C0003', 'u0001', 'Kanishak Dew Sandaruwan', 1300, '2020-06-18', 10400, 400, 10000, '2020-06-10', 'SPCAE1245', 'No'),
(6, 'R0004', 'C0002', 'u0002', 'Thilini Maheshika', 1200, '2020-06-17', 9600, 6000, 3600, '2020-06-09', 'SPGTR4578', 'No'),
(7, 'R0001', 'C0002', 'u0002', 'Thilini Maheshika', 1200, '2020-06-16', 7200, 200, 7000, '2020-06-10', 'SPGTR4578', 'No'),
(8, 'R0001', 'C0005', 'u0001', 'Kanishak Dew Sandaruwan', 2000, '2020-06-19', 4000, 2000, 2000, '2020-06-17', 'WPCAR7833', 'No'),
(9, 'R0002', 'C0006', 'u0004', 'Tharid Tharaka', 2000, '2020-06-18', 18000, 6000, 12000, '2020-06-09', 'SPCAR7833', 'Yes'),
(10, 'R0001', 'C0002', 'u0002', 'Thilini Maheshika', 1200, '2020-06-18', 9600, 600, 9000, '2020-06-10', 'SPGTR4578', 'No'),
(11, 'R0002', 'C0006', 'u0003', 'Shashika Wishvajith', 2000, '2020-06-27', 18000, 8000, 10000, '2020-06-18', 'SPCAR7833', 'No'),
(12, 'R0002', 'C0006', 'u0003', 'Shashika Wishvajith', 2000, '2020-06-27', 18000, 8000, 10000, '2020-06-18', 'SPCAR7833', 'No'),
(13, 'R0001', 'C0001', 'u0001', 'Kanishak Dew Sandaruwan', 1500, '2020-06-19', 13500, 1000, 12500, '2020-06-10', 'SPBGY4774', 'No'),
(14, 'R0002', 'C0003', 'u0002', 'Thilini Maheshika', 1500, '2020-06-26', 13500, 3500, 10000, '2020-06-17', 'SPCAE1245', 'No'),
(15, 'R0001', 'C0002', 'u0002', 'Thilini Maheshika', 1200, '2020-07-30', 12000, 2000, 10000, '2020-07-20', 'SPGTR4578', 'No'),
(16, 'R0002', 'C0003', 'U0001', 'Kanishak Dew Sandaruwan', 1500, '2020-07-30', 15000, 5000, 10000, '2020-07-20', 'SPCAE1245', 'No'),
(17, 'R0003', 'C0004', 'u0001', 'Kanishak Dew Sandaruwan', 1800, '2020-07-30', 18000, 1000, 17000, '2020-07-20', 'SPDFG7845', 'No'),
(18, 'R0001', 'C0002', 'u0001', 'Kanishak Dew Sandaruwan', 1200, '2020-08-28', 9600, 600, 9000, '2020-08-20', 'SPGTR4578', 'No'),
(19, 'R0001', 'C0002', 'U0002', 'Thilini Maheshika', 1200, '2020-04-30', 18000, 8000, 10000, '2020-04-15', 'SPGTR4578', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE `repair` (
  `id` int(11) NOT NULL,
  `repair_id` varchar(255) NOT NULL,
  `car_id` varchar(255) NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `send_date` datetime NOT NULL,
  `resive_date` datetime NOT NULL,
  `repaired_place` varchar(255) NOT NULL,
  `repai_bil_amount` int(255) NOT NULL,
  `bill_number` varchar(255) NOT NULL,
  `finish` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repair`
--

INSERT INTO `repair` (`id`, `repair_id`, `car_id`, `car_number`, `send_date`, `resive_date`, `repaired_place`, `repai_bil_amount`, `bill_number`, `finish`) VALUES
(1, 'S0001', 'C0001', 'SPBGY4774', '2020-06-19 00:00:00', '2020-06-19 22:12:09', 'Thiniyawala Service', 5500, 'A0001', 'Yes'),
(2, 'S0002', 'C0005', 'WPCAR7833', '2020-06-19 22:17:12', '2020-06-19 22:22:43', 'Avidu Mortes', 4100, 'A0002', 'Yes'),
(3, 'S0003', 'C0004', 'SPDFG7845', '2020-06-19 23:03:27', '2020-06-19 23:15:09', 'KDS Moters', 6000, 'A0003', 'Yes'),
(4, 'S0004', 'C0002', 'SPGTR4578', '2020-06-19 23:13:33', '2020-06-19 23:25:01', 'KDS', 1200, 'A0006', 'Yes'),
(5, 'S0005', 'C0006', 'SPCAR7833', '2020-06-19 23:21:28', '2020-06-19 23:21:49', 'KDS', 2000, 'A0005', 'Yes'),
(6, 'S0006', 'C0006', 'SPCAR7833', '2020-06-19 23:26:18', '2020-06-19 23:34:12', 'KDS', 4100, 'B6666', 'Yes'),
(7, 'S0007', 'C0003', 'SPCAE1245', '2020-06-20 09:55:46', '2020-06-20 09:55:46', 'No', 0, 'No', 'No'),
(8, 'S0008', 'C0005', 'WPCAR6027', '2020-06-20 14:48:32', '2020-06-20 14:57:11', 'KDS', 2100, 'B00022', 'Yes'),
(9, 'S0009', 'C0002', 'SPGTR4578', '2020-04-22 23:20:54', '2020-06-22 23:21:21', 'KDS', 5100, 'A0002', 'Yes'),
(10, 'S0010', 'C0003', 'SPCAE1245', '2020-04-22 23:22:26', '2020-04-30 23:22:50', 'KDS', 6100, 'Alll002', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `return_car`
--

CREATE TABLE `return_car` (
  `id` int(11) NOT NULL,
  `return_id` varchar(255) NOT NULL,
  `returned_date` date NOT NULL,
  `e_date_numbers` int(255) NOT NULL,
  `e_amount` int(255) NOT NULL,
  `t_amount` int(255) NOT NULL,
  `paid_amount` int(255) NOT NULL,
  `balance` int(255) NOT NULL,
  `finished` varchar(100) NOT NULL,
  `car_number` varchar(255) NOT NULL,
  `car_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `return_car`
--

INSERT INTO `return_car` (`id`, `return_id`, `returned_date`, `e_date_numbers`, `e_amount`, `t_amount`, `paid_amount`, `balance`, `finished`, `car_number`, `car_id`) VALUES
(17, 'B0001', '2020-06-21', 3, 5100, 14700, 600, 14100, 'Yes', 'SPGTR4578', 'C0002'),
(18, 'B0002', '2020-06-21', 0, 0, 13500, 3500, 10000, 'Yes', 'SPCAE1245', 'C0003'),
(19, 'B0003', '2020-06-21', 2, 4000, 17500, 1000, 16500, 'Yes', 'SPBGY4774', 'C0001'),
(20, 'B0004', '2020-06-22', 0, 0, 18000, 1000, 17000, 'Yes', 'SPDFG7845', 'C0004'),
(21, 'B0005', '2020-06-22', 0, 0, 15000, 5000, 10000, 'Yes', 'SPCAE1245', 'C0003'),
(22, 'B0006', '2020-05-22', 0, 0, 12000, 2000, 10000, 'Yes', 'SPGTR4578', 'C0002'),
(23, 'B0007', '2020-06-22', 0, 0, 9600, 600, 9000, 'Yes', 'SPGTR4578', 'C0002'),
(24, 'B0008', '2020-04-22', 53, 90100, 108100, 8000, 100100, 'Yes', 'SPGTR4578', 'C0002');

-- --------------------------------------------------------

--
-- Table structure for table `salary_pay`
--

CREATE TABLE `salary_pay` (
  `id` int(11) NOT NULL,
  `salary_payment_id` varchar(255) NOT NULL,
  `employee_id` varchar(255) NOT NULL,
  `employee_name` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `month` varchar(100) NOT NULL,
  `basic_salary` int(100) NOT NULL,
  `ot_houre` int(100) NOT NULL,
  `ot_amount` int(100) NOT NULL,
  `salary` int(100) NOT NULL,
  `paid` varchar(255) NOT NULL,
  `year` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary_pay`
--

INSERT INTO `salary_pay` (`id`, `salary_payment_id`, `employee_id`, `employee_name`, `date`, `month`, `basic_salary`, `ot_houre`, `ot_amount`, `salary`, `paid`, `year`) VALUES
(1, 'SP001', 'w0002', 'Ravidu', '2020-06-21', 'January', 11000, 10, 1200, 12200, 'Yes', '2020'),
(2, 'SP002', 'w0003', 'Thilini Maheshika', '2020-06-21', 'January', 12000, 15, 1800, 13800, 'Yes', '2020'),
(3, 'SP003', 'w0004', 'Kanishka', '2020-06-21', 'January', 15000, 10, 1200, 16200, 'Yes', '2020');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`) VALUES
(3, 'admin', '12345'),
(4, 'kaniya', '12345'),
(5, 'a', 'a'),
(6, 'kaveesha', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carreg`
--
ALTER TABLE `carreg`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delar`
--
ALTER TABLE `delar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delar_payment`
--
ALTER TABLE `delar_payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expensive`
--
ALTER TABLE `expensive`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `extend_rent`
--
ALTER TABLE `extend_rent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `income`
--
ALTER TABLE `income`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `other_payment`
--
ALTER TABLE `other_payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `profit`
--
ALTER TABLE `profit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rent_backup`
--
ALTER TABLE `rent_backup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `repair`
--
ALTER TABLE `repair`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `return_car`
--
ALTER TABLE `return_car`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `salary_pay`
--
ALTER TABLE `salary_pay`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carreg`
--
ALTER TABLE `carreg`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `delar`
--
ALTER TABLE `delar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `delar_payment`
--
ALTER TABLE `delar_payment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `expensive`
--
ALTER TABLE `expensive`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `extend_rent`
--
ALTER TABLE `extend_rent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `income`
--
ALTER TABLE `income`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `other_payment`
--
ALTER TABLE `other_payment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `profit`
--
ALTER TABLE `profit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `rent_backup`
--
ALTER TABLE `rent_backup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `repair`
--
ALTER TABLE `repair`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `return_car`
--
ALTER TABLE `return_car`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `salary_pay`
--
ALTER TABLE `salary_pay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
