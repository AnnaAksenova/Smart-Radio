package ru.netology;

public class RadioAdvanced {

   private String name;
   private String wantStation;
   private int currentRadioNumber;
   private int maxRadioNumber = 9;
   private int minRadioNumber = 0;
   private int currentVolumeLevel;
   private int maxVolumeLevel = 10;
   private int minVolumeLevel = 0;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWantStation(){
            return wantStation;
        }

        public void setWantStation(String wantStation){
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

        public int setCurrentRadioNumber(int currentRadioNumber) {
            if (currentRadioNumber > maxRadioNumber) {
                return currentRadioNumber;
            }
            if (currentRadioNumber < minRadioNumber) {
                return currentRadioNumber;
            }
            this.currentRadioNumber = currentRadioNumber;
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

    }

