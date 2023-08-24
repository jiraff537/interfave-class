import Classes.Cat;
import Classes.Dog;
import Classes.MilkPowered;
import Classes.Snake;
import interfaces.JivMIR;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Cat catBarsik = new Cat("Orange", (byte) 14);
        JivMIR catBarsik = new Cat("Orange", (byte) 14);
        catBarsik.voice();
        catBarsik.move();


        Dog dogTuzik = new Dog("black", 25);
        dogTuzik.move();
        dogTuzik.voice();

        Snake snakeShippa = new Snake("yellow", 118);
        snakeShippa.voice();
        snakeShippa.move();

    }
}