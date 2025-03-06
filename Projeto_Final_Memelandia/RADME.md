Projeto Memelandia
Sobre o projeto
O Memelandia é o projeto final desenvolvido por Ana Alice Rodrigues como parte do curso na Escola Britânica de Artes Criativas. Este projeto tem como objetivo o cadastro de um catálogo de memes, permitindo que usuários enviem memes, categorizem-nos, e gerenciem suas criações. O projeto é composto por múltiplos microserviços, utilizando tecnologias de métricas, logs e descobertas de serviços para uma experiência robusta e escalável.

Proposta de Valor: Oferecer uma plataforma eficiente e escalável para o cadastro e gestão de memes, integrando categorias, usuários e funcionalidades avançadas de microserviços.

Parte Técnica
Spring Boot: Backbone do projeto, oferecendo uma estrutura sólida para aplicações Java. Inclui suporte para Spring Data JPA, JDBC, e web.
PostgreSQL: Banco de dados relacional utilizado para persistência de dados.
Spring Cloud: Utilizado para construir e gerenciar a arquitetura de microserviços, incluindo Feign para chamadas HTTP e Zookeeper para descoberta de serviços.
Micrometer e Observabilidade: Ferramentas de monitoramento e rastreamento distribuído, integradas com Zipkin para análise de traces.
Testes: Implementação de testes unitários e de integração usando Spring Boot Test.
Estrutura dos Arquivos
MemesController: Controlador REST que gerencia as requisições relacionadas aos memes.
Meme: Classe de entidade que representa um meme no banco de dados.
MemeRepository: Interface de repositório que estende JpaRepository para operações CRUD.
MemeService: Classe de serviço que contém a lógica de negócios para manipulação de memes.
Casos de Uso
Cadastro de usuários para envio de memes.
Cadastro de categorias de memes.
Cadastro de memes, obrigatoriamente associados a uma categoria.
Consultas e manipulação de memes através de endpoints REST.