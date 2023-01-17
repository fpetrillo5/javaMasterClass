public class SectionFive {
    public static void main(String[] args){

        //Class 41 - keywords and expressions

        /* expression - an expression computes to a single value
        statement - statements are stand alone units of work
        code block - a code block is a set of zero, one, or more statements
        usually grouped together in some way to achieve a single goal
         */

        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if(highScore > 25){
            highScore = 1000 + highScore;   //add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }

        // class 42 - statements, whitespace and indentation(code organization)

        int myVariable = 50;

        /* what is a statement? it is the entire line. By adding the data type
        at the start of our expression, and then finishing off with a semicolon,
        we have created a valid java statement.
         */

        myVariable++;
        myVariable--;
        // both of these are both complete statements. the semicolon makes
        // both of these statements.

        // class 43 - code blocks and the if then else control statement




    }
}
