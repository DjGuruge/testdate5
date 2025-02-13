import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CreaDataSetTest {

    @Test
    void addYear() {
        String res = CreaDataSet.addYear("2023-03-01T13:00:00Z", 1);
        assertEquals("8 feb 2024, 13:00:00", res);
    }

    @Test
    void addTwoYear() {
        String res = CreaDataSet.addYear("2023-03-01T13:00:00Z", 2);
        assertEquals("8 feb 2025, 13:00:00", res);
    }

    @Test
    void addOneCenturyYear() {
        String res = CreaDataSet.addYear("2023-03-01T13:00:00Z", 100);
        assertEquals("8 feb 2123, 13:00:00", res);
    }

    @Test
    void addOnlyEightHours() {
        String res = CreaDataSet.addYear("2023-03-02T01:00:00Z", 0);
        assertEquals("9 feb 2023, 01:00:00", res);
    }


}