public class SectionFiveMoreChallenges {

    public static void main(String[] args){
        System.out.println(convertToCentimeter(7));

    }

    public static double convertToCentimeter(int inches){
        double results = 0.00;
        return results = inches * 1.54;
    }

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
