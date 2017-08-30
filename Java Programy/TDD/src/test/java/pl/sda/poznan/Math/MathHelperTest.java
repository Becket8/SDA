package pl.sda.poznan.Math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class MathHelperTest {
    private int input;
    private int expected;

    public MathHelperTest(int input, int expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        // Przerabia nam tablice tablic na liste, ktora mozemy nastepne zwrocic
        return Arrays.asList(data);
    }

    @Test
    public void factorial() throws Exception {
        int result = MathHelper.Factorial(input);
        assertEquals(expected, result);
    }

}