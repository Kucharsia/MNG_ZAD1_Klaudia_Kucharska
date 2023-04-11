import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WATEmailParser {
    private String email;

    public WATEmailParser(String email) {
        this.email = email;
    }

    public String getImie() { //Metoda odpowiedzialna za wydobycie Imienia
        String[] nameParts = email.split("[.@]");
        return nameParts[0];
    }

    public String getNazwisko() { //Metoda odpowiedzialna za wydobycie Nazwiska
        String[] nameParts = email.split("[.@]");
        return nameParts[1];
    }

    public boolean czyStudent() { //Metoda odpowiedzialna za sprawdzenie czy student
        Pattern pattern = Pattern.compile(".*@student.wat.edu\\.pl");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean czyMezczyzna() { //Metoda odpowiedzialna za sprawdzenie czy mężczyzna
        String[] nameParts = email.split("[.@]");
        String imie = nameParts[0].toLowerCase();
        return !imie.endsWith("a");
    }
}
