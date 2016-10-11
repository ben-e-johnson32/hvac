package com.company;

import java.util.Date;

public class WaterHeater extends ServiceCall
{
    // Double for age and a double constant for the extra water heater fee.
    private double age;
    private static final double WH_FEE = 20.0;

    public WaterHeater(String serviceAddress, String problemDescription, Date reportedDate,
                       double age)
    {
        // Call the superclass, set the age.
        super(serviceAddress, problemDescription, reportedDate);
        this.age = age;
    }

    // Getter and setter for age.
    public void setAge(double newAge)
    {
        this.age = newAge;
    }

    public double getAge()
    {
        return this.age;
    }

    // Return a string with all the info about the service call.
    public String toString()
    {
        // Use some ? : operations, cool stuff. Basically one-line if/else variable assignment.
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String whFeeString = Double.toString(WH_FEE);
        String serviceFeeString = ( fee == UNRESOLVED ) ? "Unresolved" : Double.toString(fee);
        String totalFeeString = (fee == UNRESOLVED) ? "Unresolved" : Double.toString(fee + WH_FEE);
        String ageString = Double.toString(this.age);

        // Return the info as a string.
        return "Water Heater Service Call\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + ageString + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Water Heater Fee = " + whFeeString  + "\n" +
                "Service Fee = " + serviceFeeString + "\n" +
                "Total Fee = " + totalFeeString ;
    }
}
