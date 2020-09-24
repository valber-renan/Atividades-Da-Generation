use db_recursosHumanos; -- usando o banco de dados
-- criando a tabela funcionario 
create table tb_funcionario( 
id bigint auto_increment,
nome varchar(35) not null,
matricula varchar(5) not null,
salario float not null,
setor varchar(15),
primary key(id)
);
-- populando a tabela 
insert into tb_funcionario(nome, matricula, salario, setor) values ("Goku",12345,2000,"portaria");
insert into tb_funcionario(nome, matricula, salario, setor) values ("Picolo",12346,2200,"limpeza");
insert into tb_funcionario(nome, matricula, salario, setor) values ("kame",12347,2100,"monitoramento");
insert into tb_funcionario(nome, matricula, salario, setor) values ("Goham",12348,1500,"manobrista");
insert into tb_funcionario(nome, matricula, salario, setor) values ("Vegeta",12349,4000,"desenvolvimento");
-- informando os funcionarios que recebem um salario maior que 2000
select * from  tb_funcionario where salario > 2000;
-- informando os funcionarios que recebem um salario menor que 2000
select * from  tb_funcionario where salario < 2000;
-- atualizando o salario de um funcionario
update tb_funcionario set salario = 1800 where id = 1;

