-- criando banco de dados
create database db_cidade_das_carnes;

-- criando tabelas
use db_cidade_das_carnes;

create table tb_categoria(
	id bigint (5) auto_increment not null,
    nome varchar (255) not null,
    qualidade varchar (10) not null,
    
    primary key (id)
);

create table tb_produto(
	id bigint (5) auto_increment not null,
    nome_corte varchar (255) not null,
    mes_fabricacao varchar (255) not null,
    preco_kg decimal (10,2) not null,
    categoria_id bigint (5) not null,
    
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)   
    
);

-- inserindo dados nas tabelas
insert into tb_categoria (nome, qualidade) values ("1ª Categoria", "Excelente");
insert into tb_categoria (nome, qualidade) values ("2ª Categoria", "Muito boa");
insert into tb_categoria (nome, qualidade) values ("3ª Categoria", "Boa");
insert into tb_categoria (nome, qualidade) values ("Sem categoria", "Fraca");
insert into tb_categoria (nome, qualidade) values ("Categoria Especial", "Superior");

insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Contrafilé", "agosto/2020", 63.00, 5);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Coxão Mole", "agosto/2020", 48.00, 1);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Alcatra", "agosto/2020", 56.00, 1);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Fraldinha", "agosto/2020", 38.00, 2);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Acém", "agosto/2020", 35.00, 2);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Pescoço", "agosto/2020", 19.00, 3);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Cupim", "agosto/2020", 16.00, 4);
insert into tb_produto (nome_corte, mes_fabricacao, preco_kg, categoria_id) 
	values ("Filé Mignon", "agosto/2020", 68.00, 5);

-- produtos com preço maior que 50
select * from tb_produto where preco_kg >= 50;

-- produtos com preço entre 3 e 60
select * from tb_produto where preco_kg > 3 and preco_kg <= 60;

-- produtos com as inicias CO 
select * from tb_produto where nome_corte like "CO%";

-- selecionando a categoria do produto
select * from tb_produto 
inner join tb_categoria on tb_categoria.id =  tb_produto.categoria_id;

-- selecionando produtos da Categoria Especial
select tb_produto.categoria_id, tb_produto.nome_corte from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.nome like "%Categoria Especial%";






