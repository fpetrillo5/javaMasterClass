public class IntroClassesAndObjects {
    public static void main(String[] args){

//        Car c = new Car();
//        c.setMake("porsche");
//        c.setModel("carrera");
//        c.setDoors(2);
//        c.setConvertible(true);
//        c.setColor("blue");
//        System.out.println(c.getMake());
//        System.out.println(c.getModel());
//        c.describeCar();
//
//        Car targa = new Car();
//        targa.setMake("porsche");
//        targa.setModel("targa");
//        targa.setDoors(2);
//        targa.setConvertible(false);
//        targa.setColor("red");
//
//        targa.describeCar();

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full Name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("john");
        person.setAge(18);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name= " + person.getFullName());
        person.setAge(-5);
        System.out.println(person.getAge());



    }
}
//class 76- Intro to classes and objects
/*
i will split this section 7 into multiple classes. 1) classes 2) constructors
3)static-reference and class 83 4) pojo 5)inheritance 5) string

*what is object oriented programming

oop is a way to model real world objects, as software objects, which
contain both data and code

*class based programming
starts with classes, which become blueprints for objects

*organizing classes
classes can be organized into logical groupings, which are called packages.
you declare a package name in the class using the package statement. if you dont
declare a package, the class implicitly belongs to the default package.

*access modifiers for the class
a class is said to be a top level class, if its defined in the source code
file, and not enclosed in the code block of another class, type or method.
a top level class has only 2 valid access modifier options:
public or none.

Access Keyword   Description
public  public means any other class in any package can access this class

        when the modifier is omitted, this has special meaning, called
        package access, meaning the class is accessible only to
        classes in the same package.


*access modifiers for class members
an access modifier at the member level, allows granular control over
class members.

access Keyword   Description
public  public means any other class in any package can access this member

protected   protected allows classed in the same package, and any other
            subclasses in other packages, to have access to the member.

        when the modifier is omitted, this has special meaning, called
        package access, meaning the member is accessible only to
        classes in the same package.

private     private means that no other class can have access this member.

as a general rule, all your fields should be private. this is called
encapsulation. it has 2 meanings 1) is the bundling of behavior and
attributes on a single object. 2) practice of hiding fields, and some
methods, from public access.

default values for fields on classes
fields on classes are assigned default values, intrinsically by java, if
not assigned explicitly.
boolean - false
byte, short, int, long, char - 0
dodouble, float - 0.0

*what are getters and setters
a getter is a method on a class, that retrieves the value of a private
field and returns it
a setter is a method on a class, that sets the value of a private field
the purpose of these methods is to control, and protect, access to
private fields.

i never understood this---
another important aspect, is that getters and setters method signatures
are part of car's public interface, but the attribute names and types
are not. this means that we can change things internally, like the name
or type of an attribute, but as long as we use the same getter and setter
method, these changes should have no effect on code that uses our class.
our internal changes are hidden from our users. a getter method usually
just returns the value of a private attribute (this makes sense, because
if you have access to read it, you also have access to write and you
dont want that). ---> a setter method may simply just assign the argument
(that is all i have ever seen done) but it often contains code to validate
data, check additional security requirements, ensure immutability of the
field value, or any other code required to protect and validate an object's
state (FINALLY!! so you do put the validation here). he also hints at,
that you dont always need setters but make them because later on you might.

intellj automatically can create getters and setters
Code > Generate > whatever you need generated like getters and setters,
constructors ...

class 78
we talked about best practices for fields, that in general, fields on
classes should be private, and a getter method should be created to
access those fields. this provides encapsulation of the internals of our
class, and supports maintenance of a public interface that doesnt have
to change, even though are class might.

here comes this
'this' is a special keyword in java. what it really refers to is the
instance that was created when the object was instantiated. so 'this'
is a special reference name for the object or instance, which it can
use to describe itself. and we can use 'this' to access fields on the
class.
because we are trying to set make, the field, here on the left side of the
assignment operator, we want to specify that the make field we want to
use, to assign a value to, is the make field on the object, and not the
make method parameter. this.make = make;

what you can do with setter methods is set up all the rules related to that
class, what is valid, what is not valid. you can have that functionality set up,
within the car class itself, so that these rules are in place as we are
creating the object. in other words, it cant assign a make, that we have
not defined as being valid in our car class. that is really the whole
concept of encapsulation, is that we are not allowing people to access
the field directly

Car c = new Car();
what happens if we create a reference variable (c), but assign it nothing.

Car c; intellij yells at us telling us the reference variable, c, is not
initialized. we cant use an uninitialized reference variable because we
have not assigned an object reference to it, Car(), portion. but what
happens if we assign it null to shut it up. Car c = null. we dont get
anymore errors from intellij but when we run it we get the dreaded
nullpointerexceptions when we try to call a method of that object,
c.setMake. and what that essentially means, is we have defined a reference
variable c, but it doesnt have a valid instance of Car. so we cant run
a method on null, and we cant set or get attributes on null.

there is a distinction here between an uninitialized variable and a
variable with a null reference.
    an uninitialized variable, Car c;, causes a compile time error. but
    a variable with a null reference can be used in code, without compiler
    errors.
    in both of these scenarios, we have not created an object from the
    Car template, which of course is the class. so that is why you need to
    make sure that new is always executed.
    its called null object reference Car c = null
    i think we are going to have to setup a check against nulls
    everytime we pass an object, didnt we do that in korsch's class

he ends class with talking about how annoying it is to set data on an
object, setting us up for constructors

when we use the new keyword, we have said this creates the object and is
called instantiation or constructing an object

 */
