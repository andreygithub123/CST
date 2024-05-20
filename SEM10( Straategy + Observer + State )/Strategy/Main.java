package Strategy;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new UppercaseFormater());

        String text="Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        System.out.println("Origianl text: "+text);
        System.out.println("Uppercase: "+editor.formatText(text));

        editor.setTextFormatter(new LowercaseFormatter());
        System.out.println("Lowercase: "+editor.formatText(text));

        editor.setTextFormatter(new CamelCaseFormatter());
        System.out.println("Camel Case: " +editor.formatText(text));
    }
}
