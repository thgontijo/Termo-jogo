
# 🎮 Termo Java


Jogo de palavras desenvolvido em Java, inspirado no jogo Termo. O jogador deve descobrir uma palavra secreta de 5 letras dentro de um número limitado de tentativas.


O projeto utiliza validações com Regex, manipulação de arquivos, listas de palavras, sistema de pontuação e logging para controlar o funcionamento do jogo.


---


## 🚀 Funcionalidades


- Cadastro e validação de nome de usuário
- Validação do nome utilizando **Regex**
- Palavras com exatamente **5 letras**
- Verificação se a palavra digitada é válida
- Lista de palavras permitidas para tentativas
- Lista separada de palavras que podem ser escolhidas como palavra secreta
- Sorteio de uma palavra secreta
- Sistema de tentativas
- Sistema de **score**
- Opção de jogar novamente
- Leitura das palavras através de arquivos `.txt`
- Logs utilizando **Log4j2**
- Validação e tratamento de entradas do usuário


---


## 💻 Tecnologias Utilizadas


- **Java 25**
- **Maven**
- **Lombok**
- **Log4j2**
- **Regex**
- **Java NIO (Files e Path)**
- **Collections API**


---


## 📦 Instalação


### Clonar o repositório


```bash
git clone https://github.com/thgontijo/Termo.git
Entrar na pasta
cd Termo
Compilar o projeto
mvn clean package
Executar o projeto
java -jar target/Termo-1.0-SNAPSHOT.jar
📝 Como Usar
Execute o programa.
Informe seu nome de usuário.
O sistema valida o nome utilizando Regex.
Uma palavra secreta de 5 letras é escolhida aleatoriamente.
Digite uma palavra para realizar uma tentativa.
O sistema verifica se a palavra está presente na lista de palavras válidas.
Continue realizando tentativas até descobrir a palavra secreta ou atingir o limite de tentativas.
Ao final da partida, o sistema calcula e exibe o score.
O jogador pode escolher se deseja jogar novamente.
📚 Estrutura das Palavras

O projeto utiliza duas listas diferentes:

Palavras válidas: palavras que o jogador pode utilizar durante suas tentativas.
Palavras secretas: palavras que podem ser selecionadas pelo sistema como objetivo da partida.

As listas são armazenadas em arquivos .txt dentro do diretório resources.

🏆 Sistema de Score

O jogo possui um sistema de pontuação baseado no desempenho do jogador.

Quanto menos tentativas forem necessárias para descobrir a palavra, maior será a pontuação obtida.

👨‍💻 Autor

Thyago Gontijo

GitHub: https://github.com/thgontijo

⚠️ Aviso

Este projeto foi desenvolvido exclusivamente para estudo e prática de desenvolvimento em Java.

O objetivo principal é aplicar conceitos como Programação Orientada a Objetos, Regex, Collections, manipulação de arquivos, Maven, logging e tratamento de exceções.
