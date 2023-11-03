package org.radoslaw;

public interface Washable {
    void setProgram(int programNumber);
    int getProgram();
    void nextProgram();
    void previousProgram();
    void increaseTemp();
    void decreaseTemp();
    void setTemperature(double temperature);
    double getTemperature();
    void setSpine(int spine);
    int getSpine();
    void increaseSpine();
    void decreaseSpine();
    void showStatus();
    void setDelay(int hours);
    int getDelay();
    void increaseDelay();
    void decreaseDelay();
}
