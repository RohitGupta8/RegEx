package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-09
 */

public class UserRegistration {

    // Created a method to validate first name
    public boolean firstName(String firstName) throws UserRegistrationException {
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    }

    // Created a method to validate last name
    public boolean lastName(String lastName) throws UserRegistrationException {
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    // Created a method to validate email address
    public boolean email(String email) throws UserRegistrationException {
        if (email == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (email.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[a-z]{3,}([_+-.]?[a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,][a-z]{2,3}+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Created a method to validate phone number
    public boolean phoneNumber(String phoneNumber) throws UserRegistrationException {
        if (phoneNumber == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (phoneNumber.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // Created a method to validate password according to rule 1
    public boolean passwordRule1(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Created a method to validate password according to rule 2
    public boolean passwordRule2(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Created a method to validate password according to rule 3
    public boolean passwordRule3(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Created a method to validate password according to rule 4
    public boolean passwordRule4(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Created a method to validate all the emails in the list
    public boolean emailIdValidator(String emailId) throws UserRegistrationException {
        if (emailId == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[a-z]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,]?[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}
