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

}
