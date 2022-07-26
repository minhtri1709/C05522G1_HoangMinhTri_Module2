package ss16_string_regex.excersice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static RegularExpression regularExpression;
    public static final String[] validClassName = new String[] {"C0318G"};
    public static final String[] invalidClassName = new String[] {"M0318G", "P0323A"};
    private static final String CLASS_REGEX = "([CAP]|[^A-Za-z0-9])[0-9]{4}[GHIKLM]";

    private static Pattern pattern;
    private Matcher matcher;

    public RegularExpression(){
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        regularExpression = new RegularExpression();

        for (String className : validClassName){
            boolean isValid =  regularExpression.validate(className);
            System.out.println("Class name " + className + " is valid " + isValid);
        }

        for (String className : invalidClassName){
            boolean isValid = regularExpression.validate(className);
            System.out.println("Class name " + className + " is valid " + isValid);
        }
    }
}
