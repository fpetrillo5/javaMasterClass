public class RefvObjVInsvCls {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("s92300" + i,
                    //this is pretty badass
                    switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("s923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("s923007",
                "Bill", "05/11/1985",
                "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
    }
}
/*
// class 83 - reference vs object vs instance vs class
he talks about when 2 reference variables point to same object.
House blueHouse = new House("blue");
    creates a new instance of the House class. remember House is a
    blueprint, and we are assigning it to the blueHouse variable. in other
    words, it is a reference to the object in memory.

House anotherHouse = blueHouse;
    the next line, creates another reference to the same object in memory.
    Here we have 2 references pointing to the same object in memory. There
    is still 1 house, but 2 references to that 1 object. In other words
    we have 2 pieces of paper with the physical address of where the
    house is built.

System.out.println(blueHouse.getColor()); // prints blue
System.out.println(anotherHouse.getColor());//blue

    both will print blue since we have 2 references to the same object.

anotherHouse.setColor("yellow");//yellow
System.out.println(blueHouse.getColor()); // prints yellow
System.out.println(anotherHouse.getColor());//yellow

    the next line calls the method setColor and sets the color yellow. to
    the left you can see(pic) both blueHouse and anotherHouse have the
    same color now. why? remember we have 2 references that point to the
    same object in memory. once we change the color of one, both
    references still point to the same object. in our real world example,
    there is still just one physical house at that one address, even though
    we have written the same address on 2 pieces of paper.

House greenHouse = new House("green");

    here we are creating another new instance of the house class with the
    color set to green. now we have 2 objects in memory but we have 3
    references which are blueHouse, anotherHouse and greenHouse. the
    variable (reference) greenHouse points to a different object in
    memory, but blueHouse and anotherHouse point to the same object in
    memory.

anotherHouse = greenHouse;

    here we assign greenHouse to anotherHouse. iow, we are dereferencing
    anotherHouse. it will now point to a different object in memory. before
    it was pointing to a house that had the yellow color, now it points to
    the house that has the green color. in this scenario we still have 3
    references and 2 objects in memory but blueHouse points to 1 object
    while anotherHouse and greenHouse point to the same object in memory.


//class 84 - static vs instance variables

 *static variables
    declared using the keyword static, aka static member variables
    every instance of the class shares the same static variable
    so if changes are made to that variable, all other instances of that
    class will see the effect of that change

    its considered best practice to use the Class name and not a reference
    variable to access a static variable

    an instance isnt required to exist, to access the value of a static var

    not used often but can be used for: counters, generating unique ids,
    storing a constant value that doesnt change, like PI, Creating and
    controlling access to a shared resource
        examples of shared resources: log files, database, or some other
        type of input or output stream

*instance variables
    pretty much everything else
    belong to a specific instance of a class
    represent the state of a specific instance of a class

//class 85 - static vs instance methods

*static methods
    are declared using a static modifier
    cannot access instance methods and instant variables directly
    they are usually used for operations that dont require any data from
    an instance of the class (from 'this')
        this keyword is the current instance of a class

        inside a static method, cannot use the 'this' keyword

        whenever you see a method that doesnt use instance variables, that
        method should probably be declared as a static method (interesting)

*instance methods

    everything else
    belong to an instance of a class
    to use an instance method, we have to instantiate the class first,
    usually by using the new keyword

    can access static methods and variables directly

//class 86 - pojo

a plain old java object (pojo) is a class that generally only has
instance fields.

its used to house data, and pass data, between functional classes.

it usually has few, if any methods other than getters and setters.

many database frameworks use pojos to read data from, or to write data to
databases, files, or streams

*examples of pojos
    a pojo also called a bean or a javabean

    a javabean is just a pojo, with some extra rules applied to it.

    a pojo is sometimes called an entity, becuase it mirrors database
    entities

    another acronym is dto, data transfer object

    it is a description of an object, that can be modeled as just data.

*support for pojo creation
    there are many generation tools, that will turn a data model into
    generated pojos of javabeans.

a pojo in its simplest form requires a way to populate data, we can do
this with a constructor.

mouthfucka is using a switch expression as a parameter to a constructor.

*annotation
@ is annotation, they are a type of metadata. metadata is a way of
formally describing additional information about our code

annotations are more structured, and have more meaning, than comments.

this is because they can be used by the compiler, or other types of
pre-processing functions, to get information about the code.

metadata doesnt effect how the code runs, so this code will still run,
with or without the annotation.

*overridden method
not the same thing as an overloaded method.

an overriden method is a special method in java, that other classes can
implement, if they use a specified method signature.

you might have noticed we didnt actually call the toString on student.
we didnt have to, this is another built in feature from java. every object
when passed to System.out.println, will have the toString method implicitly
executed.

this was a contrived example but if we were reading data from  a db, or a
csv, you could create a whole set of pojos to collect all the data
elements in all your records. once you have all this information in the
pojo, you can pass these objects to whatever code would process it, that
would need to do something with it, perhaps generate a mailing list.

boilerplate code is code that is repetitive and follows a pattern, which is
why code generation tools can create it for us.
    wouldnt it be nice if we had a type that did all this for us, and we
    didnt have to put all this code in our class. well we do, its called
    a record. it came in jdk 16

//class 87 - java's implicit pojo type, the record

the purpose of record is to replace the boilerplate code of the pojo, but
to be more restrictive

java calls them plain data carriers. the word carrier is an important
term, because it means the record has more built in then a pojo would.

the record is a special class that contains data thats not meant to be
altered. it seeks to achieve immutability for the dat in its members. it
contains only the most fundamental methods, such as constructors and
accessors

so wait a record replaces the constructors, getters and toString with just
2 lines of code

java tells us about what is implictly created when we declare a record as
we did in this code.

first, its important to understand that the part in parentheses, is called
a record header. the record header consists of record components, a
comma delimited list of components.
for each component in the header java generates:
    a field with the same name and declared type as the record component.
    the field is declared private and final.
    the field is sometimes referred to as a component field

    java generates a toString method that prints out each attribute in a
    formatted string.

    in addition to creating a private final field for each component, java
    generates a public accessor method for each component.

    this method has the same name and type of the component, but it doesnt
    have any kind of special prefix, no get or is

    the accessor method, for id in this example, is simply id()

    no setters using records, only way to set passing the value in on the
    record header, or through the use of constructors. this is by design
    because a record wants to be immutable.

    why is the record built to be immutable?
    there are more use cases for immutable data transfer objects, and
    keeping them well encapsulated. you want to protect the data from
    unintended mutations. if you to modify data on your class, you wont
    be using the record. you can use the code generations options for the
    pojo, as we showed in the earlier video. but if you are reading a
    whole lot of records, from a database or file source, and simply
    passing this data around, then the record is a big improvement.
 */
