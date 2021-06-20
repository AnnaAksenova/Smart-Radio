package ru.netology;

public class RadioAdvanced {

    private String name;
    private String wantStation;
    private int currentRadioNumber;
    private int maxRadioNumber = 10;
    private int minRadioNumber = 0;
    private int currentVolumeLevel;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;

    public RadioAdvanced(int maxRadioNumber) {
        this.maxRadioNumber = maxRadioNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWantStation() {
        return wantStation;
    }

    public void setWantStation(String wantStation) {
        this.wantStation = wantStation;
    }

    public int getMaxRadioNumber() {
        return maxRadioNumber;
    }

    public void setMaxRadioNumber(int maxRadioNumber) {
        this.maxRadioNumber = maxRadioNumber;
    }

    public int getMinRadioNumber() {
        return minRadioNumber;
    }

    public void setMinRadioNumber(int minRadioNumber) {
        this.minRadioNumber = minRadioNumber;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber > maxRadioNumber) {
            return;
        }
        if (currentRadioNumber < minRadioNumber) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }

    public int radioNumberOneStepUp() {
        if (currentRadioNumber >= maxRadioNumber) {
            currentRadioNumber = minRadioNumber;
            return minRadioNumber;
        }
        currentRadioNumber++;
        return currentRadioNumber;
    }

    public int radioNumberOneStepDown() {
        if (currentRadioNumber <= minRadioNumber) {
            currentRadioNumber = maxRadioNumber;
            return maxRadioNumber;
        }
        currentRadioNumber--;
        return currentRadioNumber;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        this.maxVolumeLevel = maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public void setMinVolumeLevel(int minVolumeLevel) {
        this.minVolumeLevel = minVolumeLevel;

    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {

        if (currentVolumeLevel > maxVolumeLevel) {
            return;
        }
        if (currentVolumeLevel < minVolumeLevel) {
            return;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public void volumeOneStepUp() {
        if (currentVolumeLevel >= maxVolumeLevel) {
            return;
        }
        currentVolumeLevel++;
    }


    public void volumeOneStepDown() {
        if (currentVolumeLevel <= minVolumeLevel) {
            return;
        }
        currentVolumeLevel--;
    }
}

