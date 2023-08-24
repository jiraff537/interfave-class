package Classes;

import interfaces.JivMIR;

public class Snake implements JivMIR {

    public Snake(String color, int length) {
        System.out.println("I'm big Snake! -----");
        System.out.println("My color is " + color);
        System.out.println("I am " + length + " lenght");
    }

    @Override
    public String move() {
        System.out.println("Snake is POLZET");
        return "Snake is POLZET";
    }

    @Override
    public String voice() {
        System.out.println("Shhhhhhh");
        return "Shhhhhhh";
    }
}
