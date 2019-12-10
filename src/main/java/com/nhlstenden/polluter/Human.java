package com.nhlstenden.polluter;

import com.nhlstenden.EmissionType;
import com.nhlstenden.impact.Emission;
import com.nhlstenden.impact.Problem;
import com.nhlstenden.impact.Solution;

import java.util.ArrayList;

public class Human implements Polluter
{
    private ArrayList<Problem> problems;
    private ArrayList<Solution> solutions;

    public Human()
    {
        this.problems = new ArrayList<>();
        this.solutions = new ArrayList<>();
    }

    public void addProblem(Problem problem)
    {
        this.problems.add(problem);
    }

    public void addSolution(Solution solution)
    {
        this.solutions.add(solution);
    }

    private int getEmissionForType(EmissionType emissionType)
    {
        int total = 0;

        for (Problem problem : this.problems)
        {
            // Check if my problem a (sub)class of Emission
            if (problem instanceof Emission)
            {
                switch (emissionType)
                {
                    case CO2:
                        total += ((Emission) problem).getCO2Emission();
                        break;
                    case NO3:
                        total += ((Emission) problem).getNO3Emission();
                        break;
                }
            }
        }

        return total;
    }

    @Override
    public int getCO2Usage()
    {
        return this.getEmissionForType(EmissionType.CO2);
    }

    @Override
    public int getNO3Usage()
    {
        return this.getEmissionForType(EmissionType.NO3);
    }
}
