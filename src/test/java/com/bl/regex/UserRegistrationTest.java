package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for validating first name
 */
public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    /**
     * Unit test for validating first name
     */
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rohit");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.firstName("rohit");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating last name
     */
    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.lastName("Gupta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.lastName("gupta");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating email address
     */
    @Test
    public void givenEmailWhenProperShouldReturnTrue() {
        boolean result = userRegistration.email("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.email("abc()*@gmail.com");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating format of mobile number
     */
    @Test
    public void givenPhoneNumberWhenProperShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 7844999888");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumberWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.phoneNumber("+91 7844999888");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating password with minimum 8 character
     */
    @Test
    public void givenPasswordWhenProperShouldReturnTrue() {
        boolean result = userRegistration.password("password@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.password("psw@");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating password with atLeast one upper case
     */
    @Test
    public void givenPasswordRule2WhenProperShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("passWord@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2WhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("psw@");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating password with atLeast one numeric number
     */
    @Test
    public void givenPasswordRule3WhenProperShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("123Aa@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3WhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("123456789");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating password with exactly one special character
     */
    @Test
    public void givenPasswordRule4WhenProperShouldReturnTrue() {
        boolean result = userRegistration.passwordRule4("1234@Abc");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4WhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.passwordRule4("akdj@ds@A");
        Assert.assertFalse(result);
    }

    /**
     * Unit test for validating email sequence
     */

    @Test
    public void givenEmail1WhenProperShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail1WhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertFalse(result);
    }
}
