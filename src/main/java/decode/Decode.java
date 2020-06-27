package decode;

import java.util.Arrays;

public class Decode {

    private String encodedString;
    private String decodedString;
    private Character[] alphabeticalLetters = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' } ;
    private int key = 11;

    public Decode(String encodedString) {
        this.encodedString = encodedString;
    }

    public String decoderFunc (){
        String stringPassingDecoding = this.encodedString;
        int nextCharacterIndex = 0;
        for (int i = 0; i < stringPassingDecoding.length(); i++) {
            int characterIndex = Arrays.binarySearch(alphabeticalLetters, stringPassingDecoding.charAt(i));
            if (characterIndex == -1) {
                continue;
            } else{
                if (characterIndex >= key) {
                    nextCharacterIndex = characterIndex - key;
                } else {
                    nextCharacterIndex = 26 - (key - characterIndex);
                }
                char charToBeDecoded = stringPassingDecoding.charAt(i);
                char charForDecoding = alphabeticalLetters[nextCharacterIndex];
                stringPassingDecoding = stringPassingDecoding.replaceAll(String.valueOf(charToBeDecoded), String.valueOf(charForDecoding));
            }

        }
        return stringPassingDecoding;
    }

    public String getDecodedString() {
        this.decodedString = decoderFunc();
        return decodedString;
    }
}