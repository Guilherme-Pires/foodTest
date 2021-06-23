insert into cozinha (id, nome) values (1, 'Árabe');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Italiana');
insert into cozinha (id, nome) values (4, 'Brasileira');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Taeam Latif', 10, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Tuk Tuk Indian', 15, 2);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Buona Pasta', 9.50, 3);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (4, 'Buona Pasta Delivery', 5, 3);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (5, 'Churrascada Gaucha', 12, 4);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (6, 'Churrascada Gaucha Delivery', 15, 4);

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');

