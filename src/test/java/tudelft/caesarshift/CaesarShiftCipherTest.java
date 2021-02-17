package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesar;

    @BeforeEach
    public void initialization() {
        this.caesar = new CaesarShiftCipher();
    }

    @Test
    public void shiftPlusThree() {
        String result = caesar.CaesarShiftCipher("hello", 3);
        Assertions.assertEquals("khoor", result);
    }

    @Test
    public void shiftMinusThree() {
        String result = caesar.CaesarShiftCipher("hello", -3);
        Assertions.assertEquals("ebiil", result);
    }

    @Test
    public void shiftPlus27() {
        String result = caesar.CaesarShiftCipher("hello", 27);
        Assertions.assertEquals("ifmmp", result);
    }

    @Test
    public void shiftPlus26() {
        String result = caesar.CaesarShiftCipher("hello", 26);
        Assertions.assertEquals("hello", result);
    }

    @Test
    public void shiftPlusZero() {
        String result = caesar.CaesarShiftCipher("hello", 0);
        Assertions.assertEquals("hello", result);
    }

}
