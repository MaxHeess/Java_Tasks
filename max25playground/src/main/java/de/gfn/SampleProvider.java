package de.gfn;

public interface SampleProvider {
    public abstract String getType();
}

abstract class DruckSensor implements  SampleProvider {
    @Override
    public String getType() {

    }
}