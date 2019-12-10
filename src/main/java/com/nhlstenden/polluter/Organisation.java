package com.nhlstenden.polluter;

import com.nhlstenden.polluter.Polluter;

import java.util.ArrayList;

public class Organisation implements Polluter
{
    private ArrayList<Human> humans;

    public Organisation()
    {
        this.humans = new ArrayList<>();
    }

    @Override
    public int getCO2Usage()
    {
        return 0; // Based on problems of the humans
    }

    @Override
    public int getNO3Usage()
    {
        return 0; // Based on problems of the humans
    }
}
