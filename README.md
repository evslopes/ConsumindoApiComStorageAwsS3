# Desenvolvimento de Serviços em Nuvem com Java

## Teste de Perfomance 3


Vários sites dispõem de uma área reservada a usuários cadastrados, seja para compras, pesquisas especializadas ou acesso a serviços.

Neste TP3, com base nas ferramentas aprendidas até aqui, você deverá criar um módulo de cadastramento de usuários com os campos: nome, email, telefone, CEP e endereço (o campo email é chave de busca). Esses dados precisam ser gravados em um banco de dados AWS RDS configurado por você.

O campo CEP será usado para buscar o endereço completo através do serviço https://viacep.com.br/ (crie a sua tela da forma mais intuitiva possível). O usuário vai digitar o CEP e o sistema vai preencher os campos do endereço, exceto o número e o complemento.

No processo de cadastramento será necessário subir a foto do usuário. Essa foto será armazenada em um bucket do AWS S3 configurado por você.

Será preciso implementar inclusão, consulta e alteração de dados.