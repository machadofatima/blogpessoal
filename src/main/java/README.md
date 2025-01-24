# Blog Pessoal

Este é um projeto de um blog pessoal desenvolvido com Spring Boot e JPA, que oferece funcionalidades para gerenciar postagens, usuários e temas. 

O objetivo é criar uma aplicação completa, com backend robusto e flexível, focado em aprendizado e implementação de boas práticas.

O projeto foi desenvolvido durante o Bootcamp da Genereation Brasil, uma imersão com mais de 400h de conteúdo.


## Funcionalidades

- Cadastro e autenticação de usuários.
- CRUD completo para postagens:
  - Criar, listar, atualizar e deletar postagens.
- CRUD completo para temas:
  - Gerenciamento de categorias ou tópicos.
- Relacionamento entre usuários, postagens e temas.
- Busca de postagens por título ou conteúdo.

## Estrutura do Projeto

- **Postagem**: Entidade que representa as publicações no blog, com título, texto e data.
- **Usuario**: Entidade que representa os autores das postagens, com informações de autenticação.
- **Tema**: Entidade que organiza as postagens em categorias ou tópicos.

O projeto utiliza JPA para o mapeamento de entidades e Spring Data para gerenciar os repositórios.

## Tecnologias Utilizadas

- **Backend**: Java, Spring Boot, Spring Data JPA, Spring Security.
- **Banco de Dados**: MySQL.
- **Ferramentas de Desenvolvimento**: IntelliJ IDEA / Eclipse, Postman.

## Como Executar o Projeto

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/machadofatima/blogpessoal.git
   ```

2. **Configure o Banco de Dados:**
   - Certifique-se de que o MySQL está instalado e em execução.
   - Atualize o arquivo `application.properties` com as credenciais do banco de dados.

3. **Compile e Execute o Projeto:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Teste a API:**
   Use o Postman ou outra ferramenta para interagir com os endpoints da API.

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie um branch para sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o branch principal:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request no GitHub.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

Feito com ❤️ por [machadofatima](https://github.com/machadofatima).
