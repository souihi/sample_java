package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatesTest {

    @Test
    void isDateValid() {
        Dates dates = new Dates();
        assertEquals(false, dates.isDateValid("255-20-00"));
        assertEquals(true, dates.isDateValid("12-02-2020"));
    }

}