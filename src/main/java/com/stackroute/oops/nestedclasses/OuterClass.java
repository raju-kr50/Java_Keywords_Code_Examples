package com.stackroute.oops.nestedclasses;

// Outer class having two variables and its method is called in main method of Main class
public class OuterClass {
    private static String name = "Raju";
    private static int age = 21;

    public void printOuterClass() {
        System.out.println("********************************************************************");
        System.out.println("This is a outer class print method");
    }

    // Inner class- Its method is called in main method in Main class
    public static class InnerClass {
       public void implement() {
            System.out.println("****************** Implementation of Inner Class ********************");
            System.out.println(OuterClass.name);
            System.out.println(OuterClass.age);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printOuterClass();

        OuterClass.InnerClass innerClass = new InnerClass();
        innerClass.implement();


    }
}
