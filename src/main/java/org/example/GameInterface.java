package org.example;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

@Log4j2
public class GameInterface {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    private User user;
    private String chosenWord;
    private List<String> attempsUser = new ArrayList<>();
    private List<String> allowedWords;
    @Getter
    private final String PASSWORD = "01100010 01100001 01101110 01100111 01110101 01100101 01101100 01100001";

    public void startMessage() {
        System.out.println(
                "==================================================\n" +
                        "████████╗███████╗██████╗ ███╗   ███╗ ██████╗\n" +
                        "╚══██╔══╝██╔════╝██╔══██╗████╗ ████║██╔═══██╗\n" +
                        "   ██║   █████╗  ██████╔╝██╔████╔██║██║   ██║\n" +
                        "   ██║   ██╔══╝  ██╔══██╗██║╚██╔╝██║██║   ██║\n" +
                        "   ██║   ███████╗██║  ██║██║ ╚═╝ ██║╚██████╔╝\n" +
                        "   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝\n" +
                        "=================================================");
    }

    private void resetGame() {
        attempsUser.clear();
    }

    private void initializeGame() {
        for (int i = 0; i < 5; i++) {
            attempsUser.add(i, "-----");
        }
    }

    public void loginMessage(Scanner scanner) {
        String userName;
        do {
            log.info("3-15 length, lowercase/uppercase, digits and underscores are allowed.");
            log.info("Type your username: ");
            userName = scanner.nextLine();
        } while (!User.answerValidator(userName));

        this.user = new User(userName);
        log.info("User created.");
    }

    private void validateAttempt(int index, char charAttemp) {
        if (chosenWord.charAt(index) == charAttemp) {
            System.out.print(GREEN + charAttemp + RESET);
        } else if (chosenWord.contains(String.valueOf(charAttemp))) {
            System.out.print(YELLOW + charAttemp + RESET);
        } else {
            System.out.print(RED + charAttemp + RESET);
        }
    }

    private boolean validateWord(String attemp) {
        try (InputStream inputStream = GameInterface.class
                .getClassLoader()
                .getResourceAsStream("allowedWords");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))
        ) {
            allowedWords = new ArrayList<>(reader.readAllLines());
            if (allowedWords.contains(attemp)) return true;
        } catch (IOException e) {
            log.error("error details: {}", e.getMessage());
        }
        return false;
    }

    public boolean checkWin(List<String> attemps) {
        for (String attemp : attemps) {
            if (chosenWord.equalsIgnoreCase(attemp)) return true;
        }
        return false;
    }

    public boolean finalMessage(Boolean isUserWin, Scanner scanner) {
        int newScore;
        resetGame();
        if (isUserWin) {
            log.info("Congratulations {}, you won!", user.getUserName());
            newScore = user.getScore() + 1;
        } else {
            log.info("Unfortunately {}, you lost!", user.getUserName());
            newScore = user.getScore();
        }
        log.info("the word was: {}", chosenWord);
        log.info("your score is: {}", newScore);
        user.setScore(newScore);
        log.info("Do you want to start over? (S/N)");
        String respUser = scanner.nextLine().trim();
        if (!"s".equalsIgnoreCase(respUser)) {
            log.error("wrapping up...");
            return false;
        }
        return true;
    }

    private void secretCommand(String password) {
        if (password.equalsIgnoreCase(getPASSWORD())) {
            log.info("Secret command activated.");
            log.info("The word is: {}", chosenWord);
        }
    }

    private void updateAttempts(String attemp, int index) {
        attempsUser.remove(index);
        attempsUser.add(index, attemp);
    }

    public boolean gameAttempts(Scanner scanner) {
        Word word = new Word();
        initializeGame();
        this.chosenWord = word.chosenWord();
        String attemp;

        for (int i = 0; i <= 4; i++) {
            for (String attemps : attempsUser) {
                char[] attempsCharArray = attemps.toCharArray();
                System.out.println(" +---+---+---+---+---+");
                int iChar = 0;
                for (char charAttemp : attempsCharArray) {
                    System.out.print(" | ");
                    validateAttempt(iChar, charAttemp);
                    iChar++;
                }
                System.out.print(" |\n");
                System.out.print(" +---+---+---+---+---+\n");
            }
            if (checkWin(attempsUser)) return true;
            do {
                log.info("Type you attempt: ");
                attemp = scanner.nextLine();
                validateWord(attemp);
                secretCommand(attemp);
            } while (!validateWord(attemp));
            updateAttempts(attemp, i);
        }
        return checkWin(attempsUser);
    }

}

