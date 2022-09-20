/*class defines dog and extends wolf */

package com.tlglearning.animals;

public class Dog extends Wolf{
    //field
    static {
        System.out.println("dog init block");
    }

    private static int initializeValue() {
        System.out.println("dog.init-val");
        return -2;
    }

    private static final int MY_CONSTANT = initializeValue();

    private int initData() {
        System.out.println("dog.initData");
        return 2;
    }

    public Dog() {
        System.out.println("dog ctor");
    }

    {
        System.out.println("dog inst init block");
    }

    private int data = initData();

    {
        System.out.println("2nd dog init block");
    }

    //b methods
    @Override
    public void vocalize() {
        System.out.println("Bark like a dog!");
    }

    @Override
    public void hunt() {
        System.out.println("Hunt for toys");
    }

    public static void whoAmI() {
        System.out.println("I am a dog");
    }

    public void rollOver() {
        System.out.println("I'm rolling over! I'm the best dog!");
    }

    //get & set
}
