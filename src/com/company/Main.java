package com.company;

public class Main {

    public static String myVar = "Static Variable"; // Static Variables

    public static void main(String[] args) {
	// write your code here
    // Simple JAVA program

        System.out.println("Hello World !");

     // Variables

     int a=10;
     float b = (float) 10.9;
     String str = "Hello";

     Main obj = new Main(); // Creation of object

        obj.myVar = "Value changed";   // Changing the value in static variables
        System.out.println(obj.myVar); // printing the value in static variable

     // Primitive Data Types

     byte num = 1; //  values between -128 to 127 - 1 byte
     short num1 = (short) 45678; // range -32,768 to 32,767 - 2 bytes
     int   num2 = 21478612; // wide range of values - 4 bytes
     long  num3 = 1234567892334l; // long range of values - 8 bytes

     double num4 = 4289766.9; // can hold 15 decimal digits - 8 bytes
     float num5 = 19.897f; // can hold 6 decimal digits - 4 bytes

     boolean boo = true; // true or false
     String str1 = "Hello"; // string values

     // Arithmetic Operators

        System.out.println("Add : num + num1 = "+ (num + num1)); // addition
        System.out.println("Subtract : num1 - num = "+ (num1 - num)); //subtraction
        System.out.println("Multiply : num * num1 = "+ (num * num1)); // Multiply
        System.out.println("Division : num1 / num = "+ (num1 / num)); // division
        System.out.println("Modulo : num1 % num = "+ (num1 % num)); // modulo

     // Assignment Operators

        num += num1; // add the value of num and num1 then assigns the added value in num
        System.out.println("+= : " + num);

     // Auto-increment and decrement Operators

        num++; // auto-increment of value in the variable num
        System.out.println("num++ :" +num);
        num--;
        System.out.println("num-- :" + num);

     // logical operators

        boolean b1,b2;
        b1 = true; b2 = false;
        System.out.println(" b1 && b2 :" + (b1 && b2)); // AND - returns true if b1 and b2 are true else false
        System.out.println(" b1 || b2 :" + (b1 || b2)); // OR - returns true if b1 or br is true else false
        System.out.println(" !(b1 && b2) :" + !(b1 && b2)); // NOT - returns true if b1 is false else true

      // Ternary Operators

        num = (byte) ((num1 > 10) ? 100 : 200);
        System.out.println("ternary num : " + num );

    }
}
