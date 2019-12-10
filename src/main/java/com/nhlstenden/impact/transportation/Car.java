package com.nhlstenden.impact.transportation;

import com.nhlstenden.impact.Solution;

public class Car extends Transportation implements Solution
{
    @Override
    public String getSolutionDescription()
    {
        return "Take your electric bike, or if you can, buy a Tesla... Or take the bus.";
    }

    @Override
    public String getProblemDescription()
    {
        return "Produce CO2. Making people lazy.";
    }

    @Override
    public int getImpact()
    {
        return 5;
    }
}
