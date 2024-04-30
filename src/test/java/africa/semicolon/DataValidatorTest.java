package africa.semicolon;

import africa.semicolon.Chapter14.DataValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    public void testValidatePhoneNumber(){
        String phoneNumber = "";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber2(){
        String phoneNumber = "08123456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber3(){
        String phoneNumber = "+2348123456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber4(){
        String phoneNumber = "+2348123456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber5(){
        String phoneNumber = "+2349023456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber6(){
        String phoneNumber = "+2347123456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber7(){
        String phoneNumber = "+23471234a6790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber8(){
        String phoneNumber = "a234712.456790";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber9(){
        String phoneNumber = "+23407oooooooo";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber10(){
        String phoneNumber = "+234 701 506 7890";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber11(){
        String phoneNumber = "7023452367";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }



    @Test
    public void testValidateEmailAddress(){
        String email = "";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertFalse(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress1(){
        String email = "o.oladeji@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress2(){
        String email = "ashley@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress3(){
        String email = "ASHLEY@semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }

    @Test
    public void testValidateEmailAddress4(){
        String email = "ashley@native.semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }






}