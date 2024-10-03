public class Circle {


    // private instance variables, not accessible from outside the class
    private double radius;
    private String colour;

    // default constructor with no arguments
    Circle(){
        radius = 1;
        colour = "Blue";
    }


    public Circle(double radius, String colour){
        this.radius =radius;
        this.colour =colour;
    }

    Circle(double radius){
        this.radius =  radius;
        colour = "Blue";
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColour(){
        return colour;
    }


    public double gerArea(){
        return radius*radius*Math.PI;
    }
}
