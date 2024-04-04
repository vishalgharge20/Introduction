package JavaForTesters;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculate = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculate.getRoom();
        Rectangle room2 = calculate.getRoom();
        double area = calculate.TotalArea(room1,room2);


    }

    public Rectangle getRoom (){
        System.out.println("Enter Length of the room");
        double len = scanner.nextDouble();
        System.out.println("Enter Width of the room");
        double width = scanner.nextDouble();

        Rectangle room = new Rectangle(len,width);
        return room;
    }

    public double TotalArea(Rectangle room1, Rectangle room2){
        double totalarea = room1.calculateArea()+room2.calculateArea();
        System.out.println("Total Area: "+totalarea);
        return totalarea;

    }




}
