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

        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but more than 1000");
        } else if(score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("You got here");
        }

        //class 44 - if then else challenge

        // class 51- method overloading

        /* method overloading occurs when a class has multiple methods, with
        the same name, but the methods are declared with different parameters.
        you can execute a method with one name, but call it with different
        arguments.

        a method signature consists of the name of the method, and the uniqueness
        of the declaration of its parameters. in other words, a signature is
        unique, not just by the method name, but in combination with the number
        of parameters, their types, and the order in which they are declared.
        a method's return type is not part of the signature.
        a parameter name is also not part of the signature.

        the type, order, and number of parameters, in conjunction with the name,
        make a method signature unique. a method signature is the key for the
        java compiler, to determine if a method is overloaded correctly.

        overloaded methods offer some of the same functionality, that you can
        get from default values for parameters, in other languages.
         */

        //class 52 - method overloading challenge








    }
}
