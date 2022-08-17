<img src="https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow"/>

<h1>Spring API REST</h1>

<h2>Sumário</h2>
<ul>
 <li><a href="#objetivo">Objetivo</a></li> 
 <li><a href="#sobre-o-projeto">Sobre o Projeto</a></li>
 <li><a href="#tecnologias-utilizadas">Tecnologias Utilizadas</a></li>
 <li><a href="#demonstracao">Demonstração</a></li> 
 <li><a href="#screenshots">Screenshots</a></li> 
 <li><a href="#como-rodar-o-projeto">Como Rodar o Projeto</a></li>
 <li><a href="#pontos-de-melhoria">Pontos de Melhoria</a></li> 
</ul>

<h2 id="objetivos">Objetivos</h2>

<p>Estudar e praticar a criação de uma API REST e testes unitários com utilização do Spring</p>

<h2 id="sobre-o-projeto">Sobre o Projeto</h2>

<p>O projeto trata da criação de uma API REST para gerenciamento de Produtos, uma estrutura de CRUD (CREATE/READ/UPDATE/DELETE) com os principais métodos HTTP (GET/PUT/UPDATE/DELETE).</p>
</p>O sistema foi desenvolvido em Java e Spring com as configurações realizadas com Spring Boot, a entidade foi mapeada utilizando JPA e Hibernate e os dados foram persistidos no Banco de Dados Postgres.</p> 
<p>Para gerenciamento de depedências foi utilizado o Maven, e a API foi toda documentada através do Swagger.</p>
<p>Os Testes unitários no Controller foram realizados JUnit, Mockito e Spring MockMVC.</p>

<h2 id="tecnologias-utilizadas">Tecnologias Utilizadas:</h2>

<p>
   <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
   <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
   <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot"/>
   <img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white"/>
   <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
   <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white"/>
   <img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
   <img src="https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>
</p>

<h2 id="demonstracao">Demonstração</h2>

https://user-images.githubusercontent.com/89096854/185163418-424bc8f6-3c20-43ed-9a69-fb995e0bb3b3.mp4

<h2 id="screenshots">Screenshots</h2>

<h3>Métodos HTTP</h3>

![swagger-req](https://user-images.githubusercontent.com/89096854/185151653-f081a13f-7128-49d9-9f4a-0bf90f3eb558.PNG)

<h3>Banco de Dados</h3>

![banco_de_dados](https://user-images.githubusercontent.com/89096854/185151637-8ebfd3b8-e2fc-4618-8e08-8009d8c293fe.PNG)

<h3>Testes</h3>

![unit_testing](https://user-images.githubusercontent.com/89096854/185151656-397f2ee9-0cc5-42a2-8fa1-286081c88bc6.PNG)

![build_sucess_unit_testing](https://user-images.githubusercontent.com/89096854/185151646-7297145e-5a92-4b1a-8b59-b62fb13bf22d.PNG)

<h2 id="como-rodar-o-projeto">Como Rodar o Projeto</h2>

<h3>Instalação</h3>

<p>O projeto é gerenciado pelo Maven, então para usa-lo basta importa-lo para uma IDE.</p>

<h3>Configurações do banco de dados</h3>

<p>Você pode criar um banco de dados PostgreSQL com o nome o nome de sua preferência, porém é necessario adequar o projeto de acordo com as suas configurações. Para isso abra o arquivo application.properties, localizado em src/main/resources/application.properties e altere os seguintes comandos ao arquivo:</p>

```
spring.datasource.url = jdbc:postgresql://localhost:5432/nome-do-seu-banco-de-dados
spring.datasource.username = seu-usuario
spring.datasource.password = sua-senha
```
 
<h3>Execução</h3>

<p>Execute o projeto através do IDE, abra um navegador de sua preferência e digite: http://localhost:8080/swagger-ui/#/ para acessar a interface do Swagger para acessar os métodos de requisição</p>


<h2 id="pontos-de-melhoria">Pontos de Melhoria</h2>
<ul>
 <li>Deploy do projeto em Cloud</li>
 <li>Criação de novos métodos de requisição HTTP</li>
