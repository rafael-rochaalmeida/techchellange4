create table produto(
    idProduto int primary key, 
    nomeProduto varchar(100) not null,
     descricaoProduto   varchar(600) not null,
     qtdEstoque int not null,
     precoProduto decimal(18,2) not null  
);