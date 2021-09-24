package model.computer;

public abstract class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - set state to true");
        state = true;
    }

    public void switchOff() {
        System.out.println("Wyłączam kopmuter: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public abstract int volumeUp();

    public abstract int volumeDown();

    public abstract int volumeUp(int volumeChange);

    public abstract int volumeDown(int volumeChange);

}
