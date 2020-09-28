create database db_rh;

-- criando tabela
use db_rh;

create table tb_funcionario(
	codigo bigint (5) not null,
    nome varchar (30) not null,
    endereco varchar (50) not null,
    telefone varchar (12) not null,
    salario decimal (10, 2) not null,
    
    primary key (codigo)
);

-- inserindo dados
insert into tb_funcionario (codigo, nome, endereco, telefone, salario) 
	values (234567, "Rosana", "Rua São João, 45 - São Paulo", 11996456543, 3500.00);

insert into tb_funcionario (codigo, nome, endereco, telefone, salario) 
	values (234568, "Michael", "Rua Caetano Campos, 345 - São Paulo", 119993239901, 3700.00);
    
insert into tb_funcionario (codigo, nome, endereco, telefone, salario) 
	values (234569, "Antônio", "Rua São Sebastião, 873 - São Paulo", 119921783456, 1500.00);
    
insert into tb_funcionario (codigo, nome, endereco, telefone, salario) 
	values (234570, "Eliana", "Rua Eugenio Cunha, 456 - São Paulo", 119921569873, 1800.00);
    
insert into tb_funcionario (codigo, nome, endereco, telefone, salario) 
	values (234571, "Luciane", "Rua Águas Claras, 23 - São Paulo", 11991245677, 2000.00);

-- retornando salários maiores ou igual a 2.000
	select * from tb_funcionario where salario >= 2000;

-- retornando salários menores que 2.000
	select * from tb_funcionario where salario < 2000;

-- alteração de dados 
	update tb_funcionario set salario = 6000.00 where codigo = 234567;
	select * from tb_funcionario;
