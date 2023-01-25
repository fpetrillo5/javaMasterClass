public class FirstCodingExercises {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
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
    }

