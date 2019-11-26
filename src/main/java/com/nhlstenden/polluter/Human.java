package com.nhlstenden.polluter;

import com.nhlstenden.impact.Problem;
import com.nhlstenden.polluter.Polluter;

import java.util.ArrayList;

public class Human implements Polluter
{
    private ArrayList<Problem> problems;

    public Human()
    {
        this.problems = new ArrayList<>();
    }
}
