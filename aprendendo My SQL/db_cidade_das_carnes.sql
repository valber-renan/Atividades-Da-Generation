-- criando o banco
create database db_cidade_das_carnes;
-- acionando o banco
use db_cidade_das_carnes;
-- criando a tabela categoria
create table tb_categoria(
id bigint auto_increment,
nome varchar(50) not null,
tipo varchar(50) not null,
estado varchar(12)not null,
primary key(id)
);
-- populando a tabela
insert into tb_categoria(nome, tipo, estado)values("Suíno","congelado","São Paulo");
insert into tb_categoria(nome, tipo, estado)values("Suíno","refrigerado","São Paulo");
insert into tb_categoria(nome, tipo, estado)values("Bovíno","refrigerado","RS");
insert into tb_categoria(nome, tipo, estado)values("Aves","refrigerado","RJ");
insert into tb_categoria(nome, tipo, estado)values("Aves","congelado","RJ");
-- criando a tabela produto
create table tb_produto(
id bigint auto_increment,
nome varchar(50)not null,
preco decimal(6,2)not null,
segunda varchar(12)not null,
fracionavel boolean not null,
tipo_id bigint not null,
primary key(id),
foreign key(tipo_id)references tb_categoria(id)
);
-- populando a tabela
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Peito de Frango",12.75,false,true,4);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Bisteca",7.99,false,true,1);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Frango inteiro",4.99,false,false,5);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Acem",17.99,true,true,3);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Filé mignom",27.90,false,false,3);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Picanha",35.78,false,true,3);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Salsicha",7.99,false,false,3);
insert into tb_produto(nome, preco, segunda, fracionavel, tipo_id)values("Costela",22.90,false,true,2);


-- excluindo a coluna segunda
alter table tb_produto  drop column segunda;
-- adicionando a coluna segunda
alter table tb_produto
add segunda boolean not null;

-- selecionando produto com preço maior que 50
select * from tb_produto where preco>50;
-- selecionando produto com preço entre 3 e 60
select * from tb_produto where preco>3&&preco<60;
-- selecionando produto que tenha as letras co no nome
select * from tb_produto where nome like "%co%";
-- select com inner join entre as tabelas
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id;
-- select com inner join entre as tabelas trazendo uma coluna especifica
select tb_produto.nome, tb_produto.preco, tb_categoria.nome
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id
where tb_categoria.nome like "%bovino%";