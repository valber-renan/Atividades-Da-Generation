-- criando o banco de dados
create database db_registroEscola;
-- usando o banco 
use db_registroEscola;
-- criando a tabela alunos(as)
create table tb_aluno(
id bigint auto_increment,
nome varchar(35),
idade int not null,
classe varchar(10),
horario datetime,
sala int,
primary key(id)
); 
-- excluindo uma coluna
alter table tb_aluno drop column horario;
-- populando a tabela 
insert into tb_aluno (nome, idade, classe, sala) 
values ("Maria", 12, "6° C",5);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Marcelo", 16, "2° D",8);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Paulo", 14, "8° A",17);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Silvio", 13, "7° A",9);
insert into tb_aluno (nome, idade, classe, sala) 
values ("João", 12, "6° C",5);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Caio", 15, "7° A",9);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Jane", 8, "2° D",8);
insert into tb_aluno (nome, idade, classe, sala) 
values ("Danilo", 13, "7° A",9);

-- adicionando uma coluna na tabela
alter table tb_aluno
add nota float not null;

-- incluindo o valor da nota na tabela 
UPDATE tb_aluno SET nota = 8.5 WHERE id = 1;
UPDATE tb_aluno SET nota = 7.5 WHERE id = 2;
UPDATE tb_aluno SET nota = 6.5 WHERE id = 3;
UPDATE tb_aluno SET nota = 6.0 WHERE id = 4;
UPDATE tb_aluno SET nota = 9.0 WHERE id = 5;
UPDATE tb_aluno SET nota = 10.0 WHERE id = 6;
UPDATE tb_aluno SET nota = 5.5 WHERE id = 7;
UPDATE tb_aluno SET nota = 3.5 WHERE id = 8;

-- verificando quem tem a nota maior que 7
select * from tb_aluno where nota >7;
-- verificando quem tem a nota menor que 7
 select * from tb_aluno where nota <7;
-- atualizando uma informação 
update tb_aluno set nota =4.5 where id= 6;
