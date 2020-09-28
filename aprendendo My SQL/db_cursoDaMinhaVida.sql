create database db_cursoDaMinhaVida;
-- usando o banco de dados 
use db_cursoDaMinhaVida;
-- criando a tabela 
create table tb_categoria(
id bigint auto_increment,
nome varchar(35)not null,
tipo varchar(35)not null,
formato varchar(35)not null,
primary key (id)
 );
 -- populando
insert into tb_categoria (nome,tipo,formato) values ("Java","tecnico","Presencial");
insert into tb_categoria (nome,tipo,formato) values ("PHP","tecnico","Semi-presencial");
insert into tb_categoria (nome,tipo,formato) values ("Gti","tecnologo","Presencial");
insert into tb_categoria (nome,tipo,formato) values ("Phyton","Bootcamp","Ead");
-- criando a tabela 
create table tb_curso (
id bigint auto_increment,
nome varchar(35)not null,
preco decimal (6,2)not null,
duracao varchar(40)not null,
ativo boolean not null,
periodo varchar(50),
curso_id bigint not null,
primary key (id),
foreign key (curso_id)references tb_categoria (id)
)
-- populando
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("introdução",300,"10 meses",true,"noturno",1);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("especialização",2000,"16 meses",true,"integral",1);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("introdução",300,"12 meses",true,"vespertino",2);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("introdução",50,"3 meses",true,"manhã",3);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("avançado",900,"10 meses",true,"noturno",4);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("avançado",264,"6 meses",true,"noturno",2);
insert into tb_curso (nome,preco,duracao, ativo,periodo,curso_id)
values("introdução",600,"10 meses",false,"tarde",4);
-- buscando valores maiores que 50
select* from tb_curso where preco>50;
-- buscando valores entre 3 e 60
select* from tb_curso where preco>3&& preco<60;
-- buscando nome com Ja 
select* from tb_curso where nome like "%Ja%";
-- usando join para cruzar as tabelas
select* from tb_curso inner join tb_categoria on tb_categoria.id= tb_curso.curso_id;
-- chamando uma categoria especifica
select tb_curso.nome, tb_curso.preco,tb_curso.ativo,tb_categoria.nome 
from tb_curso inner join tb_categoria on tb_categoria.id= tb_curso.curso_id
where tb_categoria.nome like "%Java%";