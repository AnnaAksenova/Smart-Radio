package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RadioAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "RadioPlus";

        assertNull(radio.getName());
        radio.setName("RadioPlus");
        assertEquals(expected, radio.getName());
    }

    @Test
    public void returnZeroStationAfterMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(0);

        radio.setCurrentRadioNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void returnNineStationAfterMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(9);

        radio.setCurrentRadioNumber(10);

        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingOnNextStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(3);

        radio.setCurrentRadioNumber(4);

        int expected = 4;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingOnPreviousStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(9);

        radio.setCurrentRadioNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioNumberMoreMax(){
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(0);

        radio.setCurrentRadioNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioNumberLessMin(){
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(0);

        radio.setCurrentRadioNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMoreMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxVolumeLevel(10);
        radio.setMinVolumeLevel(0);
        radio.setCurrentVolumeLevel(10);

        radio.setCurrentVolumeLevel(11);

        int expected = 10;
        int actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolumeLessMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxVolumeLevel(10);
        radio.setMinVolumeLevel(0);
        radio.setCurrentVolumeLevel(0);

        radio.setCurrentVolumeLevel(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);

    }

    @Test
    public void choiceWantStation() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "6";

        assertNull(radio.getWantStation());
        radio.setWantStation("6");
        assertEquals(expected, radio.getWantStation());
    }

    @Test
    public void setMaxVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolumeLevel(6);

        radio.setMaxVolumeLevel(10);

        int expected = 10;
        int actual = radio.getMaxVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolumeLevel(5);

        radio.setMinVolumeLevel(0);

        int expected = 0;
        int actual = radio.getMinVolumeLevel();
        assertEquals(expected, actual);
    }
    @Test
    public void oneStepForwardVolumeLevel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolumeLevel(6);

        radio.setCurrentVolumeLevel(-1);

        int expected = 7;
        int actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
      void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(9, radio.maxRadioNumber);
        assertEquals(0, radio.minRadioNumber);
        assertEquals(0, radio.currentRadioNumber);
        assertEquals(0, radio.minVolumeLevel);
        assertEquals(10, radio.maxVolumeLevel);
        assertEquals(0, radio.currentVolumeLevel);
    }
}
