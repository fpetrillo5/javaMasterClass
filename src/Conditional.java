public class Conditional {
    public static void main(String[] args){
        boolean isAlien = true;
        if(isAlien == false){
            System.out.println("It is not an alien");
        }

        /* the equality operator tests to see if 2 operands are considered equal,
        and returns a boolean value

        a code block allows more than one statement to be executed
         */

        int topScore = 80;
        if(topScore <=100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than top score and less than 100");
        }

        /*The logical AND operator and the logical OR operator
        the and operator comes in 2 flavors in java, as does the or operator
        && is th logical and, which operates on boolean operands - checking is
        a given condition is true or false

        The & is a bitwise operator working at the bit level. This is advanced
        concept that we wont go into here
        We will always use the logical operators
        i know the difference. bitwise & will always check both conditions
        regardless if the first is the true or false. Its inefficient because
        if the first is false it doesnt matter what the subsequent results are
        because it will always be false. (AND needs everybody to be true to be
         true). its like playing all 7 games of a  series even when a team has
         4 wins in 5 games. The logical AND will automatically declare a result
         false once it has seen one false, so it is more efficient. The same
         is true for the OR operator but needs only one true to be true. So once
         the OR operator finds one true regardless of previous T/Fs, it will
         declare the statement true. hat tip to predicate logic.)
         Also you can do addition and subtraction with the & | if you want
         to fight the computer for individual bits of memory.
         */

        if((topScore > 90) || (topScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        /*The NOT operator
        the exclamation mark(!), or NOT operator is also known as the
        Logical Complement operator. It can be used with a boolean variable,
        to test for the opposite value

        wait so some people, instead of using !, they will convert the boolean
        to the opposite value. That is insane.

        wait just ask mercedes how she does her testing, ask prod support
        how they do their testing. Then incorporate those tests into
        our automated testing.
        need to get access to put in gmts payments automatically.
            wait if the payments come through, wouldnt that be integrated
            testing. alerts automated, inquiries automated, cases automated,

        need to learn how to do api testing
        performance testing
         */

    }
}
