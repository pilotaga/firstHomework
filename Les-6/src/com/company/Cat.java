package com.company;

public class Cat extends Animal {


    public Cat(String name) {
        super.name = name;
        runLimit = 200;
        jumpLimit = 2;
    }

    public Cat(String name, double runLimit, double swimLimit, double jumpLimit){
        super.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(double distance) {
        if (distance <= runLimit) {
            System.out.printf("Cat %s is running %.1f meters", this.name, distance);
            System.out.println();
        } else {
            System.out.println("Cat can't run. Running limit for cat is " + runLimit);
        }
    }

    @Override
    public void jump(double height) {
        if (height <= jumpLimit) {
            System.out.printf("Cat %s is jumping to %.1f meters", this.name, height);
            System.out.println();
        } else {
            System.out.println("Cat can't jump. Jumping limit for cat is " + jumpLimit);
        }
    }
}
