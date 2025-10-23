package com.pluralsight.workbook4.JUnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void formatFullName() {
        //arrange
        String name = "Mel B Johnson, PhD";
        String expectedFormat = "Johnson, Mel B, PhD";

        //act
        String actualFormat = NameFormatter.format(name);

        //assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatFiveNameParts() {
        //arrange
        String name = "Dr. Mel B Johnson, PhD";
        String expectedFormat = "Johnson, Dr. Mel B, PhD";

        //act
        String actualFormat = NameFormatter.format(name);

        //assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatTwoNameParts() {
        //arrange
        String name = "Mel Johnson";
        String expectedFormat = "Johnson, Mel";

        //act
        String actualFormat = NameFormatter.format(name);

        //assert
        assertEquals(expectedFormat, actualFormat);
    }
}