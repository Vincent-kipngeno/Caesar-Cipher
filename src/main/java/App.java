import  models.Encoder;
import  decode.Decode;

import java.io.Console;

public class App{
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Enter the statement to be encoded: ");
        String statementToEncode = myConsole.readLine();
    }
}