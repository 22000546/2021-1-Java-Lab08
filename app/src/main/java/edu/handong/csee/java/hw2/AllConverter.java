package edu.handong.csee.java.hw2;

/**
 * This is AllConverter class
 * You can convert specific value into all available type
 */
public class AllConverter {

    private double fromValue;
    private String originalMeasure;
    private double kilometers;
    private double meters;
    private double miles;
    private double tons;
    private double kilograms;
    private double grams;
    
    /**
     * This method sets input value
     * @param fromValue This is input value for convert
     * @return This return 'this', making method chaining
     */
    public AllConverter setFromValue(double fromValue) {
        this.fromValue = fromValue;
        return this;
    }

    /**
     * This method sets original measure
     * @param originalMeasure This is input measure for convert
     * @return This return 'this', making method chaining
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * This method converts value and print results
     * @return This return 'this', making method chaining
     */
    public AllConverter convertAndPrintOut() {
        if(originalMeasure.equals("KM")) {
            kilometers = fromValue;
            meters = kilometers * 1000.0;
            miles = kilometers / 1.6;
            System.out.println(fromValue +" KM to " + meters + " M");
            System.out.println(fromValue +" KM to " + miles + " MILE");

        } else if(originalMeasure.equals("TON")) {
            tons = fromValue;
            kilograms = tons * 1000.0;
            grams = tons * 1000000.0;
            System.out.println(fromValue + " TON to " + kilograms + " KG");
            System.out.println(fromValue + " TON to " + grams + " G");

        } else {
            System.out.println("AllConverter cannot support the measure!");
        }

        return this;

    }
    
}
