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





    }
}