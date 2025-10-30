package com.pluralsight.workbook5.Hogwarts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    void wizard_Setters_And_Getters() {
        Wizard wizard = new Wizard("Hermione", "Gryffindor", 100);
        wizard.setWandType("vine wood and dragon heartstring");

        assertEquals("Hermione", wizard.getName());
        assertEquals("Gryffindor", wizard.getHouse());
        assertEquals(100, wizard.getPowerLevel());
        assertEquals("vine wood and dragon heartstring", wizard.getWandType());
    }

    @Test
    void castSpell_Returns_Correct_Message() {
        Wizard harry = new Wizard("Harry", "Gryffindor", 95);
        harry.setWandType("holly and phoenix feather");

        String result = harry.castSpell("Expelliarmus");
        String expected = "Harry from Gryffindor casts Expelliarmus using a holly and phoenix feather wand!";
        assertEquals(expected,result);
    }
}