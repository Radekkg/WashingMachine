package org.radoslaw;

public class WashingMachine implements Washable {

    private int programNumber;
    private int delay;
    private double temperature;
    private int spine;



    @Override
    public void setProgram(int programNumber) {
        this.programNumber=programNumber;
    }

    @Override
    public int getProgram() {
        return this.programNumber;
    }

    @Override
    public void nextProgram() {
        setProgram(getProgram()+1);
    }

    @Override
    public void previousProgram() {
        setProgram(getProgram()-1);
    }

    @Override
    public void increaseTemp() {
        setTemperature(getTemperature()+1);
    }

    @Override
    public void decreaseTemp() {
        setTemperature(getTemperature()-1);
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public void setSpine(int spine) {
        this.spine = spine;
    }

    @Override
    public int getSpine() {
        return this.spine;
    }

    @Override
    public void increaseSpine() {
        setSpine(getSpine()+1);
    }

    @Override
    public void decreaseSpine() {
        setSpine(getSpine()-1);
    }

    @Override
    public void showStatus() {

    }

    @Override
    public void setDelay(int hours) {
        this.delay = hours;
    }

    @Override
    public int getDelay() {
        return delay;
    }

    @Override
    public void increaseDelay() {
        setDelay(getDelay()+1);
    }

    @Override
    public void decreaseDelay() {
        setDelay(getDelay()-1);
    }
}
