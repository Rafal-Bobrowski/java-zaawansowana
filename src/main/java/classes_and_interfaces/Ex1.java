package classes_and_interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("r.bobr@o2.pl", "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}

class UserValidator {

    public String[] validateEmails(String email, String alternativeEmail) {

        class Email {
            private final String email;

            public Email(String email){
                if(email == null || email.isEmpty() || !validate(email)){
                    this.email = "unknown";
                }else{
                    this.email = email;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email, email2.email};
    }

    public static final Pattern VALID_EMAIL_ADRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean validate(String emailStr){
        Matcher matcher = VALID_EMAIL_ADRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }
}

