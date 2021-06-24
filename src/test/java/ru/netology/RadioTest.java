package ru.netology;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.minRadioNumber);
        assertEquals(0, radio.currentRadioNumber);
        assertFalse(radio.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentRadioNumber);
        radio.currentRadioNumber = -10;
        assertEquals(-10, radio.currentRadioNumber);
    }
}