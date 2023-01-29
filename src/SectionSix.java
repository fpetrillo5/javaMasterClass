public class SectionSix {
    public static void main(String[] args){
        /*we are just going to put driver methods in main from now on.
        The reason is every github repo should be == to a project in java/intellij.
        instead of cluttering github with a 100 different repos, i will just
        create a corresponding driver class to whatever method i want to run.
         */

        class56main();


    }

    public static void class56main(){

        //translating if elses to swtich
        int value =2;

        switch (value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("value was != 1 || 2");
        }

    }
}


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

 */

