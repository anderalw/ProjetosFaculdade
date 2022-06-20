
Banco de dados: Daniel Leonardo Fiegenbaum
Curso: Ánalise e desenvolvimento de sistemas
PROGRAMAÇÃO DE APLICAÇÃO

TABELA FORNECEDOR

CREATE TABLE fornecedor (
  id SERIAL NOT NULL,
  nome VARCHAR(150) NULL,
  email VARCHAR(45) NULL,
  telefone VARCHAR(45) NULL,
  cnpj VARCHAR(45) NULL,
  PRIMARY KEY (id)
);


TABELA COMPRA

CREATE TABLE compra (
  id SERIAL NOT NULL,
  data VARCHAR(45) NULL,
  fornecedor_id INT NOT null,
  PRIMARY KEY (id),
  CONSTRAINT fk_compra_fornecedor1
    FOREIGN KEY (fornecedor_id)
    REFERENCES fornecedor (id)
);

TABELA ITEM_COMPRA

CREATE TABLE item_compra (
  id SERIAL NOT NULL,
  compra_id INT NOT NULL,
  produto_id INT NOT NULL,
  qtde DOUBLE PRECISION NULL,
  valor DECIMAL(10,2) NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_itens_compras_compra1
    FOREIGN KEY (compra_id)
    REFERENCES compra (id),
  CONSTRAINT fk_itens_compras_produto1
    FOREIGN KEY (produto_id)
    REFERENCES item_compra (id)
);


TABELA PRODUTO

CREATE TABLE produto (
  id SERIAL NOT NULL,
  descricao VARCHAR(150) NULL,
  valor_unitario DECIMAL(10,2) NULL,
  qtde_estoque VARCHAR(45) NULL,
  PRIMARY KEY (id)
);


TABELA ITEM_PEDIDO

CREATE TABLE item_pedido (
  id SERIAL NOT NULL,
  produto_id INT NOT NULL,
  pedido_id INT NOT NULL,
  qtde DOUBLE PRECISION NULL,
  valor_item DECIMAL(10,2) NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_itens_pedidos_produto1
    FOREIGN KEY (produto_id)
    REFERENCES produto (id),
  CONSTRAINT fk_itens_pedidos_pedido1
    FOREIGN KEY (pedido_id)
    REFERENCES item_pedido (id)
);

TABELA PEDIDO

CREATE TABLE pedido (
  id SERIAL NOT NULL,
  data VARCHAR(45) NULL,
  endereco_entrega VARCHAR(45) NULL,
  observacao VARCHAR(500),
  cliente_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_pedido_cliente1
    FOREIGN KEY (cliente_id)
    REFERENCES pedido (id)
);

TABELA CLIENTE

CREATE TABLE cliente (
  id SERIAL NOT NULL,
  nome VARCHAR(150) NULL,
  e_mail VARCHAR(45) NULL,
  cpf VARCHAR(45),
  telefone VARCHAR(45),
  PRIMARY KEY (id)
);


TABELA CLIENTE_ENDERECO

CREATE TABLE cliente_endereco (
  id SERIAL NOT NULL,
  cliente_id INT NOT NULL,
  endereco_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_clientes_enderecos_cliente1
    FOREIGN KEY (cliente_id)
    REFERENCES cliente (id),
  CONSTRAINT fk_clientes_enderecos_endereco1
    FOREIGN KEY (endereco_id)
    REFERENCES cliente_endereco (id)
);


TABELA ENDERECO

CREATE TABLE endereco (
  id SERIAL NOT NULL,
  descricao VARCHAR(45) NULL,
  cep VARCHAR(10) NOT NULL,
  PRIMARY KEY (id)
);