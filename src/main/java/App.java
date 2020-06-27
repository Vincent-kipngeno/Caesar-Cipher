import  models.Encoder;
import  decode.Decode;

import java.io.Console;
import java.io.IOException;

public class App{
    public static void main(String[] args) throws IOException {
        Console myConsole = System.console();

        System.out.println("Enter the statement to be encoded: ");
        String statementToEncode = myConsole.readLine();
        Encoder statementEncoder = new Encoder(statementToEncode);
        String encodedStatement = statementEncoder.getEncodedString();
        Decode statementDecoder = new Decode(encodedStatement);
        String decodedStatement = statementDecoder.getDecodedString();
        System.out.println(statementToEncode.toUpperCase());
        System.out.println(encodedStatement);
        System.out.println(decodedStatement);
    }
}