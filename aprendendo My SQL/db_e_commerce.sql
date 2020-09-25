 create database db_E_commerce;
use db_E_commerce;
create table tb_categoria(
id bigint auto_increment,
nome varchar(20) not null,
setor varchar(20) not null,
tipo varchar(20) not null,
primary key (id)
);
insert into tb_categoria(nome, setor, tipo) 
values ("Video-game","entretenimento","Console");
insert into tb_categoria(nome, setor, tipo) 
values ("Televisão","entretenimento","Smartv");
insert into tb_categoria(nome, setor, tipo) 
values ("Computador","informática","PC");
insert into tb_categoria(nome, setor, tipo) 
values ("Jogo","entretenimento","Game");
insert into tb_categoria(nome, setor, tipo) 
values ("Refrigerador","eletrodomestico","Frost-Free");
select * from tb_categoria;
create table tb_produto(
id bigint auto_increment,
nome varchar(20)not null,
preco float(10,2)not null,
qnt_estoque int not null,
cor varchar(7),
tamanho float not null,
categoria_id bigint not null,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);
alter table tb_produto  drop column tamanho;
alter table tb_produto
add marca varchar(10) not null;
insert into tb_produto(nome, preco, qnt_estoque, cor, tamanho, categoria_id) 
values ("Ps5",500,187,"Branco",0.39,1);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Q-led",3300,87,"Preto","Samsung",2);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Laptop",3500,49,"Preto","acer",3);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("fifa21",300,77,"Azul","EA",4);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Naruto storm-4",200,07,"Verde","Bandai",4);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("BlasterGelo5000",3100,04,"Branco","Brastemp",5);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("xbox series x",5000,37,"Preto","Microsoft",1);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Nintendo switch",3384,02,"Preto","nintendo",1);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("computador",2700,12,"Branco","LG",3);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Micro-ondas",3000,01,"Inox","Electrolux",5);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("God of war",400,22,"Azul","Sony",4);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Gears of war",350,19,"Verde","Microsoft",4);
UPDATE tb_produto SET preco = 5000 WHERE id = 1;
select * from tb_produto where preco >2000;
select * from tb_produto where preco >1000&&preco<2000;
select * from tb_produto;
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("Refrigerador",17000,14,"Preto","LG",5);
insert into tb_produto(nome, preco, qnt_estoque, cor, marca, categoria_id) 
values ("NBA2K20",250,187,"Verde","2KSports",4);

