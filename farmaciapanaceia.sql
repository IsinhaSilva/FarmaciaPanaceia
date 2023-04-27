-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 27-Abr-2023 às 12:20
-- Versão do servidor: 8.0.31
-- versão do PHP: 8.0.26

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
  `idCadastroSiteApp` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(55) NOT NULL,
  `senha` varchar(15) NOT NULL,
  PRIMARY KEY (`idCadastroSiteApp`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

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
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(15) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `nomeCliente` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `dataNasc` varchar(11) NOT NULL,
  `convenio` tinyint(1) NOT NULL,
  `endRua` varchar(30) DEFAULT NULL,
  `endNum` int DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

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
-- Estrutura da tabela `pedido`
--

DROP TABLE IF EXISTS `pedido`;
CREATE TABLE IF NOT EXISTS `pedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `quantidade` int NOT NULL,
  `valorTotal` double NOT NULL,
  `valorUnitario` double NOT NULL,
  `idCliente` int NOT NULL,
  `idProduto` int NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `fk_Cliente_Pedido_idx` (`idCliente`),
  KEY `fk_Pedido_Produto_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(50) NOT NULL,
  `valorUnidade` double DEFAULT NULL,
  `quantidade` int NOT NULL,
  `bula` varchar(600) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=utf8mb3;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nomeProduto`, `valorUnidade`, `quantidade`, `bula`) VALUES
(1, 'Kit Mamae e Bebe', 41.86, 500, 'Sabonetes natura para bebê mistureba vem com ilustrações que fazem do banho uma grande aventura e descoberta, enquanto perfumam a pele.'),
(2, 'Kit Mamae e Bebe', 346.63, 200, 'Todas as fórmulas de Natura Mamãe e Bebê são 100% seguras, veganas, testadas e aprovadas por pediatras. Podem ser usadas desde o primeiro dia de vida, com apenas o essencial para cuidar da pele sensível e delicada do bebê. A bolsa, além de moderna, é super prática - perfeita para organizar as roupinhas e pertences dos pequenos. Possui alça transversal e é feita com tecido moletom, que pode ser lavado em máquina.'),
(3, 'Kit Dermocosmeticos', 70.27, 100, 'Combo de cremes de marcas variadas  '),
(4, 'Kit Higiene', 66.25, 125, 'Combo de produtos para higiene oral de marca variadas'),
(5, 'Coqueteleira', 18.99, 450, 'Coqueteleira, 600ml cor preta marca Black Skull'),
(6, 'Kit Black Skull', 349.7, 800, '1 REFIL WHEY  900G + 1 WHEY POTE 900G + 1 BCAA 2400 - 30 Tabs +\n 1 CREA. TURBO 150g + COQUETELEIRA PRETA (Brinde)'),
(7, 'Thermo Flame', 37.2, 900, 'Thermo Flame da linha Caveira Preta Series veio para integrar a \nnova linha da Black Skull USA. Poderoso e eficiente, Thermo \nFlame veio para te ajudar na conquista de um shape perfeito,\n pois possui 360mg de cafeína pura por dose, que irá fornecer mais\n energia e foco, trazendo os melhores resultados.'),
(8, 'Refil Whey Protein', 78.9, 752, 'Dê o seu melhor no treino de força ou aeróbico usando suplementos \nque aprimoram a sua performance, unidas com alimentação \nbalanceada. Esse refil de Whey Protein Black Skull é a escolha certa \npara quem busca auxílio na definição muscular e aumento de massa \nmagra. Aposte na Caveira Preta para complementar o seu estilo de \nvida fitness com tradição e qualidade com esse blend de proteína \nisolada, concentrada e hidrolisada do leite.'),
(9, 'Revitalift Hialuronico', 129.97, 1500, 'O novo Hidratante Preenchedor Revitalift Hialurônico Cuidado Diurno de L’Oréal Paris é enriquecido com Ácido Hialurônico puro, hidrata a pele intensamente por 24h, preenche linhas de expressão e revitaliza a pele. Além disso, o Revitalift Hialurônico Cuidado Diurno protege a pele com FPS 20 protegendo contra o fotoenvelhecimento. Sua textura leve pode ser aplicada em todos os tipos de pele, garantindo uma melhora global em seu aspecto. Testado com dermatologistas. Tecnologia: Ácido Hialurônico: a gama completa Revitalift Hialurônico LOréal Paris é enriquecida com Ácido Hialurônico puro, substâ'),
(10, 'Neovadiol', 303.35, 1000, 'RESULTADOS COMPROVADOS E VISÍVEIS*: -28% RUGAS -25% FLACIDEZ +21% VOLUME *Pontuações clínicas em 220 mulheres após 3 meses. REDUZ OS IMPACTOS DA MENOPAUSA NA PELE: -REDUZ RUGAS PROFUNDAS -AUMENTA O VOLUME -REDUZ O RESSECAMENTO'),
(11, 'Creme Anti-Facial', 556.08, 950, 'Creme Facial Anti-Idade SkinCeuticals Glycolic 10 Renew Overnight, foi desenvolvido para peles maduras, que suaviza linhas de expressão e ilumina a pele. Possui formulação exclusiva contendo 10% de ácido glicólico livre, além de ácido fítico e complexo suavizante que estimula a renovação celular, reduzindo linhas de expressão, revelando uma pele mais iluminada e com textura suavizada.'),
(12, 'Gel-Creme Redutor', 70.79, 1020, 'Redutor de medidas e celulite. Hidrabene Gel-Creme promove firmeza e ação drenante para combater a flacidez, gordura localizada e celulite.'),
(13, 'Chupeta NUK', 36.9, 1000, 'A Chupeta Sensitive Soft da Nuk é feita 100% em silicone Soft Flex desenvolvida totalmente em silicone extra macio, e seu escudo levemente curvado contorna o rosto da criança de maneira suave. A chupeta tem o melhor bico que a Nuk já desenvolveu. Ele é inspirado no mamilo da mãe enquanto ela amamenta e promove o desenvolvimento oral saudável do bebê. Afinal, ficou provado que: sugar não é apenas importante para consumir alimentos, mas também promove a aquisição de outras habilidades-chave. Ao sugar, os bebês exercitam e treinam vários músculos necessários para engolir, mastigar e falar adequad'),
(14, 'Absorvente Para Seios', 16.9, 1000, 'Seu formato anatômico respeita todos os tamanhos de seios, o núcleo fino tem sistema ultra absorvente que captura a umidade e auxilia a deixar a pele seca o dia inteiro.A camada externa é à prova de vazamento para manter suas roupas secas, garantindo a sensação de segurança e conforto. Embalado separadamente para melhor higiene, perfeita para uso em todos os lugares.Desenvolvido com a ajuda da parteira e conselheira em aleitamento materno, Vicky Scott, que tem ajudado mamães com a amamentação há 20 anos.'),
(15, 'Fralda Ajuste Total', 129.99, 900, 'A fralda calça Pamper Pants Ajuste Total é fácil de trocar até quando o bebê está em movimento. Com cintura elástica 360° se adapta ao corpinho do bebê.A fralda pants ajuste total possui canais de ar que permitem que o ar circule livremente pela fralda, para que o bumbum fique menos abafado e a pele fique arejada e sequinha durante a noite. Pampers Pants  Ajuste Total também possui gel mágico que absorve e retém a umidade no interior da fralda com uma camada ultra absorvente.'),
(16, 'Lenços Umedecidos', 23.9, 950, 'As toalhinhas umedecidas Johnsons Baby Limpeza e Suavidade são feitas especialmente para a pele delicada do bebê. Sua fórmula contém extrato de própolis e chá verde, removendo delicadamente as sujeiras da pele, até aquelas que não podem ser vistas. Pode ser usado diramente, e não resseca a pele e é dermatologicamente testado e hipoalergênico'),
(17, 'Autoteste Covid', 39.99, 950, 'O Autoteste COVID Ag Detect é um teste rápido para triagem de Covid-19 realizado pelo próprio adulto. Pessoas menores de 14 anos ou portadores de necessidades especiais devem realizar o teste com a supervisão ou auxilio de um adulto.'),
(18, 'Contour Plus', 109, 1000, 'As Tiras Contour Plus são indicadas para uso com os medidores de glicemia da marca Contour Plus. Elas oferecem alta precisão e segurança para o controle do tratamento da diabetes e aplicação de insulina.Além disso, as tiras contam com tecnologia Segunda chance de teste, que evita desperdícios, e tecnologia Multipulse para resultados mais efetivos. Necessitam de apenas uma pequena amostra de sangue: 0,6 µL.'),
(19, 'Seringa para Insulina', 34.25, 900, 'Seringa para insulina com agulha de 8 mm, mais conforto e segurança em cada aplicação. capacidade para até 100 ui de insulina.'),
(20, 'Munhequeira - bege', 31.45, 800, 'Munhequeira ajustável de compressão a munhequeira ajustável oferece compressão em torno do punho, melhorando a sensação de estabilidade da articulação. Essa compressão pode ser ajustada, conforme a necessidade, através da aba com fecho aderente/. O orifício para o polegar proporciona mais segurança para a articulação e facilita o ajuste do produto. Retém o calor devido ao material em Neoprene, mantendo a região aquecida, auxiliando no alívio da dor.'),
(21, 'Munhequeira - preto', 26.97, 900, 'Munhequeira ajustável de compressão a munhequeira ajustável oferece compressão em torno do punho, melhorando a sensação de estabilidade da articulação. Essa compressão pode ser ajustada, conforme a necessidade, através da aba com fecho aderente/. O orifício para o polegar proporciona mais segurança para a articulação e facilita o ajuste do produto. Retém o calor devido ao material em Neoprene, mantendo a região aquecida, auxiliando no alívio da dor.'),
(22, 'NovoPen 4', 195.9, 980, 'A Caneta Aplicadora de Insulina Novopen 4 foi desenvolvida para o uso por pacientes com diabetes que autoadministram suas doses diárias de insulina. Este modelo permite administrar doses de 1 a 60 unidades e possui incrementos, ou níveis de controle, de 1 em 1 unidade. Reutilizável, a Caneta NovoPen 4 está disponível na cor azul e possui alta durabilidade, bastando trocar a seringa e a insulina a cada aplicação.'),
(23, 'Oximetro de Pulso', 84.9, 800, 'Este dispositivo é ideal para uso em atenção médica no lar, enfermagem ou cuidados domiciliários, consultas médicas ambulatoriais ou amantes dos esportes, pois permite o monitoramento contínuo. Para qualquer dúvida com relação à sua saúde, recomenda-se consultar seu médico.'),
(24, 'Seringa', 2.39, 900, 'As Seringas Descarpack foram especialmente desenvolvidas para uso em hospitais, clínicas, laboratórios e farmácias para a aplicação de medicamentos. As seringas são apresentadas em diversos tamanhos para melhor atender as necessidades dos profissionais de saúde com qualidade e segurança.'),
(25, 'Teste de Gravidez', 9.25, 980, 'Auto teste para orientação de gravidez sem fins diagnósticos. BABY SURE deve ser usado para detecção “in vitro” da gravidez na fase inicial. Precauções: Cuidados especiais e esclarecimentos. Preferível colher a amostra da 1ª urina da manha, pois esta geralmente contém maior concentração de hCG, no entanto podem ser utilizadas amostras de urina coletadas a qualquer horário do dia. Um diagnóstico de gravidez confirmada deve ser feito somente por um médico após a avaliação de todos os resultados dos exames clínicos e laboratoriais.'),
(26, 'Umidificador', 136.11, 801, 'A melhor opção para o bem-estar do seu filho. Umidificador e Aromatizador Multikids Baby, mais tranquilidade para os bebes e crianças durante o dia e a noite. Facilitando a respiração das crianças, o umidificador e aromatizador ultrassônico é ideal para locais secos, abafados e que tenham uso constante de ar condicionado.Desenvolvido com capacidade de 2,1 litros, ele também acompanha 1 cartela de adesivos para customizar. Com regulagem de intensidade da névoa e com saída dupla de ar. Devido ao seu compartimento para essências aromáticas, você pode usufruir de odos os benefícios da aromaterapia'),
(28, 'Teste de Fertilidade', 50.75, 900, 'O Teste de Ovulação Confirme Fertilidade vai tornar mais fácil a identificação do período de ovulação feminina. Feito por meio do teste de urina, ele detecta os níveis do Hormônio Luteinizante (LH) e, assim, indica o dia fértil de maneira prática e precisa. Ideal para auxiliar mulheres que planejam engravidar, ele confirma a ovulação com antecedência de 24 e 48 horas. Acessível e prático, oferece os resultados em apenas de 3 a 5 minutos. O teste acompanha frasco coletor e pode ser encontrado com 5 unidades (para ser usado durante 1 ciclo menstrual), ou com 10 unidades (recomendado para a mediç'),
(29, 'Evicup', 34.15, 900, 'Evicup é um coletor menstrual destinado a recolher os fluxos menstruais, substituindo assim os absorventes descartáveis. Ideal para a vida cotidiana, bem como para a prática de todos os tipos de esportes (yoga, ciclismo, acrobacia, natação, ginastica, corrida, etc.), e á noite durante o sono.Pode ser reutilizado durante vários anos. Oferece praticidade, conforto, economia, além de ser uma escolha ecologicamente sustentável. Fabricado com a mais alta qualidade de silicone medicinal, material neutro, com superfície lisa que não absorve líquidos.'),
(30, 'Bomba de Tira-Leite', 283.17, 980, 'O leite materno é o melhor para a criança, e nós acreditamos que a amamentação deve ser uma experiência agradável em todas as situações.Para uma extração de leite rápida e confortável.Fácil de usar e de limpar.Ideal para usar em casa, no trabalho e no dia a dia.Formato ergonômico, paraumbombeamento sem esforço'),
(31, 'Micronebulizador', 31.58, 900, 'O Micropar Plus é um acessório usado no Inalador Mecânico Pulmopar Plus, é comercializado em duas versões, mascara adulto e infantil. Kit contêm um copo para medicação, uma extensão com rosca padrão, uma mascara e um adaptador angular.GARANTIA DO FABRICANTE: A partir da emissão da NF de compra, garantia do fabricante é de 3 MESES.'),
(32, 'Copinhos Descartavel Inalacao', 32.2, 890, 'Os Copos Descartáveis para Inalação da Soniclear são desenvolvidos com matéria prima de qualidade. Podem ser reutilizados por aproximadamente 10 inalações, cada copo.'),
(33, 'Mascara para Dormir', 26.18, 870, 'Possui formato anatômico. A parte interna, confeccionada em tecido e estofada em espuma, proporciona um toque macio, garantindo conforto para a região dos olhos. Possui faixa elástica com ajuste em fecho aderente, que firma a máscara sem causar pressão excessiva.'),
(34, 'Coxal Esporte - preto', 92.2, 790, 'Possui formato anatômico e bordas reforçadas, que proporcionam conforto e resistência ao produto. O coxal é confeccionado em Neoprene®, que retém o calor corporal, auxiliando na redução da dor e na prevenção de lesões. Pode ser usado tanto na coxa direita quanto na esquerda.'),
(35, 'Nosewahs', 42.45, 970, 'NoseWash é a primeira seringa desenvolvida e fabricada no Brasil especialmente para lavagem nasal em bebês e crianças. Com uma proposta inovadora, NoseWash contém personagens lúdicos em miniatura na própria seringa, além de adaptadores nasais que protegem o nariz. Lavar o nariz de bebês e crianças certamente será mais divertido fácil e seguro!'),
(36, 'Barrinha de Whey', 10.99, 4500, 'A Whey Bar Gourmet da Black Skull chegou para revolucionar o mercado de barras de proteína. Sua formulação foi desenvolvida com um blend de proteínas que possuem velocidades de absorção/digestão distintas visando o aumento da disponibilidade de aminoácidos na corrente sanguínea de forma prolongada. Desta maneira, o processo de síntese proteica é estendido e a recuperação muscular otimizada.'),
(37, 'Creatina', 59.9, 908, 'A creatina monohidratada é um dos ativos mais estudados pela ciência nos últimos anos. Além dos benefícios conhecidos para o esporte, seu consumo apresentou efeitos anti-inflamatórios melhorando a saúde de forma geral e a melhoria da performance cerebral por atuar como neuroprotetora, diminuindo a demanda cerebral por oxigênio'),
(38, 'Creatina', 149.9, 2006, 'A creatina monohidratada é um dos ativos mais estudados pela ciência nos últimos anos. Além dos benefícios conhecidos para o esporte, seu consumo apresentou efeitos anti-inflamatórios melhorando a saúde de forma geral e a melhoria da performance cerebral por atuar como neuroprotetora, diminuindo a demanda cerebral por oxigênio'),
(39, 'L-cartine', 59.9, 908, 'Desempenha um papel crucial na geração de energia, transportando ácidos graxos para as mitocôndrias de suas células.'),
(40, 'Monstrous Testopack', 123.9, 1789, 'O MONSTROUS TESTO PACK ™ é um pack indicado para praticantes de musculação e atividades de alta intensidade. Oferecendo 30 multipacks, o produto promove a manutenção e o ganho de massa magra, além de contar com colostro bovino em sua fórmula, que favorece a proliferação e a restituição celular, assim como a síntese de proteínas e o reparo de tecidos moles.'),
(41, 'Proteina Vegana', 136.9, 2909, 'A Proteína de Lentilha D´Água e Ervilha é um produto da linha Green Man, elaborado com matérias-primas orgânicas, cruelty free, com proteínas veganas e alto teor de fibras. Contém ainda uma excelente qualidade proteica e ótimo perfil de aminoácidos (incluindo aminoácidos essenciais – aqueles que o corpo não é capaz de produzir), podendo ser utilizado em substituição à proteína de origem animal por vegetarianos, veganos, atletas, praticantes de atividade física, idosos ou qualquer pessoa que visa manutenção e/ou ganho de massa muscular.'),
(42, 'Whey', 340, 1450, 'Com todas as vantagens do nosso best seller WHEY 3HD™, o whey gourmet irá complementar a sua dieta, auxiliando na síntese proteica, tudo isso com um toque a mais de sabor. Esse é um produto 3W, ou seja, sua fórmula conta com os três tipos de Whey presentes no mercado: Whey Concentrado (WPC), Whey Isolado (WPI) e Whey Hidrolisado (WPH).'),
(43, 'Whey', 16.9, 0, 'Com todas as vantagens do nosso Best Seller WHEY 3HD™, o WHEY 3HD GOURMET GARRAFAS DOSE ÚNICA irá complementar a sua dieta, trazendo praticidade para o seu dia a dia e auxiliando na síntese proteica, tudo isso com um toque a mais de sabor.'),
(44, 'Whey', 169.9, 1346, 'Com todas as vantagens do nosso best seller WHEY 3HD™, o whey gourmet irá complementar a sua dieta, auxiliando na síntese proteica, tudo isso com um toque a mais de sabor. Esse é um produto 3W, ou seja, sua fórmula conta com os três tipos de Whey presentes no mercado: Whey Concentrado (WPC), Whey Isolado (WPI) e Whey Hidrolisado (WPH).'),
(45, 'Whey', 78.9, 2309, 'O WHEY™ da BLACKSKULL USA™ é um produto proteico composto pelos três tipos de whey (3W): Whey Protein Concentrado, Whey Protein Isolado e Whey Protein Hidrolisado. O Whey Protein é um dos suplementos mais consumidos no mundo atualmente por pessoas que praticam esporte, sendo também indicada na nutrição clínica. O Whey Protein é obtido através da extração da proteína presente no soro do leite e pode ser encontrado em três tipos e possuir concentrações de proteínas distintas'),
(46, 'Whey', 299.9, 3004, 'Caso você queira investir no melhor Whey Isolado do mercado, não pode deixar de conhecer o WHEY ZERO™ da BLACKSKULL USA™. Oferecendo 20 g de proteínas e 4,2 g de BCAA por dose, o suplemento é ideal para auxiliar o organismo no processo de construção dos músculos atuando também no metabolismo energético e de outros nutrientes.'),
(47, 'Avene A-Oxitive', 220.65, 1102, 'A-Oxitive Noite é um potente renovador celular, que corrige e recupera a pele dos danos causados pelas agressões externas ao longo do dia, enquanto restaura as reservas fisiológicas de Vitamina A e aumenta as defesas naturais da pele para ajudar a formar um escudo contra as agressões externas e os danos oxidativos.'),
(48, 'Cicatricure', 37.79, 2001, 'O novo Cicatricure Contorno de Olhos foi especialmente formulado com tecnologia BioRegenext e Soft Focus que, em cada aplicação, disfarçam sinais da idade e alisam o contorno dos olhos.'),
(49, 'Sensibio Defensive', 102.81, 1008, 'O Bioderma Sensibio Defensive Creme Facial foi desenvolvido para peles sensíveis, tendo como função de proteger, acalmar e proporcionar hidratação a pele. O Bioderma Sensibio Defensive oferece ação antioxidante, calmante e fortalecedora da barreira de proteção para uma pele acalmada, hidratada por até 12h e protegida contra as agressões externas. Conta com DEFENSIVE TECHNOLOGY uma combinação exclusiva de ativos que age em ambos gatilhos da sensibilidade, até mesmo os relacionados às agressões externas.'),
(50, 'Hydraporin Al', 107.65, 1089, 'Hydraporin AI é um hidratante intensivo que repara a barreira cutânea e promove hidratação intensa para peles secas, extrassecas, sensíves e irritadas.\r\nA fórmula exclusiva de Hydraporin AI possui o Bioskin, ativo com ação probiótica que age diretamente no equilíbrio do microbioma da pele e o AI Complex, complexo de ativos com ação anti-inflamatória e calmante.'),
(51, 'Rosa Selvagem', 137.5, 2001, 'Possui ação anti-inflamatória, ajuda no combate às estrias, quelóides e cicatrizes. Além de estimular a produção de colágeno e elastina. O óleo de Rosa Mosqueta atua como emoliente, rico em ácidos linoleico, linolênico e oleico. Auxilia na regeneração da pele e na prevenção de estrias, além de conter pró-vitamina A e vitamina E natural em sua composição.'),
(52, 'Serum Glycolic HA', 110, 1090, 'O Sérum Redutor de Linhas La Roche-Posay Glycolic HÁ conta com Ácido Glicólico, que ajuda na renovação e revitalização da pele, e Ácido Hialurônico que hidrata e repara a barreira da pele. Deixa a pele lisinha e iluminada, além de combater sinais da idade.'),
(53, 'Skinceuticals Silymarin', 526.11, 955, 'Sérum Antioxidante e Antioleosidade Vitamina C Silymarin C F desenvolvido para peles oleosas e acneicas.'),
(54, 'Cicatricure Maternity', 70.15, 1001, 'Creme anti-estrias para gestantes e recém-mamães. Cicatricure Maternity ajuda a prevenir o aparecimento de estrias e melhorar a aparência de existentes, além de melhorar a firmeza da pele.'),
(55, 'Ureaderme 10', 31.05, 1202, 'O Creme Hydration Ureadin Hidratação Intensiva 10 de ISDIN oferece hidratação imediata e duradoura com o alívio da sensação de repuxamento da pele causada pelo ressecamento. Sinta sua pele macia e protegida.'),
(56, 'H A Intensifier', 526.15, 2019, 'Creme para pescoço · Para homens · Retinol · Vitamina E · Vitamina C · Umectante · Ácido hialurônico · Antienvelhecimento · Formação de colágeno · Tom'),
(57, 'Bepantol Derma', 53.66, 1090, 'Bepantol derma hidratante multirrestaurador promove a hidratação intensa e restauração profunda da pele. Sua fórmula com tecnologia dermarepair contém alta concentração de dexpantenol, que auxilia no processo de restauração das áreas ressecadas, ásperas ou rachadas.'),
(58, 'Locao Hidratante', 142.39, 1045, 'A Loção Hidratante Fisiocalm com ação calmante e reparadora reequilibra o microbioma da pele. Indicado para peles secas, extrassecas, sensíveis e irritadas.'),
(59, 'Profuse Nutrel', 49.8, 2007, 'Cuidados diários para todos tipos de pele, inclusive as mais sensíveis e sensibilizadas. Nutrel Suavizante Balm é um hidratante calmante com textura ultraleve para todos os tipos de pele. Com Ácido Hialurônico e Avenantramidas, promove o estímulo e a retenção da hidratação natural da pele com ação anti-vermelhidão, além de sua ação prebiótica, que fortalece as defesas naturais da pele. Sua textura superleve, e de fácil aplicação, permite a máxima hidratação com rápida absorção, sem causar espinhas ou cravos.'),
(60, 'Phyto Corrective', 295.4, 987, 'Esta fórmula foi enriquecida com extratos botânicosde pepino com propriedades anti-inflamatórios e anti-sépticas para destoxificar e acalmar irritações. Contém alternativas naturais para aclarar a pele ajudando a diminuir o aparecimento de manchas castanhas e promover uma pele clara e de aparência fresca.'),
(61, 'Avene Eau Thermale', 87.75, 1023, 'A eficácia de Avène Água Termal é comprovada em cicatrizações, no pós-cirúrgico, como hidratante para aliviar lesões cutâneas, como suavizante pós-sol, demaquilante, loção pós-barba ou alívio pós-depilação. Pode ser usada tanto para a hidratação, quanto para preparação da pele na rotina diária. '),
(62, 'Dermovance S', 157.6, 978, 'Dermovance S é uma loção sem perfume que possui uma combinação de ativos hidratantes que promovem a restauração da barreira cutânea e reposição dos constituintes do fator de hidratação natural da pele com 24hrs de ação.'),
(63, 'Aussie Máscara', 22.58, 2000, 'Sozinha, em dupla, com todo mundo. Cuidar do cabelo virou uma experiência compartilhável, na vida e no feed. Hidratar o cabelo pode ser muito mais interessante do que você imagina. Passo a passo: 1. Aplique o creme no cabelo úmido. 2. Até 30 minutos de touquinha e stories 3. Enxaguou, secou. Tá linda! parece uma máscara para o cabelo, mas é uma experiência que vai revelar o auge de cada fio.'),
(64, 'Slim Soft', 24.49, 2009, 'Essa escova de dente Colgate Slim Soft Black foi desenvolvida com a tecnologia de ponta da Colgate. Por isso, essa escova de dente tem cerdas macias infundidas em carvão com pontas ultrafinas para que você tenha uma limpeza profunda e delicada.'),
(65, 'Plax Kids', 77.8, 2890, 'O Plax Kids é um enxaguante antisséptico desenvolvido especialmente para cuidar da higiene bucal de crianças a partir dos 7 anos de idade.'),
(66, 'Total 12', 22, 1390, 'ntenha seus dentes saudáveis e fortes com o enxaguante bucal Colgate Total 12 Gengiva Reforçada 500ml. para uma saúde bucal completa. que fortalece sua gengiva contra bactérias por até 12 horas'),
(67, 'Condicionador Siáge', 38.25, 2000, 'Siàge é a marca de Eudora que oferece tratamentos completos com tecnologia avançada, para todos os tipos de cabelos. Para hidratar, recuperar, reconstruir, definir, regenerar, a marca possui produtos de tratamento poderosos, ideias para um cronograma capilar completo, por exemplo. Shampoo, condicionador, máscara de hidratação e leave-in são alguns dos produtos da linha Siàge. Conheça, experimente e surpreenda-se com a qualidade de tratamentos profissionais em casa. Siàge é tecnologia para o seu melhor cabelo, todos os dias.'),
(68, 'Shampoo Siage', 41.99, 2000, 'Siàge é a marca de Eudora que oferece tratamentos completos com tecnologia avançada, para todos os tipos de cabelos. Para hidratar, recuperar, reconstruir, definir, regenerar, a marca possui produtos de tratamento poderosos, ideias para um cronograma capilar completo, por exemplo. Shampoo, condicionador, máscara de hidratação e leave-in são alguns dos produtos da linha Siàge. Conheça, experimente e surpreenda-se com a qualidade de tratamentos profissionais em casa. Siàge é tecnologia para o seu melhor cabelo, todos os dias.'),
(69, 'Sabonete Intimo', 24.9, 1907, 'Pensando nos desafios e nas necessidades da mulher moderna, o sabonete líquido íntimo Dermacyd Neutralize foi desenvolvido para cuidar da região íntima feminina. Com a tecnologia Odor Control, ele neutraliza possíveis odores, enquanto a fórmula exclusiva pH Equilibrium, com o pH semelhante ao da flora vaginal, limpa sem agredir e mantém as defesas naturais.\r\nA sua fórmula hipoalergênica visa ajudar na diminuição dos riscos de alergias, irritações e possíveis odores. Além disso, o sabonete líquido íntimo Dermacyd Neutralize garante sensação de frescor e proteção 24 horas para que você se sinta '),
(70, 'Fita Dental', 12.3, 2000, 'A Fita Dental Johnsons & Johnsons é encereda e desliza suavemente entre os dentes e não desfia durante o uso. Pode ser utilizada com facilidade até por quem tem os dentes mais \"apertados\" pois desliza com facilidade\r\nRemove a placa bacteriana entre os dentes e ao redor do sulco gengival, prevenindo cáries e gengivite.\r\nFormato achatado que aumenta a superfície de contato com a face do dente removendo mais e melhor a placa bacteriana depositada.'),
(71, 'Prestobarba', 25.85, 378, 'A lâmina descartável Gillette Venus Sensitive para peles sensíveis, agora com tecnologia SkinElixir, para uma depilação suave e rente com uma só passada. Suas 3 lâminas e cabeça flexível irão ajudá-lo a alcançar áreas difíceis de depilar. A sua fita lubrificante com tecnologia SkinElixir proporciona uma pele lisa com menos irritação * (vs. Prestobarba 3). É dermatologicamente testado e seu novo cabo vai ajudar você a ter controle. Para obter a melhor experiência, use o gel de depilação Gillette SatinCare.'),
(72, 'Espuma para Barbear', 23.9, 450, 'Condiciona e amacia os pelos, facilitando o barbear.\r\nRevitaliza, refresca e acalma a pele.\r\nDisponível em embalagem tamanho viagem.\r\nLivre de  parabenos e corantes.'),
(73, 'Absorvente Interno', 19.95, 890, 'O Absorvente Interno Intimus Mini conta com a exclusiva cobertura Dermoseda, que desliza mais fácil, ajudando na hora de colocar e retirar o produto. Dermatológicamente e ginecológicamente testado.'),
(74, 'Protetor Diario', 4.75, 1569, 'CAREFREE® Todo Dia é um protetor ideal para uso diário. Sem fragrância e feito com materiais respiráveis, ele permite a circulação do ar, absorve a transpiração da região e neutraliza possíveis odores.'),
(75, 'Preservativo', 15.25, 2145, 'Conexão Verdadeira No Relacionamento. Esse É O Verdadeiro Prazer. Saiba Mais. Diferentes Formas, Tamanhos e Sensações Para Aumentar A Intimidade. Jontex! Diferentes formas. Diferentes tamanhos. O Prazer da intimidade. Diferentes sensações.'),
(76, 'Sabonete Liquido', 23.25, 1405, 'Formulado com pH da pele, glicerina vegetal e alta concentracao de extrato natural de cha branco, que tem acao revigorante. Limpa suavemente a pele, deixando-a macia e perfumada. Formula biodegradável. Livre de parabenos e ingredientes de origem animal.'),
(78, 'Kit Cachos dos Sonhos', 58.99, 3000, 'Shampoo, condicionador, creme de pentear e\r\ncreme de hidratar da linha cachos longos dos sonhos'),
(79, 'Kit Limpeza de Pele', 140.41, 2500, 'Água micelar, gel de limpeza e corretivo'),
(80, 'Kit Cabelos Cacheados', 102.05, 950, 'Shampoo, condicionador, óleo, creme de\r\npentear e creme de hidratar da linha cachos longos dos sonhos'),
(81, 'Kit Liso dos Sonhos', 38.99, 1960, 'Shampoo, condicionador e creme de cabelo'),
(82, 'Kit Professionnel Curl', 466.93, 4000, 'Shampoo, máscara de hidratar e creme de\r\npentear'),
(83, 'Base Accord Parfait', 142.1, 920, 'Base para rosto da tonalidade 2W'),
(84, 'Base True Match', 142.1, 990, 'Base para rosto da tonalidade 1N'),
(85, 'Base True Match', 142.1, 2620, 'Base da tonalidade 8N'),
(86, 'Creme de Pentear', 24.78, 3010, 'Linha função anti-corte'),
(87, 'Creme de Pentear', 12.39, 930, 'Linha função extermina frizz'),
(88, 'Creme de Tratamento', 21.4, 620, 'Composto com óleo de coco'),
(89, 'Creme de Tratamento', 22.49, 2310, 'Composto com óleo de flores'),
(90, 'Creme Preenchedor', 12.9, 870, 'Creme preenchedor, feito com ácido hialurônico'),
(91, 'Hidra Total 5', 109, 800, 'Creme anti-idade +35'),
(92, 'Creme de Tratamento', 17.9, 758, 'Contém proteção térmica'),
(93, 'Mascara Intensiva', 19.92, 759, 'Contém ácido hialurônico'),
(94, 'Mascara Reparadora', 55, 850, 'Reparação total 5'),
(95, 'Oleo Serum', 39.9, 865, 'Feito com óleo de flores'),
(96, 'Protetor Solar', 64.8, 650, 'UV defender'),
(97, 'Shampoo', 17.9, 800, 'Contém ácido hialurônico'),
(98, 'Prendedor de Chupeta', 54.19, 657, 'novo prendedor de chupeta na cor azul'),
(99, 'Aspirador Nasal', 91.05, 890, 'Aspirador de fluidos nasais'),
(100, 'Copo com bico', 69.85, 1005, 'copo avent na cor rosa'),
(101, 'Formula Infantil', 62.9, 507, 'formula infantil de 0 a 12 meses'),
(102, 'Tesoura Infantil', 30.9, 899, 'tesoura para cortar unhas'),
(103, 'Talco Granado', 23.7, 739, 'Previne assaduras'),
(104, 'oleo Johnsons Baby', 70.32, 881, 'Ajuda a dormir mais rápido'),
(105, 'Compressas', 54.35, 712, 'Compressas refrescantes'),
(106, 'Sabonete Johnsons', 6.47, 546, 'Johnsons Baby glicerina'),
(107, 'Nestogeno 1', 47.7, 983, 'Fórmula infantil para lactentes'),
(108, 'Creme para pentear', 52.44, 733, 'Cachos dos sonhos'),
(109, 'Bepantol Baby', 21.12, 850, 'Creme de Assaduras'),
(110, 'Sabonete Liquido', 46.12, 901, 'Sabonete líquido johnson`s'),
(111, 'Lencos Umedecidos', 22.17, 729, 'Lenços umedecidos max clean'),
(112, 'Colonia Johnsons', 42.33, 905, 'Bebê de Johnson - Lavanda'),
(113, 'Pomada Hipoglos', 30, 980, 'Proteção 5 em 1'),
(114, 'Sabonete Liquido', 25.75, 658, 'Sabonete líquido extra suave'),
(115, 'Fralda Pampers Super', 53.9, 942, 'tamanho: G'),
(116, 'Bico de Mamadeira', 34.74, 769, 'Bicos 100% silicone'),
(117, 'Sabonete Huggies', 6.1, 951, 'Sabonete extra suave'),
(118, 'Kit Nutren', 224.99, 850, 'Kit de duas latas nutren sem sabor, 2 unidades de 740 gramas'),
(119, 'Nutren Active', 50.67, 850, 'Lata de 400 gramas, sabor baunilha'),
(120, 'Nutren Active', 44.89, 850, 'Lata de 400 gramas, sabor Morango'),
(121, 'Nutren Active', 45.95, 850, 'Lata de 400 gramas, sabor chocolate'),
(122, 'Nutren Beauty', 71.59, 850, 'Lata de 400 gramas, sabor dark chocolate'),
(123, 'Nutren Protein', 56.65, 850, 'Lata de 400 gramas, sabor banana'),
(124, 'Nutren Senior', 73.79, 850, 'Lata de 370 gramas, sabor baunilha'),
(125, 'Nutren Senior', 69.99, 850, 'Lata de 750 gramas, sem sabor'),
(126, 'Nutren Veg Protein', 66.49, 850, 'Lata de 400 gramas, sabor chocolate'),
(127, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor baunilha'),
(128, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor diet baunilha'),
(129, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor diet chocolate'),
(130, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor limão'),
(131, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor morango'),
(132, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor chocolate'),
(133, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor coco'),
(134, 'Nutren Garrafa', 8.6, 850, 'Garrafinha de 200ml, sabor chocolate'),
(135, 'Nutren Caixinha', 14.9, 850, 'Caixinha de 200 ml, sabor chocolate'),
(136, 'Nutren Suplementos', 8.6, 850, 'Garrafinha de 200ml, sabor chocolate com vitaminas de A a Z'),
(137, 'Nutren Celltrient', 139.99, 850, 'Sachê sabor limão, 30 unidades'),
(138, 'Barra Banana', 2.99, 900, 'Barra de cereal de banana com cobertura de chocolate meio amargo'),
(139, 'Barra de Cookies', 5.99, 900, 'Barrinha sabor cookies e cream zero açucar.'),
(140, 'Barra de Gergelim', 2.69, 1500, 'Barrinha de gergelim zero açúcar com apenas 58% kcal'),
(141, 'Barra de Gergelim', 2.69, 1200, 'Barrinha de gergelim, linhaça e cacau'),
(142, 'Barra Original', 2.69, 1000, 'Barrinha de castanha, pepita de girassol e amendoim.'),
(143, 'Batata Rustica', 6.99, 750, 'Batata rústico sabor batata doce.'),
(144, 'Batata Rustica', 6.99, 750, 'Batata rústica sabor parmesão '),
(145, 'Bombom', 2.59, 800, 'Bombom sabor mouse de chocolate.'),
(146, 'Cha', 10.99, 893, 'Chá boa digestão, sabor hortelã, abacaxi, gengibre, alecrim, carqueja e erva-doce.'),
(147, 'Cha', 10.99, 738, 'Chá boa noite, sabor maracujá, cidreira, camomila, hortelã, melissa e erva-doce.'),
(148, 'Cha Mate', 5.99, 800, 'Chá mate sabor limão'),
(149, 'Chocolate', 4.29, 800, 'Chocolate com 70% cacau com fibras.'),
(150, 'Chocolate', 4.29, 800, 'Chocolate cookies e cream.'),
(151, 'Cramberry', 5.49, 800, 'Craberrys cobertos por chocolate'),
(152, 'Kombucha', 8.99, 800, 'Kombucha de hibisco com maracujá.'),
(153, 'Kombucha', 8.99, 800, 'Kombucha de uva verde com hortelã.'),
(154, 'Pipoca', 8.29, 800, 'Pipoca salgada sem glútem.'),
(155, 'Suco', 5.99, 800, 'Suco de laranja 250ml'),
(156, 'Suco', 5.99, 800, 'Suco de uva 250ml'),
(157, 'Suco Kids', 5.99, 800, 'Suco infantil sabor uva 200ml');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `idVendas` int NOT NULL AUTO_INCREMENT,
  `idCliente` int NOT NULL,
  `idProduto` int NOT NULL,
  `nomeCliente` varchar(45) NOT NULL,
  `nomeProduto` varchar(50) NOT NULL,
  `quantidade` int NOT NULL,
  `valorUnidade` double NOT NULL,
  `dataVenda` varchar(10) NOT NULL,
  `horavenda` varchar(15) DEFAULT NULL,
  `formaPagamento` varchar(80) DEFAULT NULL,
  `valorTotal` double NOT NULL,
  PRIMARY KEY (`idVendas`),
  KEY `fk_Cliente_Vendas_idx` (`idCliente`),
  KEY `fk_Produto_Vendas_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
