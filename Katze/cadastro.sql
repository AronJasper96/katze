-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.27
-- Versão do PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `projetobeta`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE IF NOT EXISTS `cadastro` (
  `turno` varchar(30) CHARACTER SET latin1 NOT NULL,
  `estagio` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `numVagas` double NOT NULL,
  `valeRefeicao` varchar(30) CHARACTER SET latin1 NOT NULL,
  `valeTransporte` varchar(30) CHARACTER SET latin1 NOT NULL,
  `assisMedica` varchar(30) CHARACTER SET latin1 NOT NULL,
  `assisOdonto` varchar(30) CHARACTER SET latin1 NOT NULL,
  `fretamento` varchar(30) CHARACTER SET latin1 NOT NULL,
  `responCadastro` varchar(30) CHARACTER SET latin1 NOT NULL,
  `empresa` varchar(30) CHARACTER SET latin1 NOT NULL,
  `localEmpresa` varchar(30) CHARACTER SET latin1 NOT NULL,
  `salario` double NOT NULL,
  `emailContato` varchar(30) CHARACTER SET latin1 NOT NULL,
  `responVaga` varchar(30) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`turno`, `estagio`, `numVagas`, `valeRefeicao`, `valeTransporte`, `assisMedica`, `assisOdonto`, `fretamento`, `responCadastro`, `empresa`, `localEmpresa`, `salario`, `emailContato`, `responVaga`) VALUES
('2º Turno', 'Técnico em Informatica', 3, 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Paula Capelline', 'defsdfsdfsdf', 'sdfsdfsdfsd', 231231231, 'sdfsdfsdf', 'sdfssdfsdfsd'),
('2º Turno', 'Técnico em Mecânica', 3, 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Paula Capelline', 'defsdfsdfsdf', 'sdfsdfsdfsd', 231231231, 'sdfsdfsdf', 'sdfssdfsdfsd'),
('2º Turno', 'Técnico em Eletroeletrônica', 3, 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Paula Capelline', 'defsdfsdfsdf', 'sdfsdfsdfsd', 231231231, 'sdfsdfsdf', 'sdfssdfsdfsd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
