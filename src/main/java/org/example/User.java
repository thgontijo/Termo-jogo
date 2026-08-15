package org.example;

import lombok.Setter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String userName;
    @Setter
    private int score;
    private static final Pattern USERNAME_PATTERN = Pattern.compile("[a-zA-Z0-9._-]{3,}");

    public User(String userName) {
        this.userName = userName;
    }

    public static Boolean answerValidator(String userName) {
        if (userName == null || userName.isEmpty()) return false;
        Matcher matcher = USERNAME_PATTERN.matcher(userName);
        return matcher.matches();
    }

    public int getScore() {
        return score;
    }

    public String getUserName() {
        return userName;
    }
}
