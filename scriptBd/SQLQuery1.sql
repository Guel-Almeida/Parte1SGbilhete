Create database AngoF
use AngoF


create table tipoPagamento (
	idPagamento int not null primary key identity(1,1),
	pagamento Varchar(15) not null
)
create table tipoUsuario (
	idUsuario int not null primary key identity(1,1),
	tipo Varchar(15) not null
)
create table pessoa (
	idpessoa int not null primary key identity(1,1),
	nome Varchar(15) not null,
	telefone numeric not null,
	datanascimento date not null,
	pais Varchar(20) not null,
	cidade Varchar(20) not null,
	rua Varchar(20) not null
)

create table usuario (
	idUsuario int primary key not null identity(1,1),
	senha varchar(10) not null,
	nomelogin varchar(10) not null,
	idpessoa int not null,
	foreign key (idpessoa) references pessoa (idpessoa)
	)

create table festa (
idFesta int primary key not null identity(1,1),
nome char(20) not null,
descricao varchar(45),
localFesta char(20) not null,
dataFesta date not null
)

create table usuarioOrgaFesta (
idFesta int  not null,
idUsuario int  not null,
dia date,
foreign key (idFesta) references festa (idFesta),
foreign key (idUsuario) references usuario (idUsuario)

)

create table produto (
	idProduto int primary key not null identity(1,1),
	nome varchar(20) not null,
	festa int not null,
	tipo char(15),
	quantidade int,
	preco float,
	foreign key (festa) references festa (idFesta)

)

create table cliente (
	idCliente int primary key not null identity,
	idpessoa int not null,
	foreign key (idpessoa) references pessoa (idpessoa)
	)

create table reserva (
	idReserva int primary key not null identity(1,1),
	idCliente int  not null,
	idUsuario int not null,
	idProduto int not null,
	dia date,
	dialimite date,
	foreign key (idCliente) references cliente (idCliente),
	foreign key (idUsuario) references usuario (idUsuario),
	foreign key (idProduto) references produto (idProduto)
)
create table venda (
	idVenda int primary key not null identity(1,1),
	cliente Varchar(20)  not null,
	idProduto int not null,
	dia date,
	tipo varchar(20) not null
	foreign key (idProduto) references produto (idProduto)
)
