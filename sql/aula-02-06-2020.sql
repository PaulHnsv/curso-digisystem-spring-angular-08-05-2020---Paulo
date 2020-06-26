-- para criar um banco de dados
create database curso_springboot;
-- especificar qual banco de dados iremos utilizar
use curso_springboot;

-- criar uma tabela
create table usuario(
	id int,
    nome varchar (255)
);
-- inserir valor na tabela usuario
INSERT INTO usuario ( id, nome ) values ( 1, 'Fabrizio' );
INSERT INTO usuario ( nome, id ) values (  'Fabrizio 2', 2 );
-- selecionar todos os campos de uma tabela com id > 1
SELECT id FROM usuario WHERE id > 1;

-- altear um registro 
UPDATE usuario set nome = 'Borelli' where id > 2;

-- deletar uma tabela
drop table usuario;
-- criando uma tabela com chave primária e auto increment
create table usuario(
	id int primary key auto_increment,
    nome varchar (255)
);

INSERT into usuario (  nome ) VALUES ( 'Fabrizio');
SELECT * FROM usuario;

UPDATE usuario set nome='Borelli' where id = 1;
-- deletar regitros da tabela
DELETE FROM usuario;


CREATE TABLE curso (
	id int primary key auto_increment,
    nome varchar(255) NOT NULL,
    usuario int references usuario ( id )
);

INSERT INTO curso ( nome) VALUES ( 'MySQL');
select * from curso;
SELECT * FROM usuario;
select * from curso inner join usuario on (usuario.id = curso.usuario);
select * from curso left join usuario on (usuario.id = curso.usuario) where usuario.id > 1;

delete from curso where id =4;



