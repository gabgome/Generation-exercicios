create database db_ecommerce;

-- criando tabela
	use db_ecommerce;

create table db_produto(
	id bigint auto_increment not null,
    nome varchar (20) not null,
    marca varchar (20) not null,
    ano_fabricacao date not null,
    pais_origem char (3) not null,
    
    primary key (id)  

);

-- inserindo dados na tabela
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Moto g5", "Motorola", 2013, 850.00);
    
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Moto g6", "Motorola", 2014, 2500.00);
    
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Galaxy 4s", "Samsung", 2015, 1500.00);
    
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Galaxy Note 6", "Samsung", 2003, 2100.00);

insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Iphone X", "Apple", 2018, 3500.00);
    
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Case Moto g5", "Motorola", 2013, 150.00);
    
insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Fone Apple", "Apple", 2018, 250.00);

insert into tb_produto (nome, marca, ano_fabricacao, preco)
	values ("Cabo USB Moto g6", "Motorola", 2014, 100.00);

 -- retornando valor maior que 500
	select * from tb_produto where preco > 500;
-- retornando valor menor que 500
	select * from tb_produto where preco < 500;

-- alterando valor na tabela
	update tb_produto set preco = 190 where id = 7;
