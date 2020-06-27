package decode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode testDecoder = new Decode("A");
        assertEquals(true, testDecoder instanceof Decode);
    }

    @Test
    public void decoderFunc_decodeSingleLetter_A() {
        Decode testDecoder = new Decode("L");
        assertEquals("A", testDecoder.decoderFunc());
    }

    @Test
    public void decoderFunc_decodeWordWithMOreThanOneLetters_AB() {
        Decode testDecoder = new Decode("LM");
        assertEquals("AB", testDecoder.decoderFunc());
    }

    @Test
    public void decoderFunc_passNonAlphabeticalCharacters_AB4() {
        Decode testDecoder = new Decode("LM4");
        assertEquals("AB4", testDecoder.decoderFunc());
    }

    @Test
    public void decoderFunc_charactersWithIndexLessThanTheKey_Z() {
        Decode testDecoder = new Decode("K");
        assertEquals("Z", testDecoder.decoderFunc());
    }
}