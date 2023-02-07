public class SectionSix {
    public static void main(String[] args){
        /*we are just going to put driver methods in main from now on.
        The reason is every github repo should be == to a project in java/intellij.
        instead of cluttering github with a 100 different repos, i will just
        create a corresponding driver class to whatever method i want to run.
         */

        //class5657Driver();
        //class58Driver();
        //class59Driver();
        //codingExercise13Driver();
        //codingExercise14();
       // class60Driver();
        //class61Driver();
        //class62Driver();
        //codingExercise15Driver();
        //class64Driver();
        class65Driver();




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

    public static void codingExercise13Driver(){
        printNumberInWord(-99);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(5);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(444);

    }


    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void codingExercise14(){
//        getDaysInMonth(-45,-89); //-1
//        getDaysInMonth(0,0);//-1
//        getDaysInMonth(1,1);//1
//        getDaysInMonth(6,6);//1
//        getDaysInMonth(12,9999);//1
//        getDaysInMonth(13,10000);//-1
//        getDaysInMonth(45,544354);//-1
//        getDaysInMonth(-3,999);//-1
//        getDaysInMonth(4,-54);//-1
        System.out.println(getDaysInMonth(2,1700));//28
        System.out.println(getDaysInMonth(2,2100));//28
        System.out.println(getDaysInMonth(2,1600));//29
        System.out.println(getDaysInMonth(2,1601));//28
        System.out.println(getDaysInMonth(2,2020));//29
        System.out.println(getDaysInMonth(2,3456));//28?
        System.out.println(getDaysInMonth(2,2023));//28

        System.out.println(getDaysInMonth(1,2020));//28
        System.out.println(getDaysInMonth(2,2020));//28
        System.out.println(getDaysInMonth(2,2018));//28
        System.out.println(getDaysInMonth(-1,2020));//28
        System.out.println(getDaysInMonth(1,-2020));//28

        System.out.println(getDaysInMonth(4,2020));//28
        System.out.println(getDaysInMonth(12,2020));//28

    }


    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        } else if(year < 1 || year > 9999){
            return -1;
        }

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;
        }
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

    public static void class60Driver(){
        class60();



    }

    public static void class60(){
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for(double rate = 7.5; rate <= 10.0; rate += 0.25){
            double interestAmount = calculateInterest(100, rate);
            if(interestAmount > 8.5)
                break;
            System.out.println("$100 at " + rate + "% interest = $" + interestAmount);

        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static void class61Driver(){
//        System.out.println("0 is " + ((isPrime(0) ? "": "NOT ") + "a prime number" ));
//        System.out.println("1 is " + ((isPrime(1) ? "": "NOT ") + "a prime number" ));
//        System.out.println("2 is " + ((isPrime(2) ? "": "NOT ") + "a prime number" ));
//        System.out.println("3 is " + ((isPrime(3) ? "": "NOT ") + "a prime number" ));
//        System.out.println("8 is " + ((isPrime(8) ? "": "NOT ") + "a prime number" ));
//        System.out.println("17 is " + ((isPrime(17) ? "": "NOT ") + "a prime number" ));

        System.out.println(forLoopChallenge(0,1000));
        System.out.println(forLoopChallenge(900,1000));
        System.out.println(forLoopChallenge(500,1000));
        System.out.println(forLoopChallenge(0,100));
        System.out.println(forLoopChallenge(10,50));


    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <=  2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static int forLoopChallenge(int begin, int end){
        if(end>1000){
            System.out.println("please enter a ending less than a 1000");
            return -1;
        }
        int primeCounter = 0;
        for(int i = begin ; i <= end;i++){

            if(isPrime(i)){
                primeCounter++;
                System.out.println(i + " is a prime number");
                if(primeCounter == 3){
                    break;
                }
            }
        }
         return primeCounter;
    }

public static void class62Driver(){
    System.out.println("sum is: " + ThreeFiveChallenge(5, 50));
    System.out.println("sum is: " + ThreeFiveChallenge(1, 1000));

}

    public static int ThreeFiveChallenge(int begin, int end){
        if(begin < 0 && end>1000){
            System.out.println("please enter a ending less than a 1000");
            return -1;
        }
        int sum = 0;
        int counter=0;

        for(int i = begin ; i <= end;i++){
            if(i%3 == 0 && i%5 ==0){
                System.out.println(i);
                sum += i;
                counter++;
                if(counter ==5){
                    break;
                }
            }
        }
        return sum;
    }

    public static void codingExercise15Driver(){
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number){
        if(number < 1){
            System.out.println("please enter a positive number");
            return false;
        }
        if(number % 2 == 1){
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(end < start || start < 0 || end <0){
            return -1;
        }
        int sum =0;
        for(int i = start; i <= end;i++){
            if(isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }

    static public void class64Driver(){
        class64();
    }

    public static void class64(){
        for (int i = 1; i <=5; i++){
            System.out.println(i);
        }
        int j =1;

        while(true){ // this is same as do while loop
            if(j >5)
                break;
            System.out.println(j);
            j++;
        }
        int k = 1;
        boolean isReady = false;
        do{
            if(k >=5)
                break;
            System.out.println(k);
            k++;
        }while(isReady);

        int number = 0;
        while(number < 50){
            number +=5;
            if(number % 25 ==0){
                continue;// oh so the continue just skips those conditions in
                //the loop, unlike a break, which just shuts the whole thing down
            }
            System.out.print(number + "_");
        }
    }

    public static void class65Driver(){
        class65(10,100);

    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0)
            return true;
        else
            return false;
    }

    public static void class65(int start, int end){
        while (start<=end){
            if(isEvenNumber(start)){
                System.out.println(start);
            }
            start++;
        }
    }

}

//class 65 - while loop challenge

/*

 */
//class 64 - the while and do while statements

/*
continue statement - will stop executing the current iteration of block of code
in a loop, and start a new iteration.
 */

//intellij debugger youtube basics
/*
why debug
    find and fix bugs
    code analysis
        gives you the runtime values
        what parts get executed
        getting familiar with the new code
    change behavior of your app
        by changing the inner state (data) without changing the code
        switch app state without having to restart
    add more logging on the fly
    ui painting debugging - can view images
    analyze memory issues
    set a breakpoint bomb


 */

//class 60 - for loop

/*
for (init; expression; increment){
//block of statements
there are 3 parts to the basic for statement's declaration
init
    the initialization section declares or sets state, usually declaring and
    initializing a loop variable, before the loop begins processing.

expression
    once it becomes false, will end the loop processing

increment
    is executed after the expression is tested, and is generally the place
    where the loop variable is incremented

*break statement
    a break statement transfers control out of an enclosing statement
    we have seen the break statement in the switch statement, but it can
    also be used in a loop. (funny, i never noticed they are the same)


 */


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

