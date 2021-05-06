package edu.handong.csee.java.hw2.converters;

/**
 * This is KMToMConverter class
 * You can convert kilometer value into meter value
 */
public class KMToMConverter implements Convertible {

    private double kilometers;
    private double meters;


    /**
     * This method sets kilometer value
     */
    public void setFromValue(double fromValue) {
        kilometers = fromValue;
    }
    
    /**
     * This method returns meter value
     */
    public double getConvertedValue() {
        return meters;
    }
    
    /**
     * This method converts kilometer value into meter value
     */
    public void convert() {
        meters = kilometers * 1000.0;
    }

}