## Licença

Este projeto é de código livre e está licenciado sob a **Licença MIT**. Você pode usá-lo, modificá-lo e distribuí-lo livremente.

# BuscaINPI

Este é um projeto de busca de dados no INPI (Instituto Nacional da Propriedade Industrial).

Ele atua como um dos microsserviços do ecossistema **Vayziru**, uma empresa/marca pessoal dedicada a resolver problemas complexos no mercado através de tecnologia.

## Funcionalidades

- Integração com serviços do INPI.
- Download e descompactação automática de arquivos XML (Processos de Marcas).
- Processamento de dados para consulta.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot** (RestClient)

## Como Compilar e Executar

Para realizar o build do código Java e gerar o arquivo executável, execute o seguinte comando na raiz do projeto (onde está o arquivo `pom.xml` ou `build.gradle`):

```bash
mvn clean package
```
*(Se estiver utilizando o Maven Wrapper, você pode rodar `./mvnw clean package`)*

Após o build ser concluído com sucesso, o arquivo compilado estará disponível na pasta `target/`. Para rodar a aplicação, utilize o seguinte comando:

```bash
java -jar target/nome-do-arquivo.jar
```
*(Lembre-se de substituir `nome-do-arquivo.jar` pelo nome exato do arquivo gerado, como por exemplo `Busca-0.0.1-SNAPSHOT.jar`)*

