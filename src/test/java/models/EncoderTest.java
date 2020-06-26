package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {
    @Test
    public void Encoder_isInstanceOfCipher_true() {
        Encoder testEncoder = new Encoder("a");
        assertEquals(true, testEncoder instanceof Encoder);
    }

    @Test
    public void Encoder_shiftSingleLetterA_L() {
        Encoder testEncoder = new Encoder("A");
        assertEquals("L", testEncoder.encoderFunc());
    }
}