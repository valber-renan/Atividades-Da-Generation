-- criando banco de dados
create database db_construindo_a_nossa_vida;
-- acionando o banco de dados 
use db_construindo_a_nossa_vida
-- criando a tabela  categoria
create table tb_categoria(
id bigint auto_increment,
nome varchar(50)not null,
 tipo varchar (50)not null,
 setor varchar(50),
 primary key (id)
 )
 -- populando a tabela
 insert into tb_categoria(nome,tipo,setor) values("construção","alvenaria","construção"); 
insert into tb_categoria(nome,tipo,setor) values("construção","drywall","construção"); 
insert into tb_categoria(nome,tipo,setor) values("acabamento","pintura","decoração"); 
insert into tb_categoria(nome,tipo,setor) values("acabamento","revestimento ","construção"); 
-- criando a tabela 
 create table tb_produto(
 id bigint auto_increment,
 nome varchar(30),
 preco decimal(6,2)not null,
 tipo_id bigint,
 qtd_estoque int,
 peso float not null,
 primary key (id),
 foreign key (tipo_id)references tb_categoria(id)
 );
 
-- populando a tabela
 insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("bloco",2.00,1,10000,0.300);
insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("cimento",20.00,1,50000,50);
insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("lata tinta",200.00,3,10000,18);
insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("revestimento",150,4,10000,20);
insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("viga ",80,1,10000,130);
insert into tb_produto(nome,preco,tipo_id,qtd_estoque,peso)values ("chapa ",25.00,2,10000,.18);
-- chamando os produtos com valor maior que 50
 select*from tb_produto where preco>50;
-- chamando os produtos com valor entre 3e 60
select*from tb_produto where preco>3 &&preco<60; 
-- produtos que começam com ci
select* from tb_produto where nome like "%ci%";
-- join para chamar a relação das tabelas
select*from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id;
select tb_produto.nome,tb_produto.preco,tb_categoria.nome
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id where tb_categoria.nome like "%acab%";
