package edu.handong.csee.java.hw2.converters;

/**
 * This is Convertible interface for converter
 */
public interface Convertible {

    /**
     * This method is for setting input value
     * @param fromValue This is input value for convert
     */
    public void setFromValue(double fromValue);

    /**
     * This method is for getting output value
     * @return This is converted value
     */
    public double getConvertedValue();

    /**
     * This method is for converting
     */
    public void convert();

}