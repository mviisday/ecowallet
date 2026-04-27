#  EcoWallet

Aplicação desktop para controle financeiro pessoal desenvolvida em Java, utilizando conceitos de Programação Orientada a Objetos (POO), JavaFX para interface gráfica e Maven para gerenciamento do projeto.

---

## Funcionalidades

* Cadastro de receitas e despesas
* Listagem de transações em tabela
* Cálculo automático de saldo
* Persistência de dados em arquivo

---

## Conceitos aplicados

* Encapsulamento
* Herança
* Polimorfismo
* Princípio da Responsabilidade Única (SRP)

---

## Tecnologias utilizadas

* Java 21
* JavaFX
* Maven
* IntelliJ IDEA
* Git e GitHub

---

## Estrutura do projeto

```
ecowallet/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── br/com/unicatolica/
    │   │       ├── modelo/
    │   │       │   ├── Transacao.java
    │   │       │   ├── Receita.java
    │   │       │   └── Despesa.java
    │   │       ├── servico/
    │   │       │   ├── Carteira.java
    │   │       │   └── Persistencia.java
    │   │       ├── controlador/
    │   │       │   └── ControladorPrincipal.java
    │   │       └── EcowalletAplicacao.java
    │   └── resources/
    │       └── view/
    │           └── VisaoPrincipal.fxml
    └── data/
        └── transacoes.csv
```

---

## Como executar

1. Clone o repositório:

```
git clone https://github.com/mviisday/ecoWallet.git
```

2. Abra o projeto no IntelliJ IDEA

3. Execute utilizando o Maven:

```
javafx:run
```

---

## Status do projeto

Em desenvolvimento

---

## Autor

Desenvolvido por Mviisday
