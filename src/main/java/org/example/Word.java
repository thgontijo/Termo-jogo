package org.example;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Log4j2
public class Word {
    private List<String> possibleWords;
    private final Random RANDOM_NUMBER = new Random();
    private List<Integer> chosenWords = new ArrayList<>();

    public Word() {
        try (InputStream inputStream = Word.class
                .getClassLoader()
                .getResourceAsStream("possibleWords");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            possibleWords = reader.readAllLines();
        } catch (IOException e) {
            log.error("error details: {}", e.getMessage());
        }
    }

    public String chosenWord() {
        int chosenLine;
        do {
            chosenLine = RANDOM_NUMBER.nextInt(possibleWords.size());
        } while (chosenWords.contains(chosenLine));
        chosenWords.add(chosenLine);
        return possibleWords.get(chosenLine);
    }
}
