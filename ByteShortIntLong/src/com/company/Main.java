package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short theShort = 28;
        int mrInt = 216;
        short coolShort = (short) (1000 + 10*(myByte + theShort + mrInt));
        System.out.println(coolShort);

    }
}
