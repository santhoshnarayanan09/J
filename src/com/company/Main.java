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

      // Control Statements and relational Operators

        // If Statement

        if(num < num1) // Condition greater than
        {
            System.out.println("num is greater than num1"); // Statement
        }

        // Nested if

        if (num < num1)
        {
            if (num1 > num) // Condition less than
            {
                System.out.println("num1 is greater");
            }
        }

       // If else

       if(num == num1) // Condition values are equal to
       {
           System.out.println("num and num 1 are equal");
       }
       else {
           System.out.println("num and num1 are not equal");
       }

       //if-else-if

        if(num1 >= num ) // Condition greater than or equal to
        {
            System.out.println("num1 is greater");
        }
        else if (num < 100 && num >= 10)
        {
            System.out.println("num is a two digit number");
        }
        else if (num != 0) // condition not equal to zero
        {
            System.out.println("num is a non-zero value");
        }
        else
        {
            System.out.println("value of num :" + num);
        }

        // Switch case

        switch (a + 10)
        {
            case 1:
                System.out.println("Value of a :" + a);
            case 2:
                System.out.println("value of a : " + a);
            default:
                System.out.println("Case");
        }

        // for loop

        for (int j = 1; j < 10; j++){

            System.out.println("value of i ;" + j);
        }

        //foreach to iterate in array

        int arr[] = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        // Enhanced for loop

        for (int i : arr){
            System.out.println(i);
        }

        // while
        int i = 1;
        while (i < 10)
        {
            System.out.println("while");
            i++;
        }
        // do while

        do{
            System.out.println("do..while");
            i=100;
        }while (i < 10);


    }
}
