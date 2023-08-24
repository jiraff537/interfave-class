package Classes;

import interfaces.JivMIR;

public class Snake implements JivMIR {
    @Override
    public String move() {
        System.out.println("Snake is POLZET");
        return "Snake is POLZET";
    }

    @Override
    public String voice() {
        System.out.println("SHHipit");
        return "SHHipit";
    }
}
