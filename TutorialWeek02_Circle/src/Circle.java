public class Circle {

    private int radius = 1;
    private String colour  =  "blue";

    public Circle(){

        radius = 1;
        colour = "Blue";
    }

    public Circle (int radius){
        this.radius = radius;
        colour = "Blue";

    }

    public Circle(int radius, String colour){
        this.colour = colour;
        this.radius = radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    @Override
    public String toString() {
        return "The circle has radius of " + radius + " and area of " + getArea() +" and is a "+colour+" Circle";
    }


}

