create database agencialetsgo;
use agencialetsgo;

CREATE TABLE Cliente(
idCliente INT auto_increment primary key,
nomeCliente VARCHAR(255) NOT NULL,
cpfCliente VARCHAR(11) UNIQUE NOT NULL,
telefoneCliente VARCHAR(15) NOT NULL,
enderecoCliente TEXT NOT NULL,
cidadeCliente VARCHAR(255) NOT NULL,
cepCliente INT(8) NOT NULL,
ufCliente VARCHAR(2) NOT NULL,
emailCliente VARCHAR(255) UNIQUE NOT NULL,
senhaCliente VARCHAR(20) NOT NULL,
cartaoCreditoCliente VARCHAR(16),
vencCartaoCreditoCliente VARCHAR(5),
nomeTitularCartaoCredito VARCHAR(255),
cpfTitularCartaoCredito VARCHAR(11)


);

CREATE TABLE Destino(
idDestino INT auto_increment primary key,
nomeDestino VARCHAR(255) NOT NULL,
descricaoDestino TEXT NOT NULL,
enderecoDestino TEXT NOT NULL,
cidadeDestino VARCHAR(255) NOT NULL,
cepDestino INT(8) NOT NULL,
ufDestino VARCHAR(2) NOT NULL,
paisDestino VARCHAR(255) NOT NULL

);

CREATE TABLE FaleConosco(
idFaleConosco INT auto_increment primary key,
nomeFaleConosco VARCHAR(255) NOT NULL,
emailFaleConosco VARCHAR(255) NOT NULL,
telefoneFaleConosco VARCHAR(255) NOT NULL,
assuntoFaleConosco ENUM('Sugestao', 'Reclamacao', 'Duvida', 'Outros'),
mensagemFaleConosco TEXT NOT NULL

);

CREATE TABLE Pedido(
idPedido INT auto_increment primary key,
dataInicioViagem DATETIME,
dataFimViagem DATETIME,
formaPagamentoPedido ENUM('PIX', 'Boleto', 'Crédito'),
viajantesPedido VARCHAR(255) NOT NULL,
idCliente INT NOT NULL,
idDestino INT NOT NULL,
FOREIGN KEY (idCliente) REFERENCES Cliente (idCliente),
FOREIGN KEY(idDestino) REFERENCES Destino (idDestino)

);

INSERT INTO Cliente(nomeCliente, cpfCliente, telefoneCliente, enderecoCliente, cidadeCliente, cepCliente, ufCliente, emailCliente, senhaCliente) VALUES ('Alessandra Cunha de Luca Rodrigues','11122233344','41988887777','Rua Teste, 123', 'Curitiba', '81020235', 'PR', 'alessandra_agencia@gmail.com', '123456');
INSERT INTO Destino (nomeDestino, descricaoDestino, enderecoDestino, cidadeDestino, cepDestino, ufDestino) VALUES ('Curitiba','Curitiba é a capital do estado do Paraná, na região sul do Brasil. A Torre Panorâmica, que tem um observatório em sua parte superior, destaca-se na silhueta da cidade. Conhecida como centro cultural, Curitiba abriga vários espaços para apresentações, como a Ópera de Arame, uma estrutura de aço tubular com telhado transparente, e o enorme Centro Cultural Teatro Guaíra, que apresenta uma programação variada', 'Rua XV de Novembro', 'Curitiba', '80020310', 'PR');
INSERT INTO FaleConosco (nomeFaleConosco, emailFaleConosco, telefoneFaleConosco, assuntoFaleConosco, mensagemFaleConosco) VALUES ('Alessandra Rodrigues', 'ale_agencia@gmail.com', '41988887575', 'Outros', 'Bom dia, gostaria de uma simulação de viagem de Curitiba para Fernando de Noronha do período de 15/12/2023 a 15/01/2024. Obrigada.');
INSERT INTO Pedido (dataInicioViagem, dataFimViagem, formaPagamentoPedido, viajantesPedido, idCliente, idDestino) VALUES ('2023-10-30 08:00:00', '2023-11-15 20:30:00', 'Credito', '4', '1', '1');

SELECT c.nomeCliente, d.nomeDestino, p.dataInicioViagem, p.dataFimViagem
FROM Pedido as p
INNER JOIN Destino as d
ON p.idDestino = d.idDestino
INNER JOIN Cliente as c
ON p.idCliente = c.idCliente;
  
  ALTER TABLE cliente
  CHANGE vencCartaoCreditoCliente vencCartaoCreditoCliente VARCHAR(5);
  
  select * FROM pedido;
    
  ALTER TABLE destino ADD paisDestino VARCHAR(255) NOT NULL;