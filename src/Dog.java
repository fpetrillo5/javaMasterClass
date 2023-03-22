public class Dog extends Animal{
    //its called in Inheritance class main

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        System.out.println("dogs walk, run and wag their tail");
    }

    public Dog(){
        super("Mutt","big",50);
        //this is what the implicit constructor looks like.
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

    }
}
