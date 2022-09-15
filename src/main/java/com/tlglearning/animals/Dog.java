/*class defines dog and extends wolf */

package com.tlglearning.animals;

public class Dog extends Wolf{
    //field


    //b methods
    @Override
    void vocalize() {
        System.out.println("Bark like a dog!");
    }

    @Override
    void hunt() {
        System.out.println("Hunt for toys");
    }

    static void whoAmI() {
        System.out.println("I am a dog");
    }

    void rollOver() {
        System.out.println("I'm rolling over! I'm the best dog!");
    }

    //get & set
}
