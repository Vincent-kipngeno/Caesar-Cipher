package decode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode testDecoder = new Decode();
        assertEquals(true, testDecoder instanceof Decode);
    }
}