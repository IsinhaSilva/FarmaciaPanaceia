-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 17-Mar-2023 às 20:06
-- Versão do servidor: 5.5.21
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `farmaciapanaceia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrositeapp`
--

DROP TABLE IF EXISTS `cadastrositeapp`;
CREATE TABLE IF NOT EXISTS `cadastrositeapp` (
  `idCadastroSiteApp` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `enderecoRua` varchar(45) NOT NULL,
  `enderecoNumero` int(4) NOT NULL,
  `email` varchar(55) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `dataNasc` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idCadastroSiteApp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(15) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `nomeCliente` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `dataNasc` varchar(11) NOT NULL,
  `convenio` tinyint(1) NOT NULL,
  `endRua` varchar(30) DEFAULT NULL,
  `endNum` int(5) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `cpf`, `cep`, `nomeCliente`, `genero`, `telefone`, `dataNasc`, `convenio`, `endRua`, `endNum`) VALUES
(1, '156.465.456-45', '22345-352', 'Julia', 'Feminino', '(34)5646-5465', '13/02/2020', 0, 'asdasdasd', 5555),
(2, '251.365.496-69', '38745-045', 'Milena', 'Feminino', '(34)9981-3312', '06/08/2001', 1, 'Equador', 2352),
(3, '123.465.466-66', '25553-354', 'Ans', 'Feminino', '(34)9996-5265', '23/03/2000', 0, 'Elis', 201),
(4, '123.456.789-52', '38742-820', 'Vanderley', 'Feminino', '(34)9532-3565', '10/10/2000', 0, 'Rua S', 45);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

DROP TABLE IF EXISTS `pedido`;
CREATE TABLE IF NOT EXISTS `pedido` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valorTotal` double NOT NULL,
  `valorUnitario` double NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `fk_Cliente_Pedido_idx` (`idCliente`),
  KEY `fk_Pedido_Produto_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `valorUnidade` double DEFAULT NULL,
  `quantidade` int(10) NOT NULL,
  `bula` varchar(255) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nome`, `valorUnidade`, `quantidade`, `bula`) VALUES
(1, 'Caderno', 0, 5, 'Tilibra'),
(2, 'esmalte', 4, 5, 'esmalte vermelho');

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_Pedido_Cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Pedido_Produto` FOREIGN KEY (`idProduto`) REFERENCES `mydb`.`produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
