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
    public void encoderFunc_shiftSingleLetterA_L() {
        Encoder testEncoder = new Encoder("A");
        assertEquals("L", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_shiftSingleWordLetters_LMNO() {
        Encoder testEncoder = new Encoder("ABCD");
        assertEquals("LMNO", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_shiftSingleWordLettersWithNonAlphabeticalLetters_L4MN() {
        Encoder testEncoder = new Encoder("A4BC");
        assertEquals("L4MN", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_shiftLettersWithIndexAbove14_C() {
        Encoder testEncoder = new Encoder("R");
        assertEquals("C", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_shiftLettersOfStatement_string() {
        Encoder testEncoder = new Encoder("I am here");
        assertEquals("T LX SPCP", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_replaceCharactersAtSpecificIndexOnlyToPreventReplacingAlreadyEncodedLetters_String() {
        Encoder testEncoder = new Encoder("AL");
        assertEquals("LW", testEncoder.encoderFunc());
    }

    @Test
    public void encoderFunc_encodeAllAlphabeticalLetters_String() {
        Encoder testEncoder = new Encoder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("LMNOPQRSTUVWXYZABCDEFGHIJK", testEncoder.encoderFunc());
    }

    @Test
    public void getEncodedString_testEncodedStringGetterFunc_L() {
        Encoder testEncoder = new Encoder("A");
        assertEquals("L", testEncoder.getEncodedString());
    }
}