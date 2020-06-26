package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void Cipher_isInstanceOfCipher_true() {
        Cipher testCipher = new Cipher("a");
        assertEquals(true, testCipher instanceof Cipher);
    }
}