package JavaForTesters;

public class ClassesAndObjects1 {
    public static class Lamp {

        Boolean isOn;
        String name;

        public Lamp(String name){
             this.name = name;
        }

        public void turnOn() {
            isOn = true;
            System.out.println(name +" light is On");
        }

        public void turnOff() {
            isOn = false;
            System.out.println(name+ " light is off");
        }

    }

    public static class Main{
        public static void main(String[] args) {
            Lamp led = new Lamp("led");
            Lamp Halogen = new Lamp("Halogen");

            led.turnOn();
            Halogen.turnOff();
            System.out.println();
            led.turnOff();
            led.turnOn();

        }

    }
}








