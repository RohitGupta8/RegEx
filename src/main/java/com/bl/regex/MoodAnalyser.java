package com.bl.regex;

/**
 * Purpose  - Mood Analyser for user
 *
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-09
 */

public class MoodAnalyser {

    public static String analyseMood(String mood) throws MoodAnalyserException {
        try {
            if (mood.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY, "Invalid Input");
            } else if (mood.toLowerCase().contains("happy")) {
                return "Entry Successful";
            } else if (mood.toLowerCase().contains("sad")) {
                return "Entry Failed";
            } else {
                return "Invalid Input";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "Invalid mood");
        }
    }
}