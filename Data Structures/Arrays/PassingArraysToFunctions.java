package Arrays;

import java.util.Arrays;

public class PassingArraysToFunctions {
    // Passing arrays vs. primitives to functions

    // Passing primitive as an argument
    static void doubleMoney(int money){
        money = money * 2;
    }

    static void doubleMoney(int[] money){
        for (int i = 0; i < money.length; i++) {
            money[i] = money[i] * 2;
        }
    }

    public static void main(String[] args) {
        int money = 211;
        int[] fund = {200,300,400};
        doubleMoney(money);
        doubleMoney(fund);
        System.out.println(money);
        System.out.println(Arrays.toString(fund));

    }
}
