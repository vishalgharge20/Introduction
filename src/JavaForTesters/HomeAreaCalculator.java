package JavaForTesters;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        System.out.println("Room 1");

        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        System.out.println("Lenght: "+room1.getLength());
        room1.setBreadth(50);
        System.out.println("Breadth: "+room1.getBreadth());
        room1.calculateArea();
        room1.calculatePerimeter();

        System.out.println("Room 2");

        Rectangle room2 = new Rectangle(20,10);
        room2.calculateArea();
        room2.calculatePerimeter();


    }

}