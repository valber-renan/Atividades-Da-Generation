-- criando banco de dados 
create database db_ecommerce;
-- usando o banco de dados
use db_ecommerce;
-- criando a tabela produtos
create table tb_produtos(
id bigint auto_increment,
nome varchar(30)not null,
marca varchar (20),
codigo int (40),
valor float (4,2)not null,
primary key (id)
);
-- populando a tabela
insert into tb_produtos(nome, marca, codigo, valor)
 values ("Televisor","LG",12,1500);
 insert into tb_produtos(nome, marca, codigo, valor)
 values ("laptop","positivo",187,1500);
 insert into tb_produtos(nome, marca, codigo, valor)
 values ("Smartphone","apple",165,4500);
 insert into tb_produtos(nome, marca, codigo, valor)
 values ("micro-ondas","brastemp",412,2500);
 insert into tb_produtos(nome, marca, codigo, valor)
 values ("ps5","sony",112,6500);
 -- excluindo uma coluna 
alter table tb_produtos drop column valor;
-- incluindo uma coluna
 alter table tb_produtos add valor float not null;
-- mostrando dados da tabela
select * from tb_produtos;
-- deletando um dado 
 delete from tb_produtos where  id = 1;
-- mostrando dados da tabela de valor maior que 500
select * from tb_produtos where valor>500 ;
-- mostrando dados da tabela de valor menor que 500
select * from tb_produtos where valor<500 ;
-- atualizando um dado da tabela
update tb_produtos set valor =490 where id= 5;