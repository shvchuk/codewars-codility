package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneExampleTest {
    @Test
    public void test(){
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", PhoneNumber.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(756) 234-9016", PhoneNumber.createPhoneNumber(new int[] {7, 5, 6, 2, 3, 4, 9, 0, 1, 6}));

        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumberBestSolution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", PhoneNumber.createPhoneNumberBestSolution(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(756) 234-9016", PhoneNumber.createPhoneNumberBestSolution(new int[] {7, 5, 6, 2, 3, 4, 9, 0, 1, 6}));
    }
}
