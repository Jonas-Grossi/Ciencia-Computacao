
CREATE TABLE locadora.categoria (
                nome_categoria VARCHAR(30) NOT NULL,
                PRIMARY KEY (nome_categoria)
);

CREATE TABLE locadora.cliente (
                cod_cliente INT(10) NOT NULL,
                nome_cliente VARCHAR(50) NOT NULL,
                telefone INT(14) NOT NULL,
                endereco VARCHAR(50) NOT NULL,
                PRIMARY KEY (cod_cliente)
);

CREATE TABLE locadora.filmes (
                cod_filme INT(10) NOT NULL,
                titulo VARCHAR(50) NOT NULL,
                nome_categoria VARCHAR(30) NOT NULL,
                PRIMARY KEY (cod_filme)
);

CREATE TABLE locadora.ator (
                nome_ator VARCHAR(50) NOT NULL,
                data_nasc TIME NOT NULL,
                cod_filme INT(10) NOT NULL,
                PRIMARY KEY (nome_ator)
);

CREATE TABLE locadora.dvd (
                numero INT(10) NOT NULL,
                cod_cliente INT(10) NOT NULL,
                cod_filme INT(10) NOT NULL,
                PRIMARY KEY (numero)
);

CREATE TABLE locadora.locadora (
                nome_locadora VARCHAR(10) NOT NULL,
                telefone INT(14) NOT NULL,
                website VARCHAR(40) NOT NULL,
                endereco CHAR(50) NOT NULL,
                PRIMARY KEY (nome_locadora)
);


ALTER TABLE locadora.filmes ADD CONSTRAINT filmes_categoria_fk
FOREIGN KEY (nome_categoria)
REFERENCES locadora.categoria (nome_categoria)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


ALTER TABLE locadora.dvd ADD CONSTRAINT cliente_dvd_fk
FOREIGN KEY (cod_cliente)
REFERENCES locadora.cliente (cod_cliente)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


ALTER TABLE locadora.dvd ADD CONSTRAINT filmes_dvd_fk
FOREIGN KEY (cod_filme)
REFERENCES locadora.filmes (cod_filme)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


ALTER TABLE locadora.ator ADD CONSTRAINT filmes_ator_fk
FOREIGN KEY (cod_filme)
REFERENCES locadora.filmes (cod_filme)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


INSERT INTO categoria VALUES ('Romance');
INSERT INTO categoria VALUES ('Acao');
INSERT INTO categoria VALUES ('Suspense');
INSERT INTO categoria VALUES ('Terror');
INSERT INTO categoria VALUES ('Comedia');
INSERT INTO categoria VALUES ('Drama');
INSERT INTO categoria VALUES ('Ficcao cientifica');
INSERT INTO categoria VALUES ('Aventura');
INSERT INTO categoria VALUES ('Policial');






INSERT INTO cliente VALUES (001,'Joana Machado da Silva',99655485,'Rua Zeca Dias,85');
INSERT INTO cliente VALUES (002,'Pedro Luiz de Almeida',81154679,'Rua Flores da Cunha,356');
INSERT INTO cliente VALUES (003,'Angela Pinheiro',96457812,'Rua dos Andradas,860');
INSERT INTO cliente VALUES (004,'Maria Aparecida do Amaral',96145268,'Avenida Rio Branco,235');
INSERT INTO cliente VALUES (005,'Joacir Andrade',81457698,'Rua Venancio Aires,98');
INSERT INTO cliente VALUES (006,'Lucio Weber',99878802,'Rua Jose Bonifacio,102');
INSERT INTO cliente VALUES (007,'Ana Maria Pereira',81454500,'Rua Fatima Fraga,85');
INSERT INTO cliente VALUES (008,'Vanessa Garcia',96458871,'Rua Pinheiro Machado,245');
INSERT INTO cliente VALUES (009,'Ariane Lamark',81456565,'Rua Roraima de Sousa,981');
INSERT INTO cliente VALUES (010,'Paulo Bourbon',99877714,'Rua Fernando Ferrari,456');





INSERT INTO filmes VALUES (4586,'Um segredo entre nos','Drama');
INSERT INTO filmes VALUES (1025,'Amor e inocencia','Romance');
INSERT INTO filmes VALUES (9820,'Panico no deserto','Suspense');
INSERT INTO filmes VALUES (6548,'Cativeiro','Suspense');
INSERT INTO filmes VALUES (1023,'Feliz Natal','Drama');
INSERT INTO filmes VALUES (2154,'Casa da mae joana','Comedia');
INSERT INTO filmes VALUES (1458,'Lost','Drama');
INSERT INTO filmes VALUES (5445,'O Poeta','Drama');
INSERT INTO filmes VALUES (1546,'A Aventura','Suspense');
INSERT INTO filmes VALUES (2548,'Luzes da Cidade','Comedia');
INSERT INTO filmes VALUES (1245,'Sindicato de ladroes','Policial');
INSERT INTO filmes VALUES (3654,'Janela Indiscreta','Drama');
INSERT INTO filmes VALUES (6987,'Procurando Nemo','Aventura');
INSERT INTO filmes VALUES (7701,'Laranja Mecanica','Ficcao cientifica');




INSERT INTO ator VALUES ('Anne Jacqueline Hathaway',1982-12-12,1025);
INSERT INTO ator VALUES ('Devon Gummersall',1978-10-15-,9820);
INSERT INTO ator VALUES ('Elisha Cuthbert',1982-11-30,6548);
INSERT INTO ator VALUES ('Leonardo Medeiros',1964-11-20,1023);
INSERT INTO ator VALUES ('Malu Mader',1966-09-12,2154);
INSERT INTO ator VALUES ('Joshua Lee Holloway ',1969-07-20,1458);
INSERT INTO ator VALUES ('Charles Chaplin',1889-04-16,2548);






INSERT INTO dvd VALUES (1,005,1546);
INSERT INTO dvd VALUES (2,005,7701);
INSERT INTO dvd VALUES (3,005,2548);
INSERT INTO dvd VALUES (4,010,1023);
INSERT INTO dvd VALUES (5,003,1025);
INSERT INTO dvd VALUES (6,007,1025);




CREATE VIEW comedia AS
    SELECT *
    FROM filmes
    WHERE filmes.nome_categoria = 'Comedia';


CREATE VIEW drama AS
    SELECT *
    FROM filmes
    WHERE filmes.nome_categoria = 'Drama';


