public class SectionSix {
    public static void main(String[] args){
        /*we are just going to put driver methods in main from now on.
        The reason is every github repo should be == to a project in java/intellij.
        instead of cluttering github with a 100 different repos, i will just
        create a corresponding driver class to whatever method i want to run.
         */

        //class5657Driver();
        //class58Driver();
        class59Driver();




    }

    public static void class5657Driver(){
        //switchMethod (2);
        //switchMethod (21);
       // switchMethod (1);
       // switchMethod (5);
       // switchMethod (3);
       enhancedSwitch(3);
        //System.out.println(getQuarter("JULY"));
    }

    public static void switchMethod(int switchValue){
        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("actually it was " + switchValue);
                break;
            default:
                System.out.println("was not 1, 2,3,4,or 5");
                break;
        }
    }

    public static void enhancedSwitch(int switchValue){
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("actually it was " + switchValue);
            }
            default -> System.out.println("was not 1, 2,3,4,or 5");
        }
       // regular switch argument String month = "OCTOBER";
        // below is yield argument
        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            // 1)default -> "bad";
           // 2) default -> {
               // 2)String badResponse = month + " is bad";
                //2)return badResponse;
            //2)}
            default ->{
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    public static void class58Driver(){
        switchChallenge('C');
        switchChallenge('F');

    }

    public static void switchChallenge(char letter){
        switch(letter){
            case 'A':
                System.out.println(letter+ " is Able");
                break;
            case 'B':
                System.out.println(letter+ " is Bravo");
                break;
            case 'C':
                System.out.println(letter+ " is Charlie");
                break;
            case 'D':
                System.out.println(letter+ " is Dog");
                break;
            case 'E':
                System.out.println(letter+ " is Easy");
                break;
            default:
                System.out.println("the letter " + letter + " was not found");
                break;
        }
    }

    public static void class59Driver(){
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);




    }

    public static void printDayOfWeek(int day){
         String dayofWeek = switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6-> {yield "Saturday";}
             default -> {
                 {yield "Invalid Day";}
             }
        };
         if(day < 6){
             System.out.println(day + " is a " + dayofWeek);
         } else {
             System.out.println(day + " is an " + dayofWeek);
         }

    }
    public static void printWeekDay(int day){
        if (day == 0) {
            System.out.println(day + " is Sunday");
        } else if (day == 1) {
            System.out.println(day + " is Monday");
        } else if (day == 2) {
            System.out.println(day + " is Tuesday");
        } else if (day == 3) {
            System.out.println(day + " is Wednesday");
        } else if (day == 4) {
            System.out.println(day + " is Thursday");
        } else if (day == 5) {
            System.out.println(day + " is Friday");
        } else if (day == 6) {
            System.out.println(day + " is Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}


//class 57 - more switch statement

/*
enhanced switch
no breaks, no colons. dont have to worry about fall through.
replace multiple case labels with comma delimited values.

traditional switch before java 14 - we need to be familiar with both
versions. You should use traditional if your code needs to be
backwards compatible to earlier versions of java.

it is always good idea to include a default case label

enhanced switch is really an expression, meaning it resolves to a
single value and can be assigned a variable or in this example,
returned from the method. the default label is required under
most conditions. there is an exception

interesting, if you dont have a default, intellij doesnt warn you,
you just get an error runtime?

what if you want to do something in the case branch before
returning a value?
    need to create a code block.
    if you are going to use a code block like this in a switch expression.
    we need to use yield and not return.

    the word yield is a new keyword, introduced for the switch expression,
    to return a value back.

*when to use yield in a switch

your switch statement is being used as a switch expression returning a
value. your case label uses a code block, with opening and closing curly
braces
this code ->"1st"; is implicitly translated to -> {yield "1st";}

yield has to be in a code block

 */

//class 56 - the switch statement

/*
4 control statements of java: switch, while, do while, and for

java provides another mechanism, called switch statement, that lets us test if
a variable matches a particular value, and will then execute one of more lines
of code if the check is true.

switch statement
    switch (value){ //value is what we are checking
        case x: // case keyword is for comparison against switch value
            //code for value == x
            break;
        case y:
            //code for value == y
            break;
        default: // equivalent to the else keyword
            //code for value != to x || y
      }

      valid switch types: byte, short, int, char, Byte, Short, Integer, Character, String,
      and enum

      cannot use long, float, double, or boolean or their corresponding wrappers

      * fall through in switch statement

      once a switch case label matches the switch variable, no more cases are checked
      Any code after the case label where there was a match found, will
      be executed, until a break statement, or the end of the switch
      statement occurs.

 */

