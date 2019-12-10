package com.nhlstenden.impact;

import com.nhlstenden.impact.Emission;

public class GreyEnergy extends Emission
{
    public GreyEnergy(int NO3Emission, int CO2Emission)
    {
        super(NO3Emission, CO2Emission);
    }

    @Override
    public String getProblemDescription()
    {
        return "Produces CO2. Makes people sick.";
    }

    @Override
    public int getImpact()
    {
        return 5;
    }
}
