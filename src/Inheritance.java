public class Inheritance {
    public static void main(String[] args){
        //Animal class
        //Dog class

        Animal animal = new Animal("generic animal", "huge", 400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65,"Floppy",
                "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }

}
/*
//class 88 - inheritance part 1
*inheritance
it is a way to organize classes into a parent- child  hierarchy, which lets
the child inherit(reuse) fields and methods from its parent.

the most generic, or base clas, starts at the top of the hierarchy. every
class below is a subclass.

a child can only have one direct parent in java. but it will inherit from
its parent class's parent and so on.

made a parent animal class now making a child dog class. Dog inherits from
Animal. Dog 'IS A' type of Animal. when we create a Dog object, it will
inherit Animal's attributes (type, size, weight). this is also true for
Animal's methods, Dog will inherit these as well. We can specialize the
Dog class with its own fields and behavior.

*extends (thanks heretics for teaching me where this word comes from)
using extends specifies the superclass (or parent class) of the class
we are declaring. we can say Dog is a subclass, or child class of Animal.
we can say Animal is a parent, or super class of Dog. a class can specify
one, and l\only one, class in its extends clause.

*super()
super() is a way to call the constructor on the parent class or super class
super() is alot like this(). its a way to call a constructor on the super
class, directly from the sub class's constructor. like this() it has to be
the first statement of the constructor. because of that rule, this() and
super() can never be called from the same constructor.

if you dont make a call to super(), then java makes it for you, using
super's default constructor. if your super class doesnt have a default
constructor, then you must explicitly call super() in all of your
constructors, passing the right arguments to that constructor.

we are passing a Dog object as the method argument, when the type was
declared as an Animal. why is this ok? it works because Dog inherits from
Animal

//class 89 - inheritance part 2

*code reuse
all subclasses can execute methods, even though the code is declared on
the parent class. the code doesnt have to be duplicated in each subclass.
we can use code from the parent, or we can change that code for the
subclass

*overriding a method
overriding a method is when you create a method on a subclass, which has
the same signature on a super class. you override a parent class method,
whe you want the child class to show different behavior for that method.

in this class, we created methods on a super class, then called them from
a subclass, directly showing you that methods can be inherited,as well as
fields. we also showed you that a subclass can override a superclass's
methods. the overridden method can do one of 3 things: 1) it can completely
different behavior, overriding the behavior of the parent 2) it can
simply call the parent class's method, which is somewhat redundant to do.
3) or the method can call the parent class's method, and include other code
to run, so it can extend the functionality for the Dog, for that behavior.


 */
