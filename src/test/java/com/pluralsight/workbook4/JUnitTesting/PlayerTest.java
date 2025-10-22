package com.pluralsight.workbook4.JUnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    @BeforeEach
    void init() {
        player = new Player("Phu");
    }

    @Test
    void newPlayer_HasScoreZero() {
        // arrange
        int expectedScore = 0;

        // act
        int actualScore = player.getScore();

        // assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void getName_ReturnsCorrectName() {
        // arrange
        String expectedName = "Phu";

        // act
        String actualName = player.getName();

        // assert
        assertEquals(expectedName, actualName);
    }

    @Test
    void addPoints_IncreasesScore() {
        // arrange
        int pointsToAdd = 5;

        // act
        player.addPoints(pointsToAdd);
        int actualScore = player.getScore();

        // assert
        assertEquals(5, actualScore);
    }
}