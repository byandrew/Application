# Application - Aplicação CRUD utilizando WebService Restful

**Trabalho Final  - EES09 - Software como Serviço: Arquitetura SOA e WebService**

Serviço para controle de Bandas e Músicas em Java utilizando Webserice Restful. A aplicação permite a criação, atualização, remoção e consulta de dados de bandas e musica e possui auxílio de um formulário em HTML para criação de dados. 
Não utilizamos um banco de dados especifico para facilitar no desenvolvimento, entrega e execução do projeto. As informações estão sendo armazenadas em memória.
Neste projeto estamos utilizando o Jersey versão 1.4 e o Apache Tomcat versão 8 para rodar o serviço. É necessário ter alguma ferramenta (Poster, Advanced REST client etc.) para executar a aplicação.

#Indíce
1 - Criação de dados

2 - Atualização de dados

3 - Deletar dados existentes

4 - Listar dados existentes

5 - Contagem de dados existentes

6 - Ver informações de apenas um registro


-------------------------------------------------------------------------------------------------------------------

#1 - Criação de dados

**--BANDA**
Method: PUT

Endpoint: http://localhost:8080/Application/rest/bandas/{id}

**Payload:**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<banda>
<id>{id}</id>
<nomeBanda>AAAAA</nomeBanda>
<anoDeFormacao>2000</anoDeFormacao>
</banda>
```

Opção de cadastro via formulário: http://localhost:8080/Application/createbanda.html


**--MÚSICA**
Method: PUT

Endpoint: http://localhost:8080/Application/rest/musicas/{id}

**Payload**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<musica>
<id>{id}</id>
<nomeMusica>AAAA</nomeMusica>
<tipoMusica>AAAA</tipoMusica>
<autor>AAAA</autor>
<album>AAAA</album>
</musica>
```

Opção de cadastro via formulário: http://localhost:8080/Application/createmusica.html

-------------------------------------------------------------------------------------------------------------------

#2 - Atualização de dados

**--BANDA**
Method: PUT

Endpoint: http://localhost:8080/Application/rest/bandas/{id}

**Payload:**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<banda>
<id>{id}</id>
<nomeBanda>AAAAA</nomeBanda>
<anoDeFormacao>2000</anoDeFormacao>
</banda>
```

**--MÚSICA**

Method: PUT

Endpoint: http://localhost:8080/Application/rest/musicas/{id}

**Payload:**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<musica>
<id>{id}</id>
<nomeMusica>AAAA</nomeMusica>
<tipoMusica>AAAA</tipoMusica>
<autor>AAAA</autor>
<album>AAAA</album>
</musica>
```

-------------------------------------------------------------------------------------------------------------------

#3 - Deletar dados existentes

**--BANDA**

Method: DELETE

Endpoint: http://localhost:8080/Application/rest/bandas/{id}

**--MÚSICA**

Method: DELETE

Endpoint: http://localhost:8080/Application/rest/musicas/{id}


-------------------------------------------------------------------------------------------------------------------

#4 - Listar dados existentes

**--BANDA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/bandas/


**--MÚSICA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/musicas/


-------------------------------------------------------------------------------------------------------------------

#5 - Contagem de dados existentes

**--BANDA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/bandas/count


**--MÚSICA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/musicas/count


-------------------------------------------------------------------------------------------------------------------

#6 - Ver informações de apenas um registro

**--BANDA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/bandas/{id}


**--MÚSICA**

Method: GET

Endpoint: http://localhost:8080/Application/rest/musicas/{id}

#Autores

André Gomes

&

Leornado Santos








