import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @Test
    void findNextDay() {
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalDate result = LocalDate.of(2018, 1, 2);
        assertEquals(result, FindNextDay.findNextDay(date));
    }

    @Test
    void findNextDay1() {
        LocalDate date = LocalDate.of(2018, 1, 31);
        LocalDate result = LocalDate.of(2018, 2, 1);
        assertEquals(result, FindNextDay.findNextDay(date));
    }

    @Test
    void findNextDay2() {
        LocalDate date = LocalDate.of(2018, 4, 30);
        LocalDate result = LocalDate.of(2018, 5, 1);
        assertEquals(result, FindNextDay.findNextDay(date));
    }

    @Test
    void findNextDay3() {
        LocalDate date = LocalDate.of(2018, 2, 28);
        LocalDate result = LocalDate.of(2018, 3, 1);
        assertEquals(result, FindNextDay.findNextDay(date));
    }

    @Test
    void findNextDay4() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        LocalDate result = LocalDate.of(2020, 3, 1);
        assertEquals(result, FindNextDay.findNextDay(date));
    }

    @Test
    void findNextDay5() {
        LocalDate date = LocalDate.of(2018, 12, 31);
        LocalDate result = LocalDate.of(2019, 1, 1);
        assertEquals(result, FindNextDay.findNextDay(date));
    }
}