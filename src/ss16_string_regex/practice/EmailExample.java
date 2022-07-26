package ss16_string_regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";
    //\w+\w*@\w+(\\.\w+)

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return  matcher.matches();
    }

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }

        for (String email : invalidEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }
    }
}
