-- criando banco de dados
create database db_construindo_a_nossa_vida; 

-- criando tabelas
use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint (5) auto_increment not null,
    nome varchar (255) not null,
    material varchar (255) not null,
    
    primary key (id)
);

create table tb_produto(
	codigo bigint (5) not null,
    nome_produto varchar (255) not null,
    marca varchar (255) not null,
    preco decimal (10,2) not null,
    categoria_id bigint (5) not null,
    
    primary key (codigo),
    foreign key (categoria_id) references tb_categoria (id)
);

-- inserindo dados nas tabelas

insert into tb_categoria (nome, material) values ("Tijolos", "Tijolo baiano");
insert into tb_categoria (nome, material) values ("Cimento", "Cimento");
insert into tb_categoria (nome, material) values ("Calhas", "Aço galvite");
insert into tb_categoria (nome, material) values ("Telhas", "Cerâmica");
insert into tb_categoria (nome, material) values ("Pisos", "Porcelanato");

insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (89745, "Telha portuguesa 39x24cm 10mm", "Barrobello", 3.39, 5);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (98734, "Cimento Todas as Obras 50kg", "Votoran", 25.99, 3);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (89873, "Cimento CP II  50kg", "Nacional", 24.99, 3);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (27836, "Calha Galvonizada 28'2 metros", "Telha Norte", 28.90, 4);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (34389, "Porcelanato Place Acetinado", "Eliane", 56.61, 1);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (67638, "Tijolo Vazado diagonal", "Martins", 3.05, 2);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (29874, "Porcelanato Bouvardia brilhante", "Incefra", 28.90, 1);
insert into tb_produto (codigo, nome_produto, marca, preco, categoria_id) 
	values (98735, "Porcelanato Arezzo HD", "Rochaforte", 27.81, 1);
    
-- produtos com preço maior que 50 reais
select * from tb_produto where preco >= 50;

-- produtos com preço entre 3 e 60 reais
select * from tb_produto where preco >= 3 and preco < 60;

-- produtos com as iniciais CI
select * from tb_produto where nome_produto like "CI%";

-- selecionando tabelas
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- selecionando produtos de categoria específica
select tb_categoria.nome, tb_produto.nome_produto, tb_produto.preco from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id -- relaciona as duas tabelas
where tb_categoria.nome like "%Pisos%"; -- filtra os dados











