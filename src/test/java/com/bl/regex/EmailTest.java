package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class EmailTest {
    private String email;
    private boolean expectedResult;

    public EmailTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emailIdsExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com.com", false},
                {"abc+100c@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.", false},

        });
    }

    /**
     * Created a Test method for validating all the sample emails in the List and handling the exception
     */
    @Test
    public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.email(this.email);
            Assert.assertEquals(this.expectedResult, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    /**
     * Created a Test method for validating null value emails in the List and handling the exception
     */
    @Test
    public void givenEmail1_null_ShouldThrowUserRegistrationException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.email(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    /**
     * Created a Test method for validating empty emails in the List and handling the exception
     */
    @Test
    public void givenEmail1_EMPTY_ShouldThrowUserRegistrationException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.email("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }
}
