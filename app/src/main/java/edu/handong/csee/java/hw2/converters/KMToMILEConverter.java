package edu.handong.csee.java.hw2.converters;

/**
 * This is KMToMILEConverter class
 * You can convert kilometers into miles
 */
public class KMToMILEConverter implements Convertible {
    
    private double kilometers;
    private double miles;

    /**
     * This method sets kilometer value
     */
    public void setFromValue(double fromValue) {
        kilometers = fromValue;
    }
    
    /**
     * This method returns mile value
     */
    public double getConvertedValue() {
        return miles;
    }
    
    /**
     * This method converts kilometer value into mile value
     */
    public void convert() {
        miles = kilometers / (float)1.6;
    }

}
