package com.nhlstenden.impact.transportation;

import com.nhlstenden.impact.Emission;

public abstract class Transportation extends Emission
{
    public Transportation(int NO3Emission, int CO2Emission)
    {
        super(NO3Emission, CO2Emission);
    }
}
