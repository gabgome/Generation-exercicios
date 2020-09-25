-- criando banco de dados
	create database db_RH2;
-- criando tabelas 
	use db_RH2;

	create table tb_cargo(
		codigo bigint (5) auto_increment not null,
  		setor varchar (50) not null,
    		funcao varchar (50) not null,
    
   		 primary key (codigo)    
);

	use db_RH2;

	create table tb_funcionario(
		id bigint (5) not null,
   		 nome varchar (20) not null,
   		 data_nasc date not null,
    		cargo_codigo bigint not null, 
    		salario decimal (10, 2) not null, 
    
    		primary key (id),
    		foreign key (cargo_codigo) references tb_cargo (codigo)
    
);

-- inserindo dados na tabela tb_cargo
insert into tb_cargo (setor, funcao) values ("Admin.", "Assistente Administrativo");
insert into tb_cargo (setor, funcao) values ("Limpeza", "Auxiliar de Limpeza");
insert into tb_cargo (setor, funcao) values ("Financeiro", "Técnico Contábil");
insert into tb_cargo (setor, funcao) values ("Atendimento", "Agente de Atendimento ao Cliente");
insert into tb_cargo (setor, funcao) values ("Vendas", "Vendedor(a)");

-- inserindo dados na tabela tb_funcionario
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0012, "Marina Campos", "1989-09-10", 1, 4500.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0013, "Débora Nascimento", "1982-05-22", 1, 4500.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0014, "Miriam dos Anjos", "1987-10-15", 2, 2200.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0015, "Luciele Araújo", "1988-04-08", 2, 2200.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0016, "Amaro Pessoa", "1977-08-13", 2, 2200.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values (0017, "Hélia Mourato", "1986-12-06", 3, 3500.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0018, "Ravi Negreiros", "1981-07-08", 3, 3500.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0019, "Louise Carvalheira", "1980-10-30", 3, 3500.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0020, "Orquídea Passarinho", "1991-09-17", 4, 1400.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0021, "Marcel Proença", "1986-08-25", 4, 1400.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0022, "Leo Guedelha", "1994-02-22", 4, 1400.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0023, "Petra Mourinho", "1989-12-12", 5, 5800.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0024, "Luciano Lins", "1980-10-10", 5, 5800.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0025, "Nicholas Varanda", "1992-06-28", 5, 5800.00);
insert into tb_funcionario (id, nome, data_nasc, cargo_codigo, salario) values  (0026, "Abigail Avelar", "1989-01-03", 5, 5800.00);

-- funcionários com salário maior que 2.000
select * from tb_funcionario where salario >= 2000.00;

-- funcionários com salário entre 1.000 e 2.000
select * from tb_funcionario where salario >= 1000.00 and salario < 2000.00;

-- buscando funcionários com a letra C
select * from tb_funcionario where nome like "%c%";