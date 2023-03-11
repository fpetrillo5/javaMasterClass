public class Constructions {

    public static void main(String[] args){
        Customer c1 = new Customer("frank", 5000, "frank@email.com");
        System.out.println(c1.toString());
        System.out.println();
        Customer c2 = new Customer("paco", "paco@email.com");
        System.out.println(c2.toString());
        System.out.println();
        Customer c3 = new Customer();
        System.out.println(c3.toString());






    }
}
/*
//constructors part 1
a constructor is used in the creation of an object, that is an instance of
a class. it is a special type of code block that has a specific name and
parameters, much like a method. it has the same name as the class itself,
and it doesnt return any values. you never include a return type from a
constructor, not even void. you can and should, specify an appropriate
access modifier, to control who should be able to create new instances of
the class.
you set the initial parameters or the initial values of the fields.

a constructor is actually created for you implicitly by java. when we say
things are implicit in java, we mean you cant see the code in the source,
but its in the byte code, generated during the compilation process. when
you type new, and the name of the class(), this is calling the constructor.
this is the default constructor.

2 rules for constructors 1) name has to be the same as class 2) no return
type.

constructor overloading
is declaring multiple constructors, with different formal parameters. the number
of parameters can be different between constructors. or if the number of
parameters is the same between 2 constructors, their types or order of the
types must different.

constructor chaining with this()
never heard of this- constructor chaining is when one constructor
explicitly calls another overloaded constructor. you can call a constructor
only from another constructor. you must use the special statement this()
to execute another constructor, passing it arguments if required. and this
must be the first executable statement, if its used from another
constructor.

calling setters vs directly setting the variables in constructors
because you will find out later on, when we start talking about
inheritance, and creating subclasses, these calls to setters might not
work. so the general rule of thumb, its always better to assign values
directly to the field, rather than calling the setter in a constructor.

 */
