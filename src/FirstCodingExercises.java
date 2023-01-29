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



        System.out.println(shouldWakeUp(true, 0));//false
        System.out.println(shouldWakeUp(false, 0));//false
        System.out.println(shouldWakeUp(true, -9));//false
        System.out.println( shouldWakeUp(true, 1));//true
        System.out.println(shouldWakeUp(false, 4));//false???
        System.out.println(shouldWakeUp(true, 8));//false
        System.out.println(shouldWakeUp(false, 8));//false
        System.out.println(shouldWakeUp(true, 12));//false
        System.out.println( shouldWakeUp(false, 20));//false
        System.out.println( shouldWakeUp(true, 22));//false
        System.out.println( shouldWakeUp(false, 22));//false
        System.out.println( shouldWakeUp(true, 23));//true
        System.out.println(shouldWakeUp(false, 23));//false
        System.out.println( shouldWakeUp(true, 24));//false
        System.out.println( shouldWakeUp(false, 24));//false
        System.out.println( shouldWakeUp(true, 28));//false
        System.out.println( shouldWakeUp(false, 254645));//false

        System.out.println( shouldWakeUp(true, 1));
        System.out.println( shouldWakeUp(false , 2));
        System.out.println( shouldWakeUp(true, 8));
        System.out.println( shouldWakeUp(true, -1));


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
    }

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

