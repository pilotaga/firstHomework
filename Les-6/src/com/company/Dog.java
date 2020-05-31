package com.company;

import com.company.Animal;

public class Dog extends SwimmingAnimal {

    public Dog(String name) {
        super.name = name;
        runLimit = 500;
        swimLimit = 10;
        jumpLimit = 0.5;
    }

    public Dog(String name, double runLimit, double swimLimit, double jumpLimit){
        super.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(double distance) {
        if (distance <= runLimit) {
            System.out.printf("Dog %s is running %.1f meters", this.name, distance);
            System.out.println();
        } else {
            System.out.println("Dog can't run. Running limit for dog is " + runLimit);
        }
    }

    @Override
    public void swim(double distance) {
        if (distance <= swimLimit) {
            System.out.printf("Dog %s is swimming %.1f meters", this.name, distance);
            System.out.println();
        } else {
            System.out.println("Dog can't swim. Swimming limit for dog is " + swimLimit);
        }
    }

    @Override
    public void jump(double height) {
        if (height <= jumpLimit) {
            System.out.printf("Dog %s is jumping to %.1f meters", this.name, height);
            System.out.println();
        } else {
            System.out.println("Dog can't jump. Jumping limit for dog is " + jumpLimit);
        }
    }
}
