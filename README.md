# Cadastro de Produtos

## Sobre o Projeto
Este repositório contém a implementação de um desafio para desenvolvedores web. O objetivo é simular um cadastro de produtos com backend em Java utilizando servlets e frontend em HTML, CSS, e JavaScript (com Jquery).

### Principais Tecnologias Utilizadas
- **Java**: Backend com servlets.
- **JSP**: Para renderização de páginas dinâmicas.
- **JQuery**: Gerenciamento de chamadas AJAX.
- **Bootstrap**: Estilização responsiva.

### Diferenciais Implementados
- Integração manual de dependências (sem uso de frameworks completos).
- Utilização de um "Fake MVC" para organização do código.
- Implementação da lógica de inserção com simulação de banco de dados, imprimindo o comando `INSERT` tanto no backend quanto no frontend.

## Estrutura do Projeto

1. **Frontend**:
   - Formulário para cadastro de produtos (código, descrição e valor).
   - Utiliza HTML, CSS e Bootstrap para estilização.
   - Implementação de chamada AJAX com JQuery para enviar os dados ao backend.

2. **Backend**:
   - Servlet em Java que recebe os dados do formulário via requisição POST.
   - Simulação de gravação no banco de dados com impressão no console do comando `INSERT` gerado.

3. **Banco de Dados**:
   - Estrutura da tabela utilizada:
     ```sql
     CREATE TABLE PRODUTOS (
         COD NUMBER,
         DESCRICAO VARCHAR2(50),
         VALOR NUMBER(12,2)
     );
     ```

## Prints do Projeto

Confira abaixo algumas imagens do projeto rodando (anexadas no repositório):
1. Formulário de cadastro.
2. Resultado do cadastro no frontend.
3. Saída do comando `INSERT` no console.

## Como Executar

### Pré-requisitos
- **Java**: Versão 8 ou superior.
- **Servidor de Aplicação**: Apache Tomcat (ou outro compatível com servlets).
- **Banco de Dados**: Oracle (opcional, pois é apenas simulação).

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/LucasSalu/Product_Servlet.git
   ```
2. Configure o servidor de aplicação e publique o projeto.
3. Acesse o aplicativo no navegador (ex.: `http://localhost:8080/product`).
4. Preencha o formulário com os dados do produto e clique em **Salvar**.
5. Verifique a resposta no frontend e o comando `INSERT` gerado no console do servidor.

## O Desafio

### Descrição
A ideia é simular um cadastro (apenas a inserção) de um produto. O objetivo é implementar:

1. **Frontend**
   - Criar uma página utilizando HTML e CSS com o formulário:
     ```
     Cadastro de Produtos
     Cod: _______
     Descrição: _________________________
     Valor: _______________
     [ Salvar ]
     ```

2. **JavaScript/JQuery**
   - Implementar o botão **SUBMIT** para enviar os dados via AJAX para o backend.

3. **Backend (Servlet)**
   - Criar um servlet para receber a requisição e simular a gravação no banco.
   - Imprimir no console o comando `INSERT` gerado.

### Estrutura da Tabela
```sql
PRODUTOS (
    COD NUMBER,
    DESCRICAO VARCHAR2(50),
    VALOR NUMBER(12,2)
)
```

### Saída Esperada
- Impressão do comando:
  ```
  insert into PRODUTOS (COD, DESCRICAO, VALOR) values (1, 'Produto Teste', 99.99);
  ```

---

![image](https://github.com/user-attachments/assets/94f2ae0c-0d8a-430d-9504-3e5732dca88d)

![image](https://github.com/user-attachments/assets/b089aa71-61b2-4aaa-9a42-be20dc7ca8e0)





