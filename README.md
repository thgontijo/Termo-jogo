# 🎯 Termo Java

> Jogo de palavras inspirado no Termo, desenvolvido em Java. O jogador deve descobrir uma palavra de 5 letras através de tentativas, recebendo uma pontuação de acordo com seu desempenho.

---

## 🚀 Funcionalidades

* 🎮 Jogo de palavras com tentativas
* 🔤 Validação da palavra utilizando **Regex**
* 📖 Verificação se a palavra digitada é válida
* 📋 Lista de palavras que podem ser utilizadas nas tentativas
* 💰 Sistema de score
* 🔄 Opção de jogar novamente

---

## 🧠 Como funciona

O jogo possui duas listas de palavras:

* **Palavras válidas:** palavras que o jogador pode utilizar durante as tentativas.
* **Palavras selecionáveis:** palavras que podem ser escolhidas pelo jogo como a palavra que o jogador deve descobrir.

Ao iniciar uma partida, o sistema escolhe uma palavra da lista de palavras selecionáveis.

Durante o jogo, o jogador informa suas tentativas. A entrada é validada utilizando **Regex** e depois verificada na lista de palavras válidas.

---

## 💻 Tecnologias

* Java
* Regex
* Programação Orientada a Objetos (OOP)
* Maven
* Log4j2
* Lombok

---

## 📦 Instalação

```bash
# Clonar o repositório
git clone https://github.com/thgontijo/Termo.git

# Entrar na pasta do projeto
cd Termo

# Executar o projeto pela IDE ou através do Maven
mvn clean package
```

---

## 📝 Como jogar

1. Inicie o jogo.
2. O sistema escolherá uma palavra secreta.
3. Digite uma palavra de 5 letras.
4. O sistema verifica se a palavra possui um formato válido.
5. A palavra é comparada com a lista de palavras permitidas.
6. Continue realizando tentativas até descobrir a palavra.
7. Ao finalizar, o sistema calcula o **score**.
8. Escolha se deseja jogar novamente.

---

## 👨‍💻 Autor

* **Thyago Gontijo** – [GitHub](https://github.com/thgontijo)

---

## ⚠️ Aviso

Este projeto foi criado **para estudo e prática de Java**.
