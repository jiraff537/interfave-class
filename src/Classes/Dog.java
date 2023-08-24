package Classes;

public class Dog extends MilkPowered {
    public Dog(String color, int speed) {
        System.out.println("I'm big dog! -----");
        System.out.println("My color is " + color);
        System.out.println("I can run " + speed + " km/h");
    }

    @Override
    public String voice() {
        System.out.println("Gav-Gav");
        return "Gav-Gav";
    }
}
