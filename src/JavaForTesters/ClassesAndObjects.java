package JavaForTesters;

public class ClassesAndObjects {
    public static class Bike {
        int gear = 5;
        int cc = 150;

        int speed;

        public void Accelerate(int Accelerate){
            System.out.println("Bike is Accelerated to "+Accelerate+" Speed");
            speed = Accelerate;
        }

        public void Break(){
            System.out.println("Bike has been Stopped");
        }

    }

    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();

        System.out.println("Bike gear "+ bike1.gear);
        System.out.println("Bike cc "+bike1.cc);
        bike1.Accelerate(150);
        System.out.println(bike1.speed);

        System.out.println("Bike gear "+ bike2.gear);
        System.out.println("Bike cc "+bike2.cc);
        bike2.Accelerate(200);
        System.out.println(bike2.speed);

    }
}
