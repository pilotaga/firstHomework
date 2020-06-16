package com.company;

public class Main {

    public static void main(String[] args) {
        runAnimalApp();
    }

    static void runAnimalApp(){
        Cat cat = new Cat("Murzik");
        cat.jump(1);
        cat.run(150);

        Dog dog = new Dog("Tuzik");
        dog.jump(1);
        dog.swim(5);
        dog.run(250);

        Dog dog1 = new Dog("Jack", 1000, 500, 3);
        dog1.jump(3);
        dog1.swim(450);
        dog1.run(1200);
    }
}
