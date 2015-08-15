


create table cliente(
	id int auto_increment not null,
	nome varchar(200) not null,
	login varchar(50) not null unique,
	senha varchar(50) not null,
	cpf varchar (11) not null,
	primary key(id)
);

create table venda(
	id int auto_increment not null,
	data_hora DATETIME not null, # usar a funcao NOW()
	total_venda double not null,
	id_cliente int not null,
	primary key(id),
	foreign key (id_cliente) references cliente(id)
);