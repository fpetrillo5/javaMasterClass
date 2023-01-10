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

        /*why is the double a better choice in most circumstances
        its actually to process faster on many modern computers.
            that is because computers have, at the chip level, the functionality
            to deal with these double numbers faster than the equivalent float.

            second, the java libraries that we will get into later in the course,
            particularly the math functions, are often written to process doubles
            and not floats, to return the result as a double

            java selected the double because it is more precise, and it can handle
            a larger range of numbers.
         */
        double lbs = 225;
        double lbsToKG = .45359237;
        double conKG = lbs*lbsToKG;
        System.out.println(conKG);

        /*floating point number precision tips
        in general, float and double are great for general floating point operations.
        but neither should be used when precise calculations are required - this is
        due to a limitation with how floating point numbers are stored, and not a
        java problem.

        java has a class called BigDecimal that overcomes this
         */

        //class 23 - the char and boolean primitive data types

        /*char data type
        a char occupies 2 bytes of memory, or 16 bits and thus has a width of 16

        unicode
        unicode is an international encoding standard for use with different languages
        and scripts by which each letter, digit, or symbol is assigned a unique
        numeric value that applies across different platforms and programs
         */

        char myChar = 'D';
        System.out.println(myChar);

        char myUnicode = '\u0044';
        System.out.println(myChar);

        char myDecimalCode = 68;
        System.out.println(myChar);

        /*3 ways to assign a value to a char
        1) literal character char myChar = 'D';
        2) unicode value char myChar = '\u0044';
        3) integer value = char myChar = 68;
         */

        char mySimpleChar = '?';
        System.out.println(mySimpleChar);

        char myUnicodeChar = '\u003F';
        System.out.println(myUnicodeChar);

        char myDecimalChar = 63;
        System.out.println(myDecimalChar);

        boolean myTrueBooleanValue = true;
        System.out.println(myTrueBooleanValue);

        boolean myFalseBooleanValue = false;
        System.out.println(myFalseBooleanValue);

        //class 24 - primitive type recap and string data type

        /*java's primittives'
            boolean, byte, char, double, float, short, int, long

            java's built in classes
                wrappers(Boolean, Byte, Character, etc), Big Decimal, String

            Your classes

            Somebody's else's classes
         */
        //what is a sting: a string is a class that contains a sequence of characters

        String myString = "This is a string";
        System.out.println(" myString is equal to " +myString);

         myString = myString +" this is a string and this is more ";
        System.out.println(myString);

        myString =  "I wish I had \u00241,000,000,000.00";
        System.out.println(myString);

        String lastString =  "10";
        myInt = 50;
        System.out.println(lastString+myInt);
        System.out.println(lastString);

        /*string vs StringBuilder
            the string class is immutable, but can be used much like a primitive
            data type

            the StringBuilder class is mutable, but does not share the String's
            special features, such as being able to assign it a String literal or
            use + operator on it
         */

        //class 25 - operators, operands and expressions

        /* operators in java are special symbols that perform specific operations
        on one, two, or operands, and then return a result

        what is an operand
            an operand is a term used to describe any object that is manipulated
            by an operator
         */

        char firstChar = 'A'; char secondChar = 'B';

        System.out.println(firstChar + secondChar);

        /* the + operator on char
        you might remember that we said chars are stored as 2 byte numbers in memory
        when you use the plus operator with chars, it is these numbers in memory
        that get added together.
        The character values dont get concatenated

        01000001 + 01000010 = 010000011
        65 + 66 = 131

        the unicode values of 65 and 66 get added together

        to get them to concatenate, we have to use a string. i am starting with
        2 double quotes, this is called an empty string, and is a valid string.
        we next use the plus on that string. any plus after a string is going
        to be a concatenation operator
         */

        System.out.println("" + firstChar + secondChar);

        //its important to understand the char and the string dont treat the
        // plus sign the same

        //class 26 - Abbreviating Operators

        /* why do we want to use multiple statements in curly braces {}?
            1) its a way to group statements together before executing them
            it allows us to put statements on multiple lines is more natural
            and readable
            we can execute the group of statements as a whole, which more
            closely resembles running code in java
         */

        /*
        postfix operator result++;
        compound assignment operator result +=1;
         */

        int result = 1;
        result = result + 1;
        System.out.println(result);

        result = 1;
        result++;
        System.out.println(result);

        result = 1;
        result--;
        System.out.println(result);

        result = 1;
        result-=1;
        System.out.println(result);

        result = 1;
        result+=5;
        System.out.println(result);

        result = 10;
        result-=5.5;
        System.out.println(result);
        //result is 4 not 4.5 or error

       // result = 10;
        //result = result - 5.5;
        //System.out.println(result);
        //this throws an error but not the compound operator, tells us to cast

        /*the compound operator x -= y is often said to be x=x-y but that is
        not entirely true if y is not the same data type as x.
        x -= y is really x = (data type of x) (x-y). An implicit cast is done
        when using the compound operator, so no errors occurs,
        but unexpected results may occur

        so result -= 5.5;
        is really
        result = (int) (result - 5.5);
         */






















    }
}