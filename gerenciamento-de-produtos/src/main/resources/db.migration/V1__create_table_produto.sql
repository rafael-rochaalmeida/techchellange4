create table produto(
    id_produto int primary key, 
    nome_produto varchar(100) not null,
    descricao_produto   varchar(600) not null,
    qtd_estoque int not null,
    preco_produto decimal(18,2) not null  
);