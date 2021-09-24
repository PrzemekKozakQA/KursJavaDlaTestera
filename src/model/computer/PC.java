package model.computer;

public class PC extends Computer {
    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public int volumeUp() {
        volumeLevel += 1;
        if ((volumeLevel > 100)) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if ((volumeLevel < 0)) {
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
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("No power supply detected!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    public void setPowerSupply(boolean supplyOfPower) {
        isPowerSupply = supplyOfPower;
    }

}

