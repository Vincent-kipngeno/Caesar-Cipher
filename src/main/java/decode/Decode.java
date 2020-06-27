package decode;

public class Decode {

    private String encodedString;
    private String decodedString;
    private Character[] alphabeticalLetters = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' } ;
    private int key = 11;

    public Decode(String encodedString) {
        this.encodedString = encodedString;
    }

    public String decoderFunc (){
        return "A";
    }
}