package Strategy;

public class UppercaseFormater implements TextFormatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
