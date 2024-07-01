package org.lessons.java.ciclabile;

import java.util.Arrays;

public class CyclingNumber {
    private int[] number;
    private int i;

    // constructor without parameters
    public CyclingNumber() {
        this.number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        this.i = 0;
    }

    // constructor with parameters
    public CyclingNumber(int[] number) {
        this.number = number;
        this.i = 0;
    }

    // add element to the array
    public void addElement(int a) {
        int[] copy = new int[number.length + 1];
        System.arraycopy(number, 0, copy, 0, number.length);
        copy[number.length] = a;
        this.number = copy;
    }

    // check if there are elements left
    public boolean hasElementsLeft() {
        return i < number.length;
    }

    // get next element
    public void getNextElement() {
        if (hasElementsLeft()) {
            System.out.println(number[i++]);
        } else {
            System.out.println("There are no elements left");
        }
    }

    public static void main(String[] args) {

        //test constructor with parameters
        CyclingNumber cyclingNumber = new CyclingNumber(new int[]{1, 2, 3, 4, 5});

        //test both method hasElementsLeft() and getNextElement()
        //until end of the array
        cyclingNumber.getNextElement();
        System.out.println(cyclingNumber.hasElementsLeft());
        cyclingNumber.getNextElement();
        System.out.println(cyclingNumber.hasElementsLeft());
        cyclingNumber.getNextElement();
        System.out.println(cyclingNumber.hasElementsLeft());
        cyclingNumber.getNextElement();
        System.out.println(cyclingNumber.hasElementsLeft());
        cyclingNumber.getNextElement();
        System.out.println(cyclingNumber.hasElementsLeft());
        cyclingNumber.getNextElement();

        //test addElement
        int a = 24;
        cyclingNumber.addElement(a);
        System.out.println(cyclingNumber.number[cyclingNumber.number.length - 1]);

        //test constructor without parameters
        //and test both method hasElementsLeft() and getNextElement()
        //on the new created array
        CyclingNumber cyclingNumber2 = new CyclingNumber();
        cyclingNumber2.getNextElement();
        System.out.println(cyclingNumber2.hasElementsLeft());
        System.out.println(Arrays.toString(cyclingNumber2.number));
    }
}