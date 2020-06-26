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
    public void EncoderFunc_shiftSingleLetterA_L() {
        Encoder testEncoder = new Encoder("A");
        assertEquals("L", testEncoder.encoderFunc());
    }

    @Test
    public void EncoderFunc_shiftSingleWordLetters_LMNO() {
        Encoder testEncoder = new Encoder("ABCD");
        assertEquals("LMNO", testEncoder.encoderFunc());
    }

    @Test
    public void EncoderFunc_shiftSingleWordLettersWithNonAlphabeticalLetters_L4MN() {
        Encoder testEncoder = new Encoder("A4BC");
        assertEquals("L4MN", testEncoder.encoderFunc());
    }

    @Test
    public void EncoderFunc_shiftLettersWithIndexAbove14_C() {
        Encoder testEncoder = new Encoder("R");
        assertEquals("C", testEncoder.encoderFunc());
    }
}