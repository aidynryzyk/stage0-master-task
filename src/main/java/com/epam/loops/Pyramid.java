package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; i++) {
            for (int k = 0; k < cathetusLength - i; k++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1 ; k--) {
                System.out.print(k);
            }
            for (int k = 2; k < i + 1 ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
