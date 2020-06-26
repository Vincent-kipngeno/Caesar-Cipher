package models;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Encoder {

    private String inputString;
    private String encodedString;
    private Character[] alphabeticalLetters = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' } ;
    private int key = 11;

    public Encoder(String inputString ) {
        this.inputString = inputString;
    }

    public String encoderFunc(){
        String stringPassingEncoding = this.inputString;

        return stringPassingEncoding;
    }
}