package Classes;

public class Cat extends MilkPowered {

    public Cat(String color, byte mustasheQuantity) {
        System.out.println("Hi am cat -----");
        System.out.println("my color is " + color);
        System.out.println("and i have " + mustasheQuantity + " mustache");
    }

    @Override
    public String voice() {
        System.out.println("Me-e-e--o-o-ow");
        return "Me-e-e--o-o-ow";
    }
}//