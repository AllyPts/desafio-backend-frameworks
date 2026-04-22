# Desafio Back-end Multi-Frameworks

## 1. Comparação entre Frameworks

* **Node.js (Express)**: Oferece uma configuração inicial extremamente rápida e minimalista. A gestão de dependências via NPM é simples, e o código tende a ser menos verboso devido à natureza do JavaScript.
* **Java (Spring Boot)**: Possui uma configuração inicial mais robusta e estruturada (via Maven). É mais verboso, porém oferece maior segurança e padrões rígidos que facilitam a escalabilidade em grandes projetos.

## 2. Explicação da Arquitetura

A arquitetura em camadas foi implementada em ambos os projetos para garantir a separação de responsabilidades:
* **Models**: Definem a estrutura dos dados e a lógica de persistência.
* **Controllers**: Gerenciam as requisições HTTP, servindo de ponte entre o usuário e a lógica do sistema.
* **Routes/Services**: No Express, as rotas direcionam as chamadas. No Spring Boot, a camada Service isola as regras de negócio dos controladores, seguindo as melhores práticas de mercado.