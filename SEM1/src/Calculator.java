import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//IMPLEMENTAT
public class Calculator {

    private double readInput(String variable) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(variable);
        return Double.parseDouble(reader.readLine());
    }

    public double calculateX5PlusY7() throws IOException {
        double x = readInput("X:");
        double y = readInput("Y:");

        double x5 = Math.pow(x, 5);
        double y7 = Math.pow(y, 7);

        return x5 + y7;
    }
}