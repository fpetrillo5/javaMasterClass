import java.util.Scanner;

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
        //class65Driver();
        //class66Driver();
        //isPalindromeDriver();
        //sumFirstAndLastDigitDriver();
        //getEvenDigitSumDriver();
        //hasSharedDigitDriver();
        //hasSameLastDigitDriver();
        //printFactorsDriver();
        //getGreatestCommonDivisorDriver();
        //class70Driver();
        //canPackDriver();
        //getLargestPrimeDriver();
        //printSquareStar(5);
        //getDigitCountDriver();
        //reverseDriver();
//        numberToWords(123);
//        System.out.println();
//        numberToWords(1010);
//        System.out.println();
//        numberToWords(1000);
//        System.out.println();
//        numberToWords(-12);
        //getInputFromScannerDriver();
        //readingUserInputChallenge();
        //minMaxChallenge();
        //inputThenPrintSumAndAverage();
        getBucketCountDriver();





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

    public static void class66Driver(){
        System.out.println(sumDigits(555));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(999999999));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-78));

    }

    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        do{
         sum = sum + (number % 10);
         number /=10;

        }while(number > 0);
        return sum;
    }

    public static void isPalindromeDriver(){
        //System.out.println(isPalindrome(1221));
        //System.out.println(isPalindrome(0));
        //System.out.println(isPalindrome(5));
        //System.out.println(isPalindrome(1278));
        //System.out.println(isPalindrome(-1221));
       // System.out.println(isPalindrome(-12278));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        boolean isNegative = false;
        double reverse =0;
        int originalNumber = number;
        if(originalNumber < 0){
            number *=-1;
            isNegative = true;
        }
        double glove =0;

        do{
           glove = number % 10;
           reverse = reverse + (glove / 10);
           reverse = reverse * 10 ;
           number /= 10;
           glove = 0;

        }while(number > 0);

        if(isNegative){
            reverse *= -1;
        }

        if(originalNumber == reverse){
            return true;
            } else {
            return false;
        }
    }

    public static void sumFirstAndLastDigitDriver(){
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(11));
        System.out.println(sumFirstAndLastDigit(99));

    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        int sum = 0;
        int originalNumber = number;
        if(number <=9){
            sum = number  + number;
            return sum;
        }

        do{
            if(number == originalNumber){
                sum = number % 10;
                number /= 10;
            } else if(number <= 9){
                sum += number;
                number /= 10;
            } else {
                number /= 10;
            }
        }while(number > 0);

        return sum;
    }

    public static void getEvenDigitSumDriver(){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        int sum = 0;
        int glove = 0;
        do{
            glove = number % 10;
            if(glove % 2 == 0){
                sum += glove;
            }
            number /= 10;
            glove = 0;
        }while(number > 0);

        return sum;
    }

    public static void hasSharedDigitDriver(){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(15, 555));
        System.out.println(hasSharedDigit(77, 77));

    }

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 <10 || num1 > 99) || (num2 < 10 || num2 > 99))
            return false;

        if(num1 == num2)
            return true;

        int glove1a = 0;
        int glove1b = 0;
        int glove2a = 0;
        int glove2b = 0;

        glove1a = num1 % 10;
        num1 /= 10;
        glove1b = num1 % 10;
        glove2a = num2 % 10;
        num2 /= 10;
        glove2b = num2 % 10;
        if((glove1a == glove2a) || glove1a == glove2b ||
                glove1b == glove2a || glove1b == glove2b)
            return true;
        else
            return false;
    }

    public static void hasSameLastDigitDriver(){
//        System.out.println(hasSameLastDigit(0,45,456));
//        System.out.println(hasSameLastDigit(10,45,456));
//        System.out.println(hasSameLastDigit(1000,45,4560));
//        System.out.println(hasSameLastDigit(9,45,456));

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public  static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;

        int glove1 = 0;
        int glove2 = 0;
        int glove3 = 0;

        glove1 = num1 % 10;
        glove2 = num2 % 10;
        glove3 = num3 % 10;

        if((glove1 == glove2) || (glove1 == glove3) || (glove2 == glove3))
            return true;
        else
            return false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000)
            return false;
        else
            return true;
    }

    public static void printFactorsDriver(){
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number){
        if(number < 1)
            System.out.println("Invalid Value");

        for(int i = 1; i <= number; i ++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void getGreatestCommonDivisorDriver(){
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10))
            return -1;
        int gcd = 0;

        //maybe nested for loops? keep a max and return it
        for(int i = 1;i <= first; i++){
            if(first % i == 0){
                if(second % i == 0){
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static void class70Driver(){
        String currentYear = "2023";


        try {
            System.out.println(getInputFromConsole(Integer.parseInt(currentYear)));
        } catch (NullPointerException e){
            System.out.println((getInputFromScanner(Integer.parseInt(currentYear))));
        }

    }

    public static String getInputFromConsole(int currentyear){
        String name = System.console().readLine("Hi, whats your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!" );

        String dateOfBirth = System.console().readLine("what year were you born?");
        int age = currentyear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old";
    }

    public static void readingUserInputChallenge(){
        /*things to worry about 1) chars 2) decimals 3) too big for
        an int, 4) too small for an int 5) if it is a valid but
        the accumulation will be too big for an int. 6) if it is a
        valid int but the accumulation will be too small for an int.

        5 & 6 can be handled by passing the current total and the
        next number coming in.

        we can have number represent all the inputs, running total,
        flag for the loop, and count for the 5 inputs
         */
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double check = 0.0;
        int number = 0;
        int count = 0;
        int falseCount = 1;
        boolean flag = false;

        System.out.println("would you like to play a game?");
        System.out.println("enter 5 integers, one at a time.");
        do{

            System.out.println("Enter number #" + falseCount);
            try{
                check = checkInput(total, sc.nextLine());
                if(check  == -1.1){
                    System.out.println("Invalid Number");
                    //i think this knocks out issues 5 & 6
                } else{
                    number = (int) check;
                    total += number;
                    count++;
                    falseCount++;
                    flag = count < 5 ? false : true;
                }

            }catch(NumberFormatException nfe){
                System.out.println("Invalid number");
                //this takes care of issues 1-4
            }

        }while(!flag);

        System.out.println("the total of the 5 numbers you entered is " +
                total);
    }

    public static double checkInput(int total, String number){
        int possibleMax = Integer.MAX_VALUE - total;
        int possibleMin = Integer.MIN_VALUE + total;
        int input = Integer.parseInt(number);

        if((input > possibleMax) || (input < possibleMin))
            return -1.1;
        return input;// this might be an issue but i guess its fine
    }

    public static void minMaxChallenge(){
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        double input =0;
        int count = 0;

        do{
            try{
                System.out.println("Please enter an integer to play" +
                        "or a character to quit the game");
                input = Double.parseDouble(sc.nextLine());
                if(input > max || count == 0)
                    max = input;
                if(input < min || count == 0)
                    min = input;
                count++;

            }catch(NumberFormatException nfe){
                break;
            }
        }while(true);
        if(count == 0){
            System.out.println("No valid data entered.");
        } else{
            System.out.println("thank you for playing the game");
            System.out.println("your maximum guess was: " + max);
            System.out.println("your minimum guess was: " + min);
        }

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner((System.in));
        int sum = 0;
        long average = 0l;
        int input = 0;
        double count = 0;

        do{
            try{
                input = Integer.parseInt(sc.nextLine());
                count++;
                sum += input;

            }catch(NumberFormatException nfe){
                break;
            }
        }while(true);
        average = Math.round(sum/count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void getInputFromScannerDriver(){
        System.out.println(getInputFromScanner(2023));
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("hi, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!" );
        System.out.println("what year were you born?");
        boolean validDOB = false;
        int age = 0;
        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + currentYear);
            try{
                age = checkData(currentYear,scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException badUserData){
                System.out.println("Characters not allowed!! Try again.");
            }

        }while(!validDOB);


        //int age = currentYear - Integer.parseInt(dateOfBirth);

        return  "so you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if(dob < minimumYear || dob > currentYear)
            return -1;

        return currentYear - dob;
    }

    public static void canPackDriver(){
        System.out.println(canPack(1,0,4)); //false
        System.out.println(canPack(1,0,5));//true
        System.out.println(canPack(0,5,4));//true
        System.out.println(canPack(2,2,11));//true
        System.out.println(canPack(-3,2,12));//false
        System.out.println(canPack(3,2,22));//false
        System.out.println(canPack(5,2,22));//true
        System.out.println(canPack(30,2,22));//true

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount < 0) || (smallCount < 0) || (goal < 0))
            return false;

        int realbigCount = bigCount * 5;

        if(realbigCount + smallCount < goal){
            return false;
        }
        else if(goal < 5){
            if(smallCount >= goal)
                return true;
            else
                return false;
        }
        else if(realbigCount < goal){
            if(realbigCount + smallCount >= goal)
                return true;
            else
                return false;
        }
        else if(realbigCount > goal){
            int realgoalDiv5 = 5 * (goal / 5);
            if(realgoalDiv5 + smallCount >=goal)
                return true;
            else
                return false;
        } else
            return true;
    }

    public static void getLargestPrimeDriver(){
        //System.out.println(getLargestPrime(-2));
        //System.out.println(getLargestPrime(0));
       // System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(8));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(17));
        System.out.println(getLargestPrime(10));
        System.out.println(getLargestPrime(253));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number){
        if(number < 2)
            return -1;

        int largestPrime = 2;
        boolean isPrime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                for(int j = 2; j < i; j++){
                    isPrime =true;
                    if(i % j == 0){
                        isPrime = false;
                        break;
                        }
                    }
                if(isPrime)
                    largestPrime = i;
                }
            }
        if((largestPrime == 2) && (number % 2 !=0)){
            largestPrime = number;
        }
        return largestPrime;
        }


        public static void printSquareStar(int number){
        int rowCount = number;

        if(number < 5)
            System.out.println("Invalid Value");
        else{
            for(int i = 0; i < number; i++){
                for(int j = 0; j < rowCount; j++){
                    if(i == 0 || i == (number - 1)){
                        System.out.print("*");
                    }
                   else if(j == 0 || j == (rowCount - 1)) {
                        System.out.print("*");
                    }
                   else if(i == j){
                       System.out.print("*");
                    }
                   else if(j == (rowCount - 1) - i){
                       System.out.print("*");
                    }
                   else{
                       System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void getDigitCountDriver(){
        System.out.println(getDigitCount(0)); //1
        System.out.println(getDigitCount(-4)); //-1
        System.out.println(getDigitCount(1)); //1
        System.out.println(getDigitCount(077)); //2
        System.out.println(getDigitCount(67596978));//8
        System.out.println(getDigitCount(10));//2
        System.out.println(getDigitCount(123));//3
        System.out.println(getDigitCount(-12));//-1
        System.out.println(getDigitCount(5200));//4


    }

    public static void reverseDriver(){
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

    }

    public static int reverse(int number){
        int reverseNum = 0;
        while(number != 0){
            reverseNum *= 10;
            reverseNum += (number % 10);
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number){
        if(number < 0)
            return -1;
        int count = 0;

        if(number == 0)
            return 1;

        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }

    public static void numberToWords(int number){
        if(number < 0)
            System.out.println("Invalid Value");
        else{
            int digitCount = getDigitCount(number);
            number = reverse(number);
            for(int i = digitCount; i > 0; i--){
                switch (number % 10){
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                    default:
                        System.out.print("Zero");
                }
                number /= 10;
               System.out.print(" ");
            }

        }

    }

    public static void getBucketCountDriver(){
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println();
        System.out.println(getBucketCount(-3.4, 2.1));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

    }

    public static int getBucketCount(double area, double areaPerBucket){

    }

}

//class 74 - min max challenge
/*

 */

//class 72 - reading input with scanner
/*
validation method
you can use scanner.nextline() as an argument to a method

NumberFormatException is an unchecked exception in java.
NumberFormatException is thrown when attempting to convert an
alphanumeric string to an integer. Since nfe is an unchecked
exception, it does not need to be declared in the throws clause of a
method or constructor. It can be handled in code using a try-catch
https://rollbar.com/blog/java-numberformatexception/#

in the past 2 classes, we learned 2 different ways to get user input.
we transformed String data, to Integer data, so we could do
calculations. We learned that System.console doesnt work in intellij,
but Scanner does. We saw that we can use exception handling, to check
which way will work, and the code will execute a different method, if
run in intellij or on the command line or terminal. we also added
validation to our second method, as well as a do while loop statement
to keep trying to get a valid date of birth from the user
 */
//class 71- exception handling and intro to scanner
/*
*what is an exception
* an exception is an error that happens in code
* some types of errors can be predicted and named
* null pointer exception - npe (which is the error we saw when we tried to
* run our code using system.console
*
* catching an exception
* an exception is caught, first by creating a code block around the code,
* that might get the error. this is done with the try statement code block
* the Try statement
* try statement has 2 code blocks
* the first is declared directly after the try keyword, and this coder block
* ends, and is followed by the declaration of the catch keyword
* the catch keyword includes the declaration of variables, in parentheses,
* and then has its own code block
* try - statements that might get errors
* catch - code to handle the exception
*
* The Scanner class
* the scanner class is described as a simple text scanner, which can
* parse primitive types and strings. to use the scanner class, we have to
* create an instance of scanner.
*
* new keyword
* the new keyword is used in what java calls, a class instance creation
* expression. ClassName varName = new ClassName();
*
* instantiating Scanner
* for reading input from the console or terminal, we instantiate a scanner
* object using new, followed by the scanner class name, and passing in
* System.in, in the parentheses.
* Scanner sc = new Scanner(System.in);
* for reading input from a file, we instantiate a scanner object using
* new again with the Scanner class name, but pass in a File object, in the
* parentheses.
* File is another class provided by java, for reading and writing files
* Scanner sc = new Scanner(new File("nameOfFile"));
*
* Using the import statement
* we havent talked about the import statement yet, but this statement lets
* us use classes from other people's code.
* In this case, java provides a library of code, which includes the
* Scanner class, in a library called java.util.
* import java.util.Scanner;
*
*Scanner is one of java's built in classes and it allows us to read user
* input. we can parse primitive types and strings, using methods from
* this scanner
 */
//class 70 -Parsing Values and Reading Input using System.console()
/*
when we read data in, from either a file, or from user input,its common
for the data to be initially a string, which we will need to convert to
a numeric value.

*reading data from the console
system,in
    like system.out, java provides system.in which can read input from
    the console or terminal. it is not east to use for beginners, and
    lots of code has been built around it to make it easier.
System.console
    this is java's solution for easier support for reading a single line
    and prompting user information. although this is easy to use, it doesnt
    work with ide's because these environments disable it.
Command line arguments
    This is calling the java program and specifying data in the call. this
    is very commonly used but doesnt let us create an interactive app
    in a loop in java.
Scanner
    the scanner class was built to be a common way to read input, either
    using System.in or a file. For beginners, its much easier to understand
    than the bare bones System.in

we have to run system.console in intellij terminal session because you
will get Cannot invoke "java.io.Console.readLine(String, Object[]) error
click on Terminal tab on bottom. its just like terminal, you can navigate
the same way.
 */
//class 69- The class, the object, static & instance fields and methods
/*
class can be described as a custom data type, special code block that
contains methods.
an object is an instance of a class.
object and instance are interchangeable terms (the fact that he calls
this out now is amazing for new learners)
 */
//class 68 - local variables and scope
/*
a local variable is called local, because it is available for use by the
code block in which it was declared. It is also available to code blocks
that are contained by a declaring block.
*scope
scope describes the accessibility of a variable. in scope means the
variable can be used by an executing block or any nested blocks. out
of scope means the variable is no longer available.
*best practices
to declare and initialize variables in the same place if possible. and to
declare variables in the narrowest scope possible
 */

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

