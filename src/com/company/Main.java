package com.company;

import com.company.urzadzenie.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Vitalii";
        me.lastName = "Sumka";
        me.pet = new Animal("dog");
        me.pet.name = "Borri";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();

        System.out.println("pesek");

        Car dirtyOne = new Car();
        dirtyOne.producer = "opel";
        dirtyOne.model = "astra";
        dirtyOne.yearOfProduction = 2007;
        dirtyOne.setPlates ("GDA1111");

        me.setCar(dirtyOne);

        Human myWife = new Human();
        myWife.firstName = "Oksi";
        myWife.lastName = "Miron";
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.setCar(me.getCar());

        System.out.println(myWife.getCar().getPlates());


        System.out.println(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println((me));
        System.out.println(myWife);

        System.out.println(me.pet);

        myWife.feed();
        me.takeForAWalk();
        System.out.println(me.species);

    }
}
