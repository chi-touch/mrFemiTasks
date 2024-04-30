package africa.semicolon.Chapter14;

public class DataValidator {
    public static boolean isPhoneNumberValid(String phoneNumber) {
        phoneNumber = phoneNumber.replace(" ","");
        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(regex);
    }

    public static boolean isEmailValid(String email){
        email = email.toLowerCase();
        String regex = "([a-z]\\.)?[a-z]+@(enum|semicolon|learnspace|native.semicolon).africa";
        return  email.matches(regex);
    }
}
