public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        //declare an instance of Circle class called circle2
        // invoke the second constructor
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(9,"white");



        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " +
                circle1.gerArea());
        // invoke public methods
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.gerArea());
        circle1.setRadius(10);

        System.out.println(circle1.getRadius());


        System.out.println(circle1.getColour());
        System.out.println(circle2.getColour());
        System.out.println(circle3.getColour());

    }
}