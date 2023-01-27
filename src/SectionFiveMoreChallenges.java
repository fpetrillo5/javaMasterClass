public class SectionFiveMoreChallenges {

    public static void main(String[] args){
        //System.out.println(convertToCentimeter(48));
        //matthew in cms

//        System.out.println("Your height in centimeters is: " + convertToCentimeter(5,8));
//        System.out.println("Your height in centimeters is: " + convertToCentimeter(0,68));
//        System.out.println("Your height in centimeters is: " + convertToCentimeter(-5,-8));
//        System.out.println("Your height in centimeters is: " + convertToCentimeter(5,4));
//        System.out.println("Your height in centimeters is: " + convertToCentimeter(4,0));
//        System.out.println("Your height in centimeters is: " + convertToCentimeter(4,2));

        System.out.println(getDurationString(60));
        System.out.println(getDurationString(-3));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(500));
        System.out.println(getDurationString(31556926));
        System.out.println(getDurationString(2592000));
        System.out.println(getDurationString(86400));
        System.out.println(getDurationString(437507495));




    }

    public static double convertToCentimeter(int inches){
        double results = 0.00;
        return results = inches * 2.54;
    }

    public static double convertToCentimeter(int feet, int inches){
       // double results = 0.0;
        return convertToCentimeter(feet*12) + convertToCentimeter(inches);
    }

    public static String getDurationString(int seconds){
        String results = "";
        //validate seconds is >0
        if(seconds <= 0){
            System.out.println("Please enter a value for seconds greater than 0 asshole");
            return results;
        } else {
            int minutes = 0;
            //convert the inputted seconds into minutes and remaining seconds
            minutes = seconds / 60;
            seconds = seconds % 60;

            //call the second method passing minutes and seconds and grab in string var
           results = getDurationString(minutes, seconds);

            //return formatted string
            return results;
        }
    }

    public static String getDurationString(int minutes, int seconds){
        String results = "";
        int hours = 0;
        String hrs = "";
        String mins = "";
        String secs = "";
        //validate minutes > 0
        if(minutes < 0){
            System.out.println("Why are you passing me minutes less than 0, something is broke");
            return results;
        } else if(seconds < 0){
            System.out.println("Why are you passing me seconds less than 0, something is broke");
            return results;
        } else if (seconds > 59) {
            // validate seconds >0 and < 60, might want to add greater than 60 seconds to the minutes var
            minutes = minutes + (seconds / 60);
            seconds = (seconds % 60);
        }
        //convert minutes into hours and remaining minutes
        hours = minutes / 60;
        minutes = minutes % 60;

        //convert hours minutes seconds to strings
        if (hours < 10){
           hrs = Integer.toString(hours);
           hrs = "0" + hrs;
        } else {
            hrs = Integer.toString(hours);
        }

        if (minutes < 10){
            mins = Integer.toString(minutes);
            mins = "0" + mins;
        } else {
            mins = Integer.toString(minutes);
        }

        if (seconds < 10){
            secs = Integer.toString(seconds);
            secs = "0" + secs;
        } else {
            secs = Integer.toString(seconds);
        }


        //return formatted string to 1st method 'XXh YYm ZZs'
        results = hrs + "h " + mins + "m " + secs + "s";

        return results;
    }

    /* seconds and minutes challenge
    we are going to create a method, that takes time, represented in seconds, as
    the parameter. Then we want to transform the seconds into hours.
    Next we will display the time in hours, with the remaining minutes and
    seconds, in a String. We will do this transformation in 2 steps, which
    allows us to use overloaded methods.

    We want to create 2 methods with the same name: getDurationString
    first method: has one parameter of type int, named seconds.
    second method: has 2 parameters, named minutes and seconds, both ints
    both methods return a String in format 'XXh YYm ZZs'
    The first method should in turn call the second method to return its results
    add validation - first method, seconds parameter should be >= 0
    2nd method, minutes parameter should be >=0, and the seconds parameter should
    be >= 0 and <= 59
    if either method is passed an invalid value, print out some type of meaningful
    message to user

     */

    /*overloaded method challenge instructions
    create 2 methods with same name: convertToCentimeter

    the first method has one parameter of type int, which represents the height
    in inches. you will convert inches to centimeters, in this method, and pass
    back the number of centimeters, as a double.

    the second method has 2 parameters of type int, one to represent height in
    feet, and one to represent the remaining height in inches. so if a person is
    5 for feet and 8 for inches would be passed to this method. this method will
    covert feet and inches to just inches, then call the first method, to get the
    number of centimeters, also returning the value as a double.

    both methods should return a real number or decimal value for total height in
    centimeters

    call both methods and print the results

    the conversion formula from inches to centimeters is 1 inch = 2.54 cm

    one foot = 12 inches
     */
}
