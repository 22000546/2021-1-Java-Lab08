package edu.handong.csee.java.hw2.converters;

/**
 * This is TONToGConverter class
 * You can convert tons into grams
 */
public class TONToGConverter implements Convertible {
    
    private double tons;
    private double grams;

    /**
     * This method sets ton value
     */
    public void setFromValue(double fromValue) {
        tons = fromValue;
    }
    
    /**
     * This method returns gram value
     */
    public double getConvertedValue() {
        return grams;
    }
    
    /**
     * This method converts ton value into gram value
     */
    public void convert() {
        grams = tons / 1000000.0;
    }

}
