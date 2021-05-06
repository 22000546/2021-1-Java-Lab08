package edu.handong.csee.java.hw2.converters;

/**
 * This is TONToKGConverter class
 * You can convert tons into kilograms
 */
public class TONToKGConverter implements Convertible {
    
    private double tons;
    private double kilograms;

    /**
     * This method sets ton value
     */
    public void setFromValue(double fromValue) {
        tons = fromValue;
    }
    
    /**
     * This method returns kilogram value
     */
    public double getConvertedValue() {
        return kilograms;
    }
    
    /**
     * This method converts ton value into kilogram value
     */
    public void convert() {
        kilograms = tons * 1000.0;
    }

}
