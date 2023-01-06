public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        myFirstNumber =10;
        System.out.println(myFirstNumber);

        myFirstNumber =1000;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        System.out.println(mySecondNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        myThirdNumber = myFirstNumber * 2;
        System.out.println(myThirdNumber);

        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int myValue =10000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);

        System.out.println("Integer Value Range(" + myMinIntValue + " to " + myMaxIntValue +")");

        System.out.println("Byte Value Range(" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE +")");

        System.out.println("Short Value Range(" + Short.MIN_VALUE + " to " + Short.MAX_VALUE +")");

        System.out.println(Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Long.SIZE);

        System.out.println("Long Value Range(" + Long.MIN_VALUE + " to " + Long.MAX_VALUE +")");

        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println(myMinByteValue);

        byte newByte = (byte) (myMinByteValue *  40);
        System.out.println(newByte);

        //his advice is always use an int unless you have a really good reason

        // class 19 - Primitive Types challange

        byte myByte = 45;
        short myShort = 34;
        int myInt = 50909;

        long myLong = (50000L + 10L* (myByte + myShort +myInt));
        System.out.println(myLong);

        short shortTotal = (short)(50000 + 10 * (myByte + myShort +myInt));
        System.out.println(shortTotal);

        // class 21 floats and double primitives

        System.out.println("float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE +")");
        System.out.println("double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE +")");

        float myFloat = 5.25F;
        System.out.println(myFloat);

        /*Certification exam pointer
        not everyone realizes that java's default data type for a decimal literal is
        a double, which is larger and more precise than a float.
        Java likes to put a similar line of code in its code segments on exam questions,
        to that we saw earlier, omitting that 'f' suffix. Without your compiler of ide, this
        statement can look fairly innocuous.
            float myOtherfloatValue = 5.25;
         the number 5.25 is a double, so assigning it to a float will raise an error
         This is a gift question to an exam taker, if you can easily spot this
         compiler error.
         */

        //class 22 - floating point precision and a challenge

        myInt = 5; myFloat =5f; double myDouble = 5d;
        System.out.println("myInt = " + myInt + " myFloat = " + myFloat + " myDounble = " + myDouble);

        //you can also use java scientific notation
        double sciNotation = 5e1;
        System.out.println(sciNotation);

//        sciNotation = 5e1;
//        System.out.println(sciNotation);

        myInt = 5/2;
        System.out.println(myInt);

        myFloat = 5f/2f;
        System.out.println(myFloat);

        myDouble = 5d/2d;
        System.out.println(myDouble);

        myInt = 5/3;
        System.out.println(myInt);

        //floats print out 7 decimals in the output
        myFloat = 5f/3f;
        System.out.println(myFloat);

        //double print out 16 decimals in the output
        myDouble = 5d/3d;
        System.out.println(myDouble);

        /*for the float, the number stored in memory is actually more precise
        than that shown but the output stops at 7 decimals. the same is true
        for a double.
         */

        //dont need the d sufffix, because java will automatically look at a
        //decimal number and assume its a double.
        myDouble = 5.00/3.00;
        System.out.println(myDouble);

        //as long as one of the operands is a double, your result will be a double
        myDouble = 5.00/3;
        System.out.println(myDouble);

        /*myFloat = 5.00/3f;
        this wont work on a float. even though one of the literals is float,
        (3 with f suffix), the other literal is a double 5.0 and the result and
        you cannot assign a double to a float variable
         */










    }
}