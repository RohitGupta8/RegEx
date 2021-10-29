package com.bl.regex;

public class MoodAnalyserException extends Exception {

    public String message;
    public static ExceptionType type;

    public enum ExceptionType {
        EMPTY, NULL;
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        this.message = message;
        MoodAnalyserException.type = type;
    }
}
