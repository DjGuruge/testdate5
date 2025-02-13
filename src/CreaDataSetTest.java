import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CreaDataSetTest {

    @Test
    void addYear() {
        String res = CreaDataSet.addYear("2023-03-01T13:00:00Z",1);
        assertEquals("1 mar 2024, 13:00:00",res);
    }
  @Test
    void addTwoYear() {
        String res = CreaDataSet.addYear("2023-03-01T13:00:00Z",2);
        assertEquals("1 mar 2025, 13:00:00",res);
    }

    @Test
    void subtractMonths() {
    }

    @Test
    void addDays() {
    }
}