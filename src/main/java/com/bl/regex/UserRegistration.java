package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-09
 */

public class UserRegistration {

    /**
     * Created a method to validate first name
     */
    public boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /**
     * Created a method to validate last name
     */
    public boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /**
     * Created a method to validate E-mail
     */
    public boolean email(String email) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Created a method to validate Mobile Number Format
     */
    public boolean phoneNumber(String phoneNumber) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    /**
     * Created a method to validate password with minimum 8 character
     */
    public boolean password(String password) {
        String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**
     * Created a method to validate password with atLeast one upper case
     */
    public boolean passwordRule2(String password) {
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
