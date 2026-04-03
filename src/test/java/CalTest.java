import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void basicUnitTest() {
        Cal cal = new Cal();
        int ret = cal.getSum(10, 20);
        assertEquals(30, ret);
    }

    @Test
    void basicUnitTestFail() {
        Cal cal = new Cal();
        int ret = cal.getSum(10, 20);
        assertEquals(0, ret);
    }

}