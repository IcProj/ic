-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: iamcure
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fullName` varchar(200) NOT NULL DEFAULT '',
  `phoneNumber` varchar(100) NOT NULL DEFAULT '',
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) NOT NULL DEFAULT '',
  `createdDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosticcenter`
--

DROP TABLE IF EXISTS `diagnosticcenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnosticcenter` (
  `U_ID` varchar(50) NOT NULL DEFAULT '',
  `DiagnosticCenterName` varchar(45) NOT NULL DEFAULT '',
  `Country` varchar(45) NOT NULL DEFAULT '',
  `StateName` varchar(45) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL DEFAULT '',
  `PinCode` int(11) NOT NULL DEFAULT '0',
  `StreetName` varchar(250) NOT NULL DEFAULT '',
  `PhoneNumber` varchar(45) NOT NULL DEFAULT '',
  `DiagnosticCenterPhoto` varchar(45) NOT NULL DEFAULT '',
  `Descripition` varchar(2000) NOT NULL DEFAULT '',
  `CreatedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `LastModifiedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CreatedBy` varchar(45) NOT NULL DEFAULT '',
  `LastModifiedBy` varchar(45) NOT NULL DEFAULT '',
  `ContactPerson` varchar(45) NOT NULL DEFAULT '',
  `SamplesPickup` tinyint(1) NOT NULL DEFAULT '0',
  `DiagnosticsCenterLicenseNumber` varchar(45) NOT NULL DEFAULT '',
  `DiagnosticsCenterLicenseDocument` varchar(45) NOT NULL DEFAULT '',
  `IsVerified` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='					c';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosticcenter`
--

LOCK TABLES `diagnosticcenter` WRITE;
/*!40000 ALTER TABLE `diagnosticcenter` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnosticcenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctorprofile`
--

DROP TABLE IF EXISTS `doctorprofile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctorprofile` (
  `id` int(11) NOT NULL DEFAULT '0',
  `fullName` varchar(45) NOT NULL DEFAULT '',
  `isDoctor` tinyint(1) NOT NULL DEFAULT '0',
  `qualification` varchar(45) NOT NULL DEFAULT '',
  `College` varchar(45) NOT NULL DEFAULT '',
  `CompletionYear` varchar(45) NOT NULL DEFAULT '',
  `Specilizations` varchar(45) NOT NULL DEFAULT '',
  `specialized` varchar(45) NOT NULL DEFAULT '',
  `CouncilRegistrationNumber` varchar(45) NOT NULL DEFAULT '',
  `CouncilName` varchar(45) NOT NULL DEFAULT '',
  `CouncilYear` varchar(45) NOT NULL DEFAULT '',
  `CertificatePath` varchar(45) NOT NULL DEFAULT '',
  `IDProofPath` varchar(45) NOT NULL DEFAULT '',
  `isMedicalRegistrationverify` tinyint(1) NOT NULL DEFAULT '0',
  `Description` varchar(2000) NOT NULL DEFAULT '',
  `Experince` varchar(45) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL DEFAULT '',
  `DoctorImagePath` varchar(45) NOT NULL DEFAULT '',
  `EmailID` varchar(45) NOT NULL DEFAULT '',
  `PersonalContact` varchar(45) NOT NULL DEFAULT '',
  `BusinessContact` varchar(45) NOT NULL DEFAULT '',
  `Createdate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CreatedBy` varchar(45) NOT NULL DEFAULT '',
  `LastmodifiedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `LastmodifedBy` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctorprofile`
--

LOCK TABLES `doctorprofile` WRITE;
/*!40000 ALTER TABLE `doctorprofile` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctorprofile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicalstore`
--

DROP TABLE IF EXISTS `medicalstore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicalstore` (
  `U_ID` varchar(50) NOT NULL DEFAULT '',
  `MedicalstoreName` varchar(45) NOT NULL DEFAULT '',
  `Country` varchar(45) NOT NULL DEFAULT '',
  `StateName` varchar(45) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL DEFAULT '',
  `PinCode` int(11) NOT NULL DEFAULT '0',
  `StreetName` varchar(250) NOT NULL DEFAULT '',
  `PhoneNumber` varchar(45) NOT NULL DEFAULT '',
  `MedicalStorePicture` varchar(45) NOT NULL DEFAULT '',
  `Descripition` varchar(2000) NOT NULL DEFAULT '',
  `DrugLicenseNumber` varchar(45) NOT NULL DEFAULT '',
  `CreatedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `LastModifiedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CreatedBy` varchar(45) NOT NULL DEFAULT '',
  `LastModifiedBy` varchar(45) NOT NULL DEFAULT '',
  `ContactPerson` varchar(45) NOT NULL DEFAULT '',
  `IsVerified` tinyint(1) NOT NULL DEFAULT '0',
  `DrugDelivery` tinyint(1) NOT NULL DEFAULT '0',
  `DrugLicenseDocument` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='					c';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicalstore`
--

LOCK TABLES `medicalstore` WRITE;
/*!40000 ALTER TABLE `medicalstore` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicalstore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal_profile`
--

DROP TABLE IF EXISTS `personal_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal_profile` (
  `U_ID` int(11) NOT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `First_Name` varchar(45) DEFAULT NULL,
  `Last_Name` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `Releation` varchar(45) DEFAULT NULL,
  `Date_Of_Birth` varchar(45) DEFAULT NULL,
  `AdharCard_Number` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `Pincode` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Address_1` varchar(45) DEFAULT NULL,
  `Address_2` varchar(45) DEFAULT NULL,
  `Phone_Number` varchar(45) DEFAULT NULL,
  `E_Mail_ID` varchar(45) DEFAULT NULL,
  `Emergenc_Contact` longtext NOT NULL,
  `Emergenc_Contact_2` longtext,
  `CreateDate` varchar(45) NOT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `LastModifiedBy` varchar(45) DEFAULT NULL,
  `LastModified_Date` varchar(45) NOT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal_profile`
--

LOCK TABLES `personal_profile` WRITE;
/*!40000 ALTER TABLE `personal_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `personal_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fullName` varchar(200) NOT NULL DEFAULT '',
  `phoneNumber` varchar(100) NOT NULL DEFAULT '',
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) NOT NULL DEFAULT '',
  `createdDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'krishna','9705755597','krishbasam@gmail.com','krishna5799','0000-00-00 00:00:00','');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_misc`
--

DROP TABLE IF EXISTS `user_misc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_misc` (
  `U_ID` int(11) NOT NULL,
  `User_Name` varchar(45) DEFAULT NULL,
  `Singup_BloodGroup` varchar(45) DEFAULT NULL,
  `Signup_OrganDonation` varchar(45) DEFAULT NULL,
  `Frequent_Medicine_Order` varchar(45) DEFAULT NULL,
  `Fav_Doctor` varchar(45) DEFAULT NULL,
  `Fav_MedicalStore` varchar(45) DEFAULT NULL,
  `Fav_Lab` varchar(45) DEFAULT NULL,
  `CreatedDate` datetime DEFAULT NULL,
  `ModifiedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_misc`
--

LOCK TABLES `user_misc` WRITE;
/*!40000 ALTER TABLE `user_misc` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_misc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_profile`
--

DROP TABLE IF EXISTS `user_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_profile` (
  `U_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `User_ID` varchar(45) NOT NULL DEFAULT '',
  `First_Name` varchar(45) NOT NULL DEFAULT '',
  `Last_Name` varchar(45) NOT NULL DEFAULT '',
  `image` varchar(45) NOT NULL DEFAULT '',
  `Releationship` varchar(45) NOT NULL DEFAULT '',
  `Date_Of_Birth` varchar(45) NOT NULL DEFAULT '',
  `AdharCard_Number` varchar(45) NOT NULL DEFAULT '',
  `country` varchar(45) NOT NULL DEFAULT '',
  `State` varchar(45) NOT NULL DEFAULT '',
  `Pincode` varchar(45) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL DEFAULT '',
  `Address_1` varchar(45) NOT NULL DEFAULT '',
  `Address_2` varchar(45) NOT NULL DEFAULT '',
  `Phone_Number` varchar(45) NOT NULL DEFAULT '',
  `E_Mail_ID` varchar(45) NOT NULL DEFAULT '',
  `Emergenc_Contact` varchar(45) NOT NULL DEFAULT '',
  `Emergenc_Contact_2` varchar(45) NOT NULL DEFAULT '',
  `CreateDate` varchar(45) NOT NULL DEFAULT '',
  `CreatedBy` varchar(45) NOT NULL DEFAULT '',
  `LastModifiedBy` varchar(45) NOT NULL DEFAULT '',
  `LastModified_Date` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_profile`
--

LOCK TABLES `user_profile` WRITE;
/*!40000 ALTER TABLE `user_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdiagnostics`
--

DROP TABLE IF EXISTS `userdiagnostics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdiagnostics` (
  `U_ID` int(11) NOT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `DiagnosticsCenter_D` varchar(45) DEFAULT NULL,
  `DiagnosticsCenter_Name` varchar(45) DEFAULT NULL,
  `Description` longtext,
  `Location` geometry DEFAULT NULL,
  `Oder_Date` datetime DEFAULT NULL,
  `Payment_Info` varchar(45) DEFAULT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `Prescription` json DEFAULT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdiagnostics`
--

LOCK TABLES `userdiagnostics` WRITE;
/*!40000 ALTER TABLE `userdiagnostics` DISABLE KEYS */;
/*!40000 ALTER TABLE `userdiagnostics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdoctappointment`
--

DROP TABLE IF EXISTS `userdoctappointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdoctappointment` (
  `U_ID` int(11) NOT NULL,
  `User_Name` varchar(45) DEFAULT NULL,
  `Appointment_Mode` varchar(45) DEFAULT NULL,
  `AppointmentDate` varchar(45) DEFAULT NULL,
  `AppointmentCreatedDate` datetime DEFAULT NULL,
  `AppointmentModifiedDate` datetime DEFAULT NULL,
  `AppointmentDoctor` varchar(45) DEFAULT NULL,
  `AppointmentDoctor_ID` varchar(45) DEFAULT NULL,
  `Description` longtext,
  `Confirmation` varchar(45) DEFAULT NULL,
  `TimeStamp` datetime DEFAULT NULL,
  `Location` geometry DEFAULT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdoctappointment`
--

LOCK TABLES `userdoctappointment` WRITE;
/*!40000 ALTER TABLE `userdoctappointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `userdoctappointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userloginhistory`
--

DROP TABLE IF EXISTS `userloginhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userloginhistory` (
  `U_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Loging_ID` varchar(45) NOT NULL DEFAULT '',
  `Login_Date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Logout_Date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Location` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userloginhistory`
--

LOCK TABLES `userloginhistory` WRITE;
/*!40000 ALTER TABLE `userloginhistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `userloginhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usermedhist`
--

DROP TABLE IF EXISTS `usermedhist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usermedhist` (
  `U_ID` int(11) NOT NULL DEFAULT '0',
  `User_ID` varchar(45) NOT NULL DEFAULT '',
  `Age` varchar(45) NOT NULL DEFAULT '',
  `Weight` varchar(45) NOT NULL DEFAULT '',
  `Hight` varchar(45) NOT NULL DEFAULT '',
  `Blood_Group` varchar(45) NOT NULL DEFAULT '',
  `CreatedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ModifiedDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `InsuranceCompany` varchar(45) NOT NULL DEFAULT '',
  `InsuranceID` varchar(45) NOT NULL DEFAULT '',
  `InsuranceExpaireDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Medication` tinyint(1) NOT NULL DEFAULT '0',
  `Allergies` tinyint(1) NOT NULL DEFAULT '0',
  `HealthProblems` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usermedhist`
--

LOCK TABLES `usermedhist` WRITE;
/*!40000 ALTER TABLE `usermedhist` DISABLE KEYS */;
/*!40000 ALTER TABLE `usermedhist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usermedicalstore`
--

DROP TABLE IF EXISTS `usermedicalstore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usermedicalstore` (
  `U_ID` int(11) NOT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `TimeStamp` datetime DEFAULT NULL,
  `Store_ID` int(11) DEFAULT NULL,
  `Store_Name` varchar(45) DEFAULT NULL,
  `Ordered_Time` datetime DEFAULT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `Description` longtext,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usermedicalstore`
--

LOCK TABLES `usermedicalstore` WRITE;
/*!40000 ALTER TABLE `usermedicalstore` DISABLE KEYS */;
/*!40000 ALTER TABLE `usermedicalstore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userpayment_hist`
--

DROP TABLE IF EXISTS `userpayment_hist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userpayment_hist` (
  `U_ID` int(11) NOT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `Payment_Date` datetime DEFAULT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `CreatedDate` datetime DEFAULT NULL,
  `Payment_Cancel` varchar(45) DEFAULT NULL,
  `ModifiedDate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userpayment_hist`
--

LOCK TABLES `userpayment_hist` WRITE;
/*!40000 ALTER TABLE `userpayment_hist` DISABLE KEYS */;
/*!40000 ALTER TABLE `userpayment_hist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userpayment_info`
--

DROP TABLE IF EXISTS `userpayment_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userpayment_info` (
  `U_ID` int(11) NOT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `Card_Number` varchar(45) DEFAULT NULL,
  `Exp_Date` varchar(45) DEFAULT NULL,
  `CVV` varchar(45) DEFAULT NULL,
  `Name_On_The_Card` varchar(45) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `LastModified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userpayment_info`
--

LOCK TABLES `userpayment_info` WRITE;
/*!40000 ALTER TABLE `userpayment_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `userpayment_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-12 15:29:58
