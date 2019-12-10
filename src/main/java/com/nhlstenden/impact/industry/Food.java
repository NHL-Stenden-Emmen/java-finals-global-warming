package com.nhlstenden.impact.industry;

import com.nhlstenden.impact.Solution;

public class Food extends Industry implements Solution
{
    public Food(int NO3Emission, int CO2Emission)
    {
        super(NO3Emission, CO2Emission);
    }

    @Override
    public String getSolutionDescription()
    {
        return "Eat more plant based food. Leave the cows alone.";
    }
}
