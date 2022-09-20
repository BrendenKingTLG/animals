/* class defines animal wolf */

package com.tlglearning.animals;

public class Wolf {
    //field
    private static final int MY_CONSTANT = initializedValue();
    private int data = initData();

    static {
        System.out.println("wolf static init block");
    }

    {
        System.out.println("wolf inst init block");
    }

    public Wolf() {
        System.out.println("wolf ctor");
    }

    //b methods
    private static int initializedValue() {
        System.out.println("Wolf.init block");
        return -1;
    }

    private int initData() {
        System.out.println("wolf.initData");
        return 1;
    }

    public void vocalize() {
        System.out.println("Howl like a wolf!");
    }

    public void hunt() {
        System.out.println("Hunt in packs for live prey");
    }

    public static void whoAmI() {
        System.out.println("I am a wolf!");
    }

    //get & set

}
