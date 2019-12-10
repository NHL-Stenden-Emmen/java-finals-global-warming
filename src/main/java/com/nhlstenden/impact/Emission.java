package com.nhlstenden.impact;

public abstract class Emission implements Problem
{
    protected int NO3Emission;
    protected int CO2Emission;

    public Emission(int NO3Emission, int CO2Emission)
    {
        this.NO3Emission = NO3Emission;
        this.CO2Emission = CO2Emission;
    }

    public int getNO3Emission()
    {
        return NO3Emission;
    }

    public void setNO3Emission(int NO3Emission)
    {
        this.NO3Emission = NO3Emission;
    }

    public int getCO2Emission()
    {
        return CO2Emission;
    }

    public void setCO2Emission(int CO2Emission)
    {
        this.CO2Emission = CO2Emission;
    }
}
