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

        Dog wolf = new Dog("Wolf", 130);
        doAnimalStuff(wolf, "fast");

        Fish fish = new Fish("goldfish",.25, 2, 3);
        doAnimalStuff(fish,"fast");

        Pupil max = new Pupil("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolPupil jimmy = new PrimarySchoolPupil("jimmy", 7,"Carol");
        System.out.println(jimmy);

        Worker w = new Worker("paco","1/24/1978","unknown");
        System.out.println(w);
        System.out.println();
        Employee e = new Employee("matthew", "4/23/2017", "unknown",
                12345,"3/24/2023");
        System.out.println(e);
        System.out.println();

        SalariedEmployee s1 = new SalariedEmployee("matthew", "4/23/2017", "unknown",
                12345,"3/24/2023", 150000,false);
        System.out.println(s1);
        s1.retire();
        System.out.println(s1);

        HourlyEmployee h1 = new HourlyEmployee("matthew", "4/23/2017", "unknown",
                12345,"3/24/2023", 150.00);
        System.out.println(h1);
        h1.getDoublePay();
        System.out.println(h1);


    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }

}

class Pupil {

    private String name;
    private int age;





    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + " is " + age;
//        return "Pupil{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolPupil extends Pupil{
    private String parentName;

    PrimarySchoolPupil(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    public String toString(){
        return parentName + "'s kid, " + super.toString();
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

//class 90 - inheritance part 3

not all methods need to be exposed (he means set to public), especially if
you only intend for them to be called internally from the current class.

we get a compiler error because type si one of the fields inherited by Dog
from Animal, but because it is private, no other classes, not even
subclasses, can access or use this field, in its own method.
To get around this, we use the protected modifier.

    what this modifier says is let any class that is a subclass, access this
    field. this is called limited encapsulation. We are allowing some limited
    access, to our internal fields, and that is to subclasses.
    Protected also means that any classes in the same package, will also have
    access.

    Java first looks on the subclass for a method or a field with that name,
    then it will go up the inheritance tree, looking for a match.


*Polymorphism

means many forms
in this class, we showed the  animal can take many forms, the base class
animal, Dog, Fish.
Advantages:

makes code simpler,
    With doAnimalStuff(), we wrote code without having to know about
    subclass types. we didnt have to write code to check the type of the
    object, and then decide what method to call, Java did that at runtime.

encourages code extensibility
    its very easy to subclass and override or extend a method


// class 91 - what is java.lang.Object

every class you create in java, intrinsically extends a special java class.
The class is named Object, and its in the java.lang package

Class Object is the root of the class hierarchy. every class has Object as
a superclass. All objects including arrays, implement the methods of this
class. whether you knew it or not, your classes were extending this class,
Object.

hashcode is an integer, that is unique to an instance (in the currently
executing code). when an instance is created, its assigned a hashcode
and that is what can tell us if our multiple references are pointing
to a single instance. Its a mechanism for comparison, like an address
for a house, ( i always thought it was the address in memory)

we learned that all classes, which do not explicitly extend another class
will implicitly extend a Class named Object. Object is the base class in
Java, which means all classes can use or override Object's methods.

 */
