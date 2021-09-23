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
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("No power supply detected!");
        }
    }

    public void setPowerSupply(boolean supplyOfPower) {
        isPowerSupply = supplyOfPower;
    }
}
