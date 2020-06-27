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
}