public class MainChallenge {
    public static void main(String[] args){

        //class 44 - if then else challenge

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;



        calculateScore(gameOver, score, levelCompleted, bonus);

        /*insert a code  segment after the code we have reviewed
        set the existing score variable to 10000
        set the existing levelCompleted variable to 8
        set the existing bonus variable to 200
        use the same if condition (meaning gameOver is true) you want to
        perform  the same calculation, and print out the value of the
        finalScore variable

        wtf is challenging about that
         */

        //clas 45 - methods in java

        /*a method declares executable code that can be invoked, passing a
        fixed number of values as arguments

        benefits of the method
        a method is a way of reducing code duplication
        a method can be executed many times with potentially different results
        by passing data to the method in the form of arguments

        structure of the method
        this method has a name, but takes no data in, and returns no data from the
        method (which is what the special word void means in the declaration. its accessible
        to the outside world because it uses the keyword public

        public static void methodName(){
            //method statements form the method body
         */

        //class 47 - methods recap

        /* method signature
        a method is uniquely defined in a class by its name, and the number and
        type of parameters that are declared for it

        you can have multiple methods with the same method name, as long as
        the method signature are different
         */

        //class 48 - method challenge

        int score1 = -1001;
        int score2 = 99;
        int score3 = 499;
        int score4 = 999;
        int score5= 1500;

        String player1 ="Tim";
        String player2 ="Paco";
        String player3 ="2";
        String player4 ="Prince";
        String player5 ="Grace";

        int playerRank = calculateHighScorePosition(score1);
        displayHighScorePosition(player1, playerRank);

         playerRank = calculateHighScorePosition(score2);
        displayHighScorePosition(player2, playerRank);

         playerRank = calculateHighScorePosition(score3);
        displayHighScorePosition(player3, playerRank);

         playerRank = calculateHighScorePosition(score4);
        displayHighScorePosition(player4, playerRank);

         playerRank = calculateHighScorePosition(score5);
        displayHighScorePosition(player5, playerRank);














    }

     static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore =score;
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void displayHighScorePosition(String pName, int pos){
        System.out.println(pName + " managed to get into position " + pos +
                " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        else if(score >= 500 )// took out the && < 1000 because it was unnecessary. if its above 1000 it wont even make it to this line, so we can discard it
            return 2;
        else if(score >= 100)
            return 3;
        else
            return 4;
    }
}
