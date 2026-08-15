# 🎯 Termo — Jogo de Palavras em Java

> Jogo de palavras inspirado no **Termo**, desenvolvido em Java para praticar conceitos de programação, validação de dados, coleções e lógica de jogo.

O jogador deve descobrir uma palavra de **5 letras** dentro de um número limitado de tentativas. A cada tentativa, o sistema verifica se o nome informado é válido e se a palavra está presente na lista de palavras permitidas.

---

## 🚀 Funcionalidades

* 🎮 Sistema de jogo baseado em tentativas
* 🔤 Validação do nome utilizando **Regex**
* 📖 Verificação se a palavra digitada existe na lista de palavras válidas
* 🎯 Seleção de uma palavra secreta a partir de uma lista específica
* 🟩 Verificação das letras da tentativa em relação à palavra secreta
* 💰 Sistema de **score/pontuação**
* 🔄 Opção de jogar novamente
* ❌ Validação de entradas inválidas
* 📝 Registro das tentativas realizadas

---

## 🧠 Regras

1. O jogador deve informar uma palavra com **5 letras**.
2. A entrada é validada utilizando **Regex**.
3. A palavra precisa existir na lista de palavras que podem ser digitadas.
4. Uma palavra é escolhida aleatoriamente entre as palavras disponíveis para serem selecionadas.
5. O jogador possui um número limitado de tentativas para descobrir a palavra.
6. O sistema verifica as letras da tentativa e fornece o resultado.
7. Ao acertar a palavra, o jogador recebe uma pontuação.
8. Ao finalizar a partida, o jogador pode escolher se deseja jogar novamente.

---

## 📚 Listas de palavras

O projeto utiliza duas listas diferentes:

### Palavras válidas para tentativa

Contém todas as palavras que o jogador pode utilizar durante o jogo.

### Palavras possíveis

Contém as palavras que podem ser escolhidas pelo sistema como palavra secreta.

Essa separação permite que o jogador possa tentar palavras que não necessariamente estejam entre as palavras escolhidas pelo jogo.

---

## 💰 Sistema de Score

O jogo possui um sistema de pontuação baseado no desempenho do jogador.

A pontuação pode variar de acordo com fatores como:

* Quantidade de tentativas utilizadas
* Acertar ou não a palavra
* Resultado da partida

---

## 💻 Tecnologias

* **Java**
* **Programação Orientada a Objetos (OOP)**
* **Regex**
* **Collections**
* **Tratamento de exceções**
* **Manipulação de Strings**
* **Geração de valores aleatórios**
* **Logs com `log.info`**

---

## 📦 Instalação

```bash
# Clonar o repositório
git clone https://github.com/thgontijo/Termo.git

# Entrar na pasta do projeto
cd Termo

# Compilar o projeto
javac -d bin src/**/*.java

# Executar o projeto
java -cp bin main.Main
```

> Os comandos podem variar dependendo da estrutura do projeto e da IDE utilizada.

---

## 🎮 Como jogar

1. Inicie o programa.
2. O sistema escolherá uma palavra secreta.
3. Digite uma palavra de **5 letras**.
4. O sistema verificará se a entrada possui um formato válido.
5. A palavra será validada contra a lista de palavras permitidas.
6. O jogo mostrará o resultado da tentativa.
7. Continue tentando até descobrir a palavra ou acabar o número de tentativas.
8. Ao final, confira seu score e escolha se deseja jogar novamente.

---

## 📁 Estrutura do projeto

```text
Termo/
├── src/
│   └── ...
├── package-input/
├── pom.xml
└── README.md
```

A estrutura pode variar conforme a organização das classes do projeto.

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido para praticar conceitos fundamentais de Java através da criação de um jogo completo, principalmente:

* Lógica de programação
* Programação Orientada a Objetos
* Validação de entradas
* Expressões regulares
* Manipulação de listas
* Strings
* Tratamento de exceções
* Organização de código
* Criação de regras e sistemas de pontuação

---

## 👨‍💻 Autor

**Thyago Gontijo**

[GitHub](https://github.com/thgontijo)

---

## ⚠️ Aviso

Este projeto foi criado **para fins de estudo e prática de Java**.

O objetivo principal é aplicar conceitos aprendidos durante os estudos de programação em um projeto prático.
