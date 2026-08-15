package org.example;

import java.util.Scanner;

public class GameService {
    static void main() {
        GameInterface gameInterface = new GameInterface();
        Scanner scanner = new Scanner(System.in);

        gameInterface.startMessage();
        gameInterface.loginMessage(scanner);

        boolean isUserPlayingAgain;
        do{
            boolean isUserWin = gameInterface.gameAttempts(scanner);
            isUserPlayingAgain = gameInterface.finalMessage(isUserWin, scanner);
        }while (isUserPlayingAgain);
    }
}
