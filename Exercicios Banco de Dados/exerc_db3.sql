create database db_escola;
-- criando tabela 
use db_escola;

create table tb_alunos(
	ra bigint (10) not null,
	nome varchar (20) not null,
   	idade int (2) not null,
	sala char (2) not null,
	nota decimal (1,1) not null,
    
   	 primary key (ra)    
    
	);
-- inserindo dados na tabela
	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565758, "Rodrigo", 17, "3B", 5.5);

	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565759, "Milene", 15, "3B", 9.5);

	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565760, "Francine", 16, "3B", 6.0);

	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565761, "Beatriz", 16, "3B", 9.0);
    
	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565762, "João Gabriel", 17, "3B", 8.0);
    
	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565763, "Giovanna", 15, "3B", 6.0);
    
	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565764, "Manuela", 16, "3B", 6.5);
    
	insert into tb_alunos (ra, nome, idade, sala, nota)
		values (54565765, "Gabriele", 16, "3B", 7.8);

-- retornando alunos com nota maior que 7.0
	select * from tb_alunos where nota >= 7;
-- retornando alunos com nota menor que 7.0
	select * from tb_alunos where nota < 7;

-- alteração de coluna
	alter table tb_alunos drop column nota;
	alter table tb_alunos add nota float not null;
    
