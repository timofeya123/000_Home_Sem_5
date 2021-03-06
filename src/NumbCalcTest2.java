import org.junit.Test;
import static org.junit.Assert.*;

public class NumbCalcTest2 {
    @Test
    public void fact() throws Exception {
        BigNum2 x = new BigNum2(7);
        NumbCalc nb = new NumbCalc(x);
        assertEquals(nb.fact(5).toString(), "120");
        assertEquals(nb.fact(4).toString(), "24");
        assertEquals(nb.fact(17).toString(), "355687428096000");
    }

    @Test
    public void binom() throws Exception {
        BigNum2 x = new BigNum2();
        NumbCalc nb = new NumbCalc(x); // Мы хотим увидеть картину:  1      5     10     10      5      1
        assertEquals(nb.binom(5,0).toString(), "1");
        assertEquals(nb.binom(5,1).toString(), "5");
        assertEquals(nb.binom(5,2).toString(), "10");
        assertEquals(nb.binom(5,3).toString(), "10");
        assertEquals(nb.binom(5,4).toString(), "5");
        assertEquals(nb.binom(5,5).toString(), "1");
    }
}
