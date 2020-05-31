package com.company;

public abstract class Animal {
    protected String name;

    protected double runLimit;
    protected double jumpLimit;

    public abstract void run(double distance);
    public abstract void jump(double height);
}
