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




    }
}