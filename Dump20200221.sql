CREATE DATABASE  IF NOT EXISTS `tbankv3` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tbankv3`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tbankv3
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `idAccount` int(11) NOT NULL AUTO_INCREMENT,
  `idUtil` int(11) NOT NULL,
  `money` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idAccount`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,1,30931,'compte test 1 util 1'),(2,1,3000,'compte test 2 util 1'),(3,2,1000,'compte test 3 util 2'),(4,2,1000,'compte test 4 util 2'),(5,3,1000,'compte test 5 util 3'),(25,1,2810,'compte test 6 util 1'),(26,1,1500,'compte test 7 util 1'),(27,1,17002,'compte test 8 util 1'),(28,1,9730,'compte test 9 util 1'),(29,1,6056,'compte test 10 util 1'),(35,4,4500,'Calimero compte'),(36,4,7280,'calimero compte 2'),(38,37,800,'compte benoit 1'),(39,37,11980,'compte benoit 2'),(49,37,20,'test 20'),(50,37,5000,'test 21'),(51,37,141,'aze'),(52,37,0,'compte 120');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (79);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `idTransaction` int(11) NOT NULL AUTO_INCREMENT,
  `idUtilInit` int(11) NOT NULL,
  `idAccountInit` int(11) NOT NULL,
  `idUtilEnd` int(11) NOT NULL,
  `idAccountEnd` int(11) NOT NULL,
  `date` varchar(45) NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`idTransaction`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,1,1,1,2,'11/02/2020',500),(2,1,2,1,1,'11/02/2020',250),(3,1,1,1,2,'11/02/2020',500),(4,2,3,1,2,'11/02/2020',1000),(5,1,1,1,2,'20200220',100),(6,1,1,1,2,'20200220',100),(7,1,1,1,2,'20200220',100),(8,1,1,1,2,'20200220',100),(9,1,1,1,2,'20200220',100),(10,1,1,1,2,'20200220',100),(11,1,1,1,2,'20200220',100),(12,1,1,1,2,'20200220',100),(13,1,1,1,2,'20200220',100),(14,1,1,1,2,'20200220',100),(15,1,1,1,2,'20200220',100),(16,1,1,1,2,'20200220',100),(17,1,1,1,2,'20200220',100),(18,1,1,1,2,'20200220',100),(19,1,1,1,2,'20200220',100),(20,1,1,1,2,'20200220',600),(21,1,2,1,1,'20200220',900),(22,1,1,1,2,'20200220',250),(23,2,3,1,1,'20200220',250),(24,1,1,2,3,'2020/02/20',250),(40,1,1,37,38,'2020/02/21',800),(41,1,1,4,35,'2020/02/21',4500),(42,1,1,4,36,'2020/02/21',7280),(43,1,1,37,39,'2020/02/21',12000),(44,1,1,1,25,'2020/02/21',2800),(45,1,1,1,28,'2020/02/21',9700),(46,1,1,1,26,'2020/02/21',1500),(47,1,1,1,27,'2020/02/21',17000),(48,1,1,1,29,'2020/02/21',6058),(53,37,39,37,49,'2020/02/21',10),(54,37,39,37,49,'2020/02/21',10),(57,1,1,1,2,'2020/02/21',50),(58,1,1,1,2,'2020/02/21',50),(59,1,1,1,28,'2020/02/21',30),(60,1,1,1,2,'2020/02/21',50),(61,1,1,1,2,'2020/02/21',2),(62,1,29,1,25,'2020/02/21',2),(63,1,1,1,2,'2020/02/21',8),(64,1,1,1,25,'2020/02/21',8),(65,1,1,37,50,'2020/02/21',5000),(66,1,1,1,2,'2020/02/21',3000),(67,1,1,1,27,'2020/02/21',2),(68,1,1,1,2,'2020/02/21',21),(69,1,1,37,51,'2020/02/21',141),(70,1,2,1,1,'2020/02/21',931);
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `util`
--

DROP TABLE IF EXISTS `util`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `util` (
  `idUtil` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `idConnexion` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `statut` varchar(45) NOT NULL,
  PRIMARY KEY (`idUtil`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `util`
--

LOCK TABLES `util` WRITE;
/*!40000 ALTER TABLE `util` DISABLE KEYS */;
INSERT INTO `util` VALUES (1,'thibaud',21,'calimero7899@gmail.com','thib','1234','admin'),(2,'ClientTest',22,'clienttest@gmail.com','client','1234','client'),(4,'thibaud',21,'thibaud@gmail.com','calimero','1234','client'),(37,'Benoit B',21,'benoit@gmail.com','benoit','1234','client');
/*!40000 ALTER TABLE `util` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-21 17:35:55
