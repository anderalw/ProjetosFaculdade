CREATE database cadprod 
-- -----------------------------------------------------
-- Table cidade
-- -----------------------------------------------------
CREATE TABLE fornecedor (
  id SERIAL NOT NULL,
  nome VARCHAR(150) NULL,
  email VARCHAR(45) NULL,
  telefone VARCHAR(45) NULL,
  cnpj VARCHAR(45) NULL,
  PRIMARY KEY (id)
);


-- -----------------------------------------------------
-- Table pessoa
-- -----------------------------------------------------
CREATE TABLE compra (
  id SERIAL NOT NULL,
  data VARCHAR(45) NULL,
  fornecedor_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_compra_fornecedor
    FOREIGN KEY (fornecedor_id)
    REFERENCES fornecedor (id)
);



-- -----------------------------------------------------
-- Table item
-- -----------------------------------------------------
CREATE TABLE item_compra (
  id SERIAL NOT NULL,
  compra_id int NULL,
  produto_id int NULL,
  qtde DOUBLE NULL,
  valor DECIMAL(10,2),
  PRIMARY KEY (id),
  CONSTRAINT fk_item_compra_compra
  FOREIGN KEY (compra_id)
  REFERENCES compra (id),
  CONSTRAINT fk_item_compra_produto
  FOREIGN KEY (produto_id)
  REFERENCES produto (id)
  
);


-- -----------------------------------------------------
-- Table os
-- -----------------------------------------------------
CREATE TABLE produto (
  id SERIAL NOT NULL,
  descricao  VARCHAR(150) NULL,
  valor_unitario DECIMAL(10,2) NULL,
  qtde_estoque VARCHAR(45) NULL,
  PRIMARY KEY (id)
      
);


-- -----------------------------------------------------
-- Table os_item
-- -----------------------------------------------------
CREATE TABLE item_pedido (
  id SERIAL NOT NULL,
  pedido_id int NULL,
  produto_id int NULL,
  qtde DOUBLE NULL,
  valor_item DECIMAL(10,2),
  PRIMARY KEY (id),
  CONSTRAINT fk_os_item_pedido
  FOREIGN KEY (pedido_id)
  REFERENCES pedido (id),
  CONSTRAINT fk_os_item_produto
  FOREIGN KEY (produto_id)
  REFERENCES produto (id)
  
);


-- -----------------------------------------------------
-- Table financeiro
-- -----------------------------------------------------
CREATE TABLE pedido (
  id SERIAL NOT NULL,
  data DATE NULL,
  endereco_entrega VARCHAR(45) NULL,
  observacao VARCHAR(500) Null,
  cliente_id INT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_pedido_cliente
    FOREIGN KEY (cliente_id)
    REFERENCES cliente (id)
);

CREATE TABLE cliente (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  cpf VARCHAR(100) NOT NULL,
  telefone VARCHAR(45) NOT NULL
  PRIMARY KEY (id)
);


CREATE TABLE cliente_endereco (
  id SERIAL NOT NULL,
  cliente_id INT NULL,
  endereco_id INT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_cliente_endereco_cliente
  FOREIGN KEY (cliente_id)
  REFERENCES cliente (id),
  CONSTRAINT fk_cliente_endereco_endereco
  FOREIGN KEY (endereco_id)
  REFERENCES endereco (id)
);

CREATE TABLE endereco (
  id SERIAL NOT NULL,
  descricao VARCHAR(45) NULL,
  cep VARCHAR (10) NULL,
  PRIMARY KEY (id)
);

