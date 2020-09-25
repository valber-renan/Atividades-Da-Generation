-- criando o banco 
create	database db_RH2;

-- acessando o DB
use db_RH2;
-- criando a tabela cargo
create table tb_cargo(
id bigint auto_increment,
setor varchar (20)not null,
salario float not null,
situacao boolean not null,
primary key (id)
);

-- populando a tabela
insert into tb_cargo(setor,salario,situacao) values ("TI ",4000,true);
insert into tb_cargo(setor,salario,situacao) values ("portaria ",2000,true);
insert into tb_cargo(setor,salario,situacao) values ("segurança ",2500,true);
insert into tb_cargo(setor,salario,situacao) values ("limpeza ",1500,true);
insert into tb_cargo(setor,salario,situacao) values ("gestor",6000,false);
-- chamando o conteúdo da tabela 
select *from tb_cargo;
-- criando a tabela funcionário
create table tb_funcionario(
id bigint auto_increment,
nome varchar (35) not null,
matricula int not null,
cpf bigint not null,
telefone int (8),
dependentes int (2),
cargo_id bigint not null,
primary key (id),
foreign key(cargo_id)references tb_cargo(id)
)

-- populando a tabela 

insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Artur",0001,44444198842,25252525,2,3);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Maria",0201,44444198855,47252525,0,1);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Claudio",0071,44444198810,63252525,1,2);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Miguel",1001,65844198842,25252599,4,4);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Augusto",0501,44444758842,25998725,1,5);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Claudia",2001,54444198842,29952525,0,1);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Amanda",0041,66544198842,88252525,1,5);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Rogério",0471,4432198842,25252540,2,1);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Fabricio",4001,44404198842,27252525,0,4);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Danilo",0002,14444198842,25259525,2,3);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Caio",0051,44444198840,25252520,2,2);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Michael",0901,98444198842,25252332,1,2);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Vitor",0333,55555198842,00002525,0,4);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Manoel",4801,44444166524,25252305,0,4);
insert into tb_funcionario(nome,matricula,cpf,telefone,dependentes,cargo_id)
values ("Ramon",0091,49344198842,00252525,2,1);

-- excluindo a coluna salario
alter table tb_cargo  drop column salario;
-- excluindo a coluna matricula
alter table tb_funcionario  drop column matricula;
-- adicionando a coluna salario
alter table tb_funcionario
add salario float not null;
-- adicionando dados a coluna salario
UPDATE tb_funcionario SET salario = 2500 WHERE id = 1;
UPDATE tb_funcionario SET salario = 4000 WHERE id = 2;
UPDATE tb_funcionario SET salario = 2000 WHERE id = 3;
UPDATE tb_funcionario SET salario = 1500 WHERE id = 4;
UPDATE tb_funcionario SET salario = 6000 WHERE id = 5;
UPDATE tb_funcionario SET salario = 4000 WHERE id = 6;
UPDATE tb_funcionario SET salario = 6000 WHERE id = 7;
UPDATE tb_funcionario SET salario = 4000 WHERE id = 8;
UPDATE tb_funcionario SET salario = 1500 WHERE id = 9;
UPDATE tb_funcionario SET salario = 2500 WHERE id = 10;
UPDATE tb_funcionario SET salario = 2000 WHERE id = 11;
UPDATE tb_funcionario SET salario = 2000 WHERE id = 12;
UPDATE tb_funcionario SET salario = 1500 WHERE id = 13;
UPDATE tb_funcionario SET salario = 1500 WHERE id = 14;
UPDATE tb_funcionario SET salario = 4000 WHERE id = 15;
-- adicionando a coluna responsabilidade
alter table tb_cargo
add responsabilidade varchar(7);
-- inserindo dados a coluna responsabilidade
UPDATE tb_cargo SET responsabilidade = "alta" WHERE id = 1;
UPDATE tb_cargo SET responsabilidade = "média" WHERE id = 2;
UPDATE tb_cargo SET responsabilidade = "alta" WHERE id = 3;
UPDATE tb_cargo SET responsabilidade = "média" WHERE id = 4;
UPDATE tb_cargo SET responsabilidade = "alta" WHERE id = 5;
-- chamando funcionarios com salario maior que 2000
select * from tb_funcionario where salario>2000;
-- chamando funcionarios com salario entre 1000 e 2000 
select * from tb_funcionario where salario>1000&&salario<2000;
-- -- chamando funcionarios que tenham a letra c no nome 
select * from tb_funcionario where nome like "%C%";
