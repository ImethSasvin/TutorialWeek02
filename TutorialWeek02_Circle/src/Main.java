public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle();

        Circle circle2 =  new Circle(8);

        Circle circle3 = new Circle(4,"Red");

        // invoke public methods
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " +
                circle1.getArea()+" and is a "+circle2.getColour()+" Circle");
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea()+" and is a "+circle2.getColour()+" Circle");
        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
                circle3.getArea()+" and is a "+circle3.getColour()+" Circle");

        circle3.setColour("white");
        System.out.println("Colour setted for circle 3");

        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
                circle3.getArea()+" and is a "+circle3.getColour()+" Circle");


        System.out.println("____________________________________");
        System.out.println("Testing To string");

        System.out.println(circle3);


    }
}