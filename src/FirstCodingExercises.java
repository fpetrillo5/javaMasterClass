public class FirstCodingExercises {
    public static void main(String[] args) {

//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(75.114);
//        printConversion(95.75);

//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-2500);
//        printMegaBytesAndKiloBytes(5000);
//        printMegaBytesAndKiloBytes(6500);



//        System.out.println(shouldWakeUp(true, 0));//false
//        System.out.println(shouldWakeUp(false, 0));//false
//        System.out.println(shouldWakeUp(true, -9));//false
//        System.out.println( shouldWakeUp(true, 1));//true
//        System.out.println(shouldWakeUp(false, 4));//false???
//        System.out.println(shouldWakeUp(true, 8));//false
//        System.out.println(shouldWakeUp(false, 8));//false
//        System.out.println(shouldWakeUp(true, 12));//false
//        System.out.println( shouldWakeUp(false, 20));//false
//        System.out.println( shouldWakeUp(true, 22));//false
//        System.out.println( shouldWakeUp(false, 22));//false
//        System.out.println( shouldWakeUp(true, 23));//true
//        System.out.println(shouldWakeUp(false, 23));//false
//        System.out.println( shouldWakeUp(true, 24));//false
//        System.out.println( shouldWakeUp(false, 24));//false
//        System.out.println( shouldWakeUp(true, 28));//false
//        System.out.println( shouldWakeUp(false, 254645));//false
//
//        System.out.println( shouldWakeUp(true, 1));
//        System.out.println( shouldWakeUp(false , 2));
//        System.out.println( shouldWakeUp(true, 8));
//        System.out.println( shouldWakeUp(true, -1));

        //isLeapYearDriver();
        //areEqualByThreeDecimalPlacesDriver();
        hasEqualSumDriver();



    }
            public static long toMilesPerHour(double kilometersPerHour){
                if(kilometersPerHour < 0){
                    return -1L;
                }
                else{
                    return Math.round(kilometersPerHour * .622);
                }
            }

            public static void printConversion(double kilometersPerHour){
                if(kilometersPerHour < 0)
                    System.out.println("Invalid Value");
                else{
                    //1.5 km/h = 1 mi/h
                    long convert = toMilesPerHour(kilometersPerHour);
                    System.out.println(kilometersPerHour + " km/h = " + convert + " mi/h");
                }
            }

            public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes +  " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
        }
            }

            public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(((hourOfDay >= 0 && hourOfDay < 8) && barking)|| ((hourOfDay > 22 && hourOfDay <24)) && barking)
            return true;
        else
            return false;

            }

            public static boolean isLeapYear(int year){

        if(!(year >= 1 && year <= 9999)) {
            System.out.println("The year needs to be larger than 0 and smaller than 10000");
            return false;
        }
        //if false divisible by 4, return false
       if(!(year % 4 == 0)){
           System.out.println("not a leap year, " + year + " not divisible by 4");
           return false;
       } else if(!(year % 100 == 0)){
           System.out.println("it is a leap year, " + year + " not divisible by 100");
           return true;
       } else if (year % 400 == 0){
           System.out.println("it is a leap year, " + year + " divisible by 400");
           return true;
       } else {
           System.out.println("not a leap year, " + year + " not divisible by 400");
           return false;
       }
            }

            public static void isLeapYearDriver(){
//                isLeapYear(1700); //false
//                isLeapYear(1800); //false
//                isLeapYear(1900); // false
//                isLeapYear(2100); //false
//                isLeapYear(2200); //false
//                isLeapYear(2300); //false
//                isLeapYear(2500);//false
//                isLeapYear(2600);//false
//                isLeapYear(1600); //true
//                isLeapYear(2000); //true
//                isLeapYear(2400); // true
//                isLeapYear(-1600); //false
//                isLeapYear(1600); //true
//                isLeapYear(2017); //false
//                isLeapYear(2023);//false
//                isLeapYear(34565645);//false
//                isLeapYear(2020);//true
                //isLeapYear(2600);//matthew test

            }

            public static void areEqualByThreeDecimalPlacesDriver(){
                areEqualByThreeDecimalPlaces(4, 3.000455); //false
                areEqualByThreeDecimalPlaces(-3.1756, -3.175); //true
                areEqualByThreeDecimalPlaces(3.175, 3.176); //false
                areEqualByThreeDecimalPlaces(3.0, 3.0); //true
                areEqualByThreeDecimalPlaces(-3.123, 3.123); //false

            }

            public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        //need to get both inputs to 3 digits. will try and multiply by 1000 and then cast to an int then compare the 2

                double originalNum1 = num1;
                double originalNum2 = num2;

                num1 *= 1000;
                num2 *= 1000;

                int num1Int = (int)num1 ;
                int num2Int = (int)num2 ;


                if(num1Int == num2Int){
                    System.out.println("num1: " + originalNum1 + " is equal to num2: " + originalNum2 +" (up to 3 decimal places).");
                    return true;
                } else {
                    System.out.println("num1: " +originalNum1 + " is not equal to num2: " + originalNum2 );
                    return false;
                }
            }

            public static void hasEqualSumDriver(){
                hasEqualSum(1,3, 4);//true
                hasEqualSum(1,1, 1);//false
                hasEqualSum(1,1, 2);//true
                hasEqualSum(1,-1, 0);//true

            }

            public static boolean hasEqualSum(int operand1, int operand2, int result){
                // add operand1 and operand2 together and put into sum variable
                // check sum and result if true
                // this seems to easy

                int sum = operand1 + operand2;

                if(sum == result){
                    System.out.println(operand1 + " plus " + operand2 + " equals "+ result);
                    return true;
                } else {
                    System.out.println(operand1 + " plus " + operand2 + " does not equal "+ result);
                    return false;
                }
            }
}
// Equal Sum Checker
/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

    hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

    hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

    hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0


NOTE: The hasEqualSum method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */

    //Decimal Comparator

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
EXAMPLES OF INPUT/OUTPUT:

    areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

    areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

    areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

    areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.



 */

    /*Leap Year Calculator

    Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.


To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step
2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.

Examples of input/output:

* isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

* isLeapYear(1600); → should return true since 1600 is a leap year

* isLeapYear(2017); → should return false since 2017 is not a leap year

* isLeapYear(2000);  → should return true because 2000 is a leap year

NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
     */

    /*
    Barking Dog

We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

Write a method shouldWakeUp that has 2 parameters.

1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.

Examples of input/output:

    shouldWakeUp (true, 1); → should return true

    shouldWakeUp (false, 2); → should return false since the dog is not barking.

    shouldWakeUp (true, 8); → should return false, since it's not before 8.

    shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.


TIP: Use the if else statement with multiple conditions.

NOTE: The shouldWakeUp method  needs to be defined as public static ​like we have been doing so far in the course.

NOTE: Do not add a  main method to solution code.
     */

    /*
    MegaBytes Converter

Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

EXAMPLE INPUT/OUTPUT

    printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"

    printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.

    printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"


TIP: Be extremely careful about spaces in the printed message.

TIP: Use the remainder operator

TIP: 1 MB = 1024 KB

NOTE: Do not set kilobytes parameter value inside your method.

NOTE: The solution will not be accepted if there are extra spaces.

NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
     */

/*
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".


EXAMPLE INPUT/OUTPUT

* printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"

* printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.

* printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"


TIP: Be extremely careful about spaces in the printed message.

TIP: Use the remainder operator

TIP: 1 MB = 1024 KB

NOTE: Do not set kilobytes parameter value inside your method.

NOTE: The solution will not be accepted if there are extra spaces.
NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static like we have been doing so far in the course.NOTE: Do not add a  main method to solution code.
 */

