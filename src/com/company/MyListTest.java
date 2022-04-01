package com.company;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 5);
        myList.add(5, 2);
        myList.add(5);
//        myList.add(6, 4);
//        myList.add(7, 4);
//        myList.add(8, 4);
//        myList.add(9, 4);
//        myList.add(10, 4);
//        myList.add(11, 4);
//        System.out.println(myList.clone());
        System.out.println(myList.add(5));
        System.out.print(myList.get(0));
        System.out.print(myList.get(1));
        System.out.print(myList.get(2));
        System.out.print(myList.get(3));
//        System.out.print(myList.get(4));
//        System.out.print(myList.get(5));
//        System.out.print(myList.get(6));
//        System.out.print(myList.get(7));
//        System.out.print(myList.get(8));
//        System.out.print(myList.get(9));
//        System.out.print(myList.get(10));
//        System.out.print(myList.get(11));
//        System.out.print(myList.get(12));
        System.out.println("\n");
        myList.remove(2);
        System.out.println("Value index 2: " + myList.get(2));
        System.out.println("Value index 1: "+ myList.get(1));
//        System.out.println(myList.contains(1));

    }
}
