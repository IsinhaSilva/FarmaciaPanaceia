-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 19-Abr-2023 às 20:47
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
  `email` varchar(55) NOT NULL,
  `senha` varchar(15) NOT NULL,
  PRIMARY KEY (`idCadastroSiteApp`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cadastrositeapp`
--

INSERT INTO `cadastrositeapp` (`idCadastroSiteApp`, `nome`, `email`, `senha`) VALUES
(3, 'Milena Araujo', 'milenaaraujofe@gmail.com', '55886945'),
(4, 'Gustavo souza', 'gustavosouza@gmail.com.br', '141213'),
(10, 'Julia Maria ', 'isasilva123ptc@gmail.com', '2222');

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `cpf`, `cep`, `nomeCliente`, `genero`, `telefone`, `dataNasc`, `convenio`, `endRua`, `endNum`) VALUES
(1, '156.465.456-45', '22345-352', 'Julia', 'Feminino', '(34)5646-5465', '13/02/2020', 0, 'asdasdasd', 5555),
(2, '251.365.496-69', '38745-045', 'Milena', 'Feminino', '(34)9981-3312', '06/08/2001', 1, 'Equador', 2352),
(3, '123.465.466-66', '25553-354', 'Ans', 'Feminino', '(34)9996-5265', '23/03/2000', 0, 'Elis', 201),
(4, '123.456.789-52', '38742-820', 'Vanderley', 'Feminino', '(34)9532-3565', '10/10/2000', 0, 'Rua S', 45),
(5, '566.898.436-54', '25698-456', 'Paola', 'Feminino', '(98)1065-4643', '12/03/2000', 1, 'Abla', 2565);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(4) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(50) NOT NULL,
  `valorUnidade` double DEFAULT NULL,
  `quantidade` int(10) NOT NULL,
  `bula` varchar(600) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nomeProduto`, `valorUnidade`, `quantidade`, `bula`) VALUES
(1, 'Kit Mamãe e Bebê', 41.86, 500, 'Sabonetes natura para bebê mistureba vem com ilustrações que fazem do banho uma grande aventura e descoberta, enquanto perfumam a pele.'),
(2, 'Kit Mamãe e Bebê + bolsa', 346.63, 200, 'Todas as fórmulas de Natura Mamãe e Bebê são 100% seguras, veganas, testadas e aprovadas por pediatras. Podem ser usadas desde o primeiro dia de vida, com apenas o essencial para cuidar da pele sensível e delicada do bebê. A bolsa, além de moderna, é super prática - perfeita para organizar as roupinhas e pertences dos pequenos. Possui alça transversal e é feita com tecido moletom, que pode ser lavado em máquina.'),
(3, 'Kit Dermocosmeticos', 70.27, 100, 'Combo de cremes de marcas variadas  '),
(4, 'Kit Higiene', 66.25, 125, 'Combo de produtos para higiene oral de marca variadas'),
(5, 'Coqueteleira', 18.99, 450, 'Coqueteleira, 600ml cor preta marca Black Skull'),
(6, 'Kit Black Skull', 349.7, 800, '1 REFIL WHEY  900G + 1 WHEY POTE 900G + 1 BCAA 2400 - 30 Tabs +\n 1 CREA. TURBO 150g + COQUETELEIRA PRETA (Brinde)'),
(7, 'Thermo Flame', 37.2, 900, 'Thermo Flame da linha Caveira Preta Series veio para integrar a \nnova linha da Black Skull USA. Poderoso e eficiente, Thermo \nFlame veio para te ajudar na conquista de um shape perfeito,\n pois possui 360mg de cafeína pura por dose, que irá fornecer mais\n energia e foco, trazendo os melhores resultados.'),
(8, 'Refil Whey Protein', 78.9, 752, 'Dê o seu melhor no treino de força ou aeróbico usando suplementos \nque aprimoram a sua performance, unidas com alimentação \nbalanceada. Esse refil de Whey Protein Black Skull é a escolha certa \npara quem busca auxílio na definição muscular e aumento de massa \nmagra. Aposte na Caveira Preta para complementar o seu estilo de \nvida fitness com tradição e qualidade com esse blend de proteína \nisolada, concentrada e hidrolisada do leite.');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `idVendas` int(200) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(4) NOT NULL,
  `nomeCliente` varchar(45) NOT NULL,
  `nomeProduto` varchar(50) NOT NULL,
  `quantidade` int(50) NOT NULL,
  `valorUnidade` double NOT NULL,
  `dataVenda` varchar(10) NOT NULL,
  `horavenda` varchar(15) DEFAULT NULL,
  `formaPagamento` varchar(80) DEFAULT NULL,
  `valorTotal` double NOT NULL,
  PRIMARY KEY (`idVendas`),
  KEY `fk_Cliente_Vendas_idx` (`idCliente`),
  KEY `fk_Produto_Vendas_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
