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
        String stringPassingEncoding = this.inputString.toUpperCase();
        int nextCharacterIndex = 0;
        for (int i = 0; i < stringPassingEncoding.length(); i++) {
            int characterIndex = Arrays.binarySearch(alphabeticalLetters, stringPassingEncoding.charAt(i));
            if (characterIndex == -1) {
                continue;
            } else{
                if (characterIndex < 14) {
                    nextCharacterIndex = characterIndex + key;
                } else {
                    nextCharacterIndex = (characterIndex + key) - 26;
                }
                char charToBeEncoded = stringPassingEncoding.charAt(i);
                char charForEncoding = alphabeticalLetters[nextCharacterIndex];
                stringPassingEncoding = stringPassingEncoding.replaceAll(String.valueOf(charToBeEncoded), String.valueOf(charForEncoding));
            }
        }
        return stringPassingEncoding;
    }

    public String getEncodedString() {
        this.encodedString = encoderFunc();
        return this.encodedString;
    }
}