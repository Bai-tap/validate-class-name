import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKML]$";
    private static Pattern pattern;
    private static Matcher matcher;

    public ClassNameExample() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
