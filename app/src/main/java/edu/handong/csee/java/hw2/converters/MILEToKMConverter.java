package edu.handong.csee.java.hw2.converters;

/**
 * This is MILEToKMConverter class
 * You can convert miles into kilometers
 */
public class MILEToKMConverter implements Convertible {
    
    private double miles;
    private double kilometers;

    /**
     * This method sets mile value
     */
    public void setFromValue(double fromValue) {
        miles = fromValue;
    }
    
    /**
     * This method returns kilometer value
     */
    public double getConvertedValue() {
        return kilometers;
    }
    
    /**
     * This method converts mile value into kilometer value
     */
    public void convert() {
        kilometers = 1.6 * miles;
    }

}
