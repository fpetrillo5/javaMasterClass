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
    }

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

