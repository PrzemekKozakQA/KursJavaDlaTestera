package model.computer;

public class Laptop extends Computer {
    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int volumeUp() {
        volumeLevel += 5;
        if (volumeLevel > 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int volumeChange) {
        volumeLevel += volumeChange;
        if (volumeLevel > 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int volumeChange) {
        volumeLevel -= volumeChange;
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

}
