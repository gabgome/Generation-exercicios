-- criando banco de dados
create database db_ecomerce;
-- criando tabelas
use db_ecomerce;

create table tb_categoria(
	id bigint (5) auto_increment not null,
    nome varchar (50) not null,
    ativo boolean,
    
    primary key (id)

);

create table tb_produto(
	codigo bigint (5) not null,
    nome varchar (50) not null,
    categoria_id bigint (5) not null,
    tamanho char (4) not null,
    preco decimal (10,2) not null,
    
    primary key (codigo),
    foreign key (categoria_id) references tb_categoria (id)    

);

-- inserindo dados nas tabelas 
insert into tb_categoria (nome, ativo) values ("Feminino", true);
insert into tb_categoria (nome, ativo) values ("Masculino", true);
insert into tb_categoria (nome, ativo) values ("Infantil", true);
insert into tb_categoria (nome, ativo) values ("Plus Size", true);
insert into tb_categoria (nome, ativo) values ("Gestante", true);

insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (98056, "Camiseta", 1, "M", 29.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (98057, "Calça", 1, "G", 1299.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (17284, "Casaco", 1, "M", 1399.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (17285, "Camiseta", 2, "M", 2209.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (69204, "Pijama", 3, "PP", 3999.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (69205, "Camiseta", 3, "P", 2309.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (04891, "Camiseta", 2, "M", 4999.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (04892, "Pijama", 2, "G", 2399.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (04894, "Casaco", 4, "GG", 1599.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (69206, "Casaco", 4, "XXL", 3599.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (69297, "Camiseta", 4, "XL", 1499.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (04893, "Camisa", 5, "G", 2799.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (17286, "Camisa", 5, "M", 3699.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (17381, "Vestido", 3, "M", 1229.99);
insert into tb_produto (codigo, nome, categoria_id, tamanho, preco) values (97042, "Vestido", 1, "M", 1099.99);

-- retornando produtos com preço maior que 2.000
select * from tb_produto where preco >= 2000.00;

-- retornando produtos com preço entre 1.000 e 2.000
select * from tb_produto where preco > 1000.00 and preco < 2000.00;

-- retornando produtos com a letra C 
select * from tb_produto where nome like "%C%";





