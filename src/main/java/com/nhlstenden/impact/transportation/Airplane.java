package com.nhlstenden.impact.transportation;

import com.nhlstenden.impact.Solution;

public class Airplane extends Transportation implements Solution
{
    @Override
    public String getSolutionDescription()
    {
        return "Why would you fly with Ryan Air anyway?";
    }

    @Override
    public String getProblemDescription()
    {
        return "Produces CO2 in the air. And a lot of noise.";
    }

    @Override
    public int getImpact()
    {
        return 10;
    }
}
