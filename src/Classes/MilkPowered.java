package Classes;

import interfaces.JivMIR;

public abstract class MilkPowered implements JivMIR {

    @Override
    public String move() {
        System.out.println("I am going to be going");
        return "I am going to be going";
    }

}//
