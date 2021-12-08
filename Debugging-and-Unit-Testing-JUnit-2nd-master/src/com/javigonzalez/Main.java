package com.javigonzalez;

public class Main {

    public static void main(String[] args) {
        Utilities util = new Utilities();
        util.removePairs("AABCDDEFF");
        char[] chAr= {'A','B','C','D'};
        char[] newChar = util.everyNthChar(chAr,4);
            System.out.println(newChar);
        int a= util.converter(5, 5);
            System.out.println(a);
        int b= util.converter2(6, 7);
            System.out.println(b);
        String string = util.nullIfOddLength("Java");
            System.out.println(string);
        String stringOdd = util.nullIfOddLength("JavierJGG");
        System.out.println("The length String JavierJGG is Odd, so nullIfOddLength returns: " + stringOdd);


    }
}
