package JavaForTesters;

public class Rectangle {

    private double length;
    private double breadth;


    // This is a Constructor
    public Rectangle(){
        length = 0;
        breadth = 0;
    }

    // This is a Constructor
    public Rectangle(double length, double breadth){
        this.length = length;   // this can be done this way also or
        setBreadth(breadth);    // this way also
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setLength(double len){
        this.length = len;
    }

    public void setBreadth(double bread){
        this.breadth = bread;
    }

    public double calculateArea(){
        double Area = length*breadth;
        System.out.println("Area of the Rectangle is: "+Area);
        return Area;
    }

    public double calculatePerimeter(){
        double Perimeter = (2*length) + (2*breadth);
        System.out.println("Perimeter of the Rectangle is: "+Perimeter);
        return Perimeter;
    }


}
