package Strategy;

public class TextEditor {
    private TextFormatter formatter;

    public TextEditor(TextFormatter textFormatter) {
        this.formatter = textFormatter;
    }

    public void setTextFormatter(TextFormatter textFormatter) {
        this.formatter = textFormatter;
    }

    public String formatText(String text){
        return formatter.format(text);
    }
}
