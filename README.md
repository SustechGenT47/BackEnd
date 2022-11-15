# Api Criada para a realização do Projeto integrador Utilizando o framework Spring Boot feito através do Bootcamp Generation Brasil 📖🟢



  ## ✔️ Técnicas e tecnologias utilizadas

- ``SpringBoot``
- ``Java``
- ``Spring Tools``
- ``MySql``
- ``PostgresSql``
- ``Heroku``
- ``Swagger``


 #### ✅ - Criação das models Categoria Produto e Usuario
 * Utilizando as bibliotecas do Mysql para criacão do banco de dados
 * Tabela Tema com a primary Key
 * Tabela Postagem com a foreign Key
 * Tabela de Usuario
 
 #### ✔️ - Criação dos Repositorys
 * Onde faz a comunicação com o banco de dados criando os metodos
 * GetById para pegar um elemento pelo id
 * GetByName para pegar o elemento pelo nome
  
 #### ☑️ - Criação das camadas de controller para as Requisições Http
 * Get (Para pegar todos os elementos do banco de dados)
 * GetById(Para pegar um elemento pelo seu id)
 * Post (Para criar uma nova Categoria ou novo Produto e a relização de um cadastro de usuario)
 * Put (Para fazer a atualização dos dados de uma Categoria ou Produto)
 * Delete (Para Deletar um elemento do banco de dados)
   
 #### ‼️ - Criada a camada de Security
 * Sempre que um usuario faz um cadastro a camada se segurança faz uma criptografia dos dados atraves do encode base64
 * Gera um token que ira ser utilizado no cabeçalho da pagina para que o usuario possa utilizar as outras areas da Api
 
 #### ✅ - Utilização do banco de dados
 * No ambiente de desenvolvimento foi utilizado o banco de dados MySql
 * No ambiente de produção foi utilizado o banco de dados Postgres para realização do deploy e integração com a plataforma do Heroku
  
 #### 🔨 - E realização dos testes feitas todas no insominia
 * Testes dos endpoints Get de Categoria/Produto/Usuario
 * Testes dos endpoints GetbyId de Categoria/Produto
 * Testes dos endpoints Post de Categoria/Produto/Usuario
 * Testes dos endpoints Put de Categoria/Produto/Usuario 
 * Testes dos endpoints Delete de Categoria/Produto/Usuario
 
 #### 🔨 - Integração do swagger para deploy na plataforma heroku
 * Foi Criada uma camada na aplicação fazendo a configuração do swagger com os endpoints
 * Foi feito o deploy da api Utilziando a plataforma do heroku, onde disponibilizamos em nuvem para fazer o consumo posteriormente na etapa de front-end
 
  ##### 🔨 - Link da aplicação no heroku e instruções para entrar
  1. - Entre no link https://sus-tech.herokuapp.com/swagger-ui/index.html#/
  2. - Vai abrir uma aba pedindo login e senha
  3. - Coloque o login como root e senha como root
  
  
  #### 🔨 - Demonstrativo dos endpoits de usuario na plataforma do swagger
  ![image](https://user-images.githubusercontent.com/100168699/202005013-b7476826-7468-4e00-b096-fee5740d66f8.png)


  ##### 🔨 - Demonstrativo dos endpoits de Categoria na plataforma do swagger
  ![image](https://user-images.githubusercontent.com/100168699/202005072-11678a8e-e400-4638-acea-b766f01d25db.png)
  
  ##### 🔨 - Demonstrativo dos endpoits de Produtos na plataforma do swagger
  
  ![image](https://user-images.githubusercontent.com/100168699/202005109-de19bb42-6efb-4aa7-b182-cc52b421c5ed.png)

  ##### 🔨 - Link do site ja funcionando e feito o deploy pela plataforma do netlify
 https://luxury-parfait-6f6d5e.netlify.app/
 
 
# 🎨 Desenvolvido por:
* 👨 ``Matheus Rodrigues``
* 👩 ``Danyele Amarante``
* 👨 ``Gustavo Santos``
* 👩 ``Yasmin Diba``
* 👨 ``Cleverson Mendes``
* 👩 ``Twani Teixeira``
* 👨 ``Lucas Pereira``
 
 
 
🎁 Obrigada @Generation pelos aprendizados nessa trilha 

<div align="center">
    <img src="https://i.imgur.com/w8tTOuT.png" title="source: imgur.com" /> 
    <strong>trilha</strong>
