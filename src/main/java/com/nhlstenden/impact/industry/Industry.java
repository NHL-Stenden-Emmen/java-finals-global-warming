package com.nhlstenden.impact.industry;

import com.nhlstenden.impact.Emission;

public class Industry extends Emission
{
    public Industry(int NO3Emission, int CO2Emission)
    {
        super(NO3Emission, CO2Emission);
    }

    @Override
    public String getProblemDescription()
    {
        return "They emit nasty waste into the ocean and air.";
    }

    @Override
    public int getImpact()
    {
        return 30;
    }
}
