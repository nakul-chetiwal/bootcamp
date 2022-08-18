package pack_Inheritance_encap_day3.pack_vehicle;

public class Main {
    public static void main(String[] args) {

CarModel cm=new CarModel("red",90,"2","Electic", "4",24,6,45,"Drive","right");
        System.out.println(cm.getSpeed());
        System.out.println(cm.getSteer_direction());
        System.out.println(cm.getHand_gear());
        cm.decreaseSpeed(2);
        cm.increaseSpeed(4);
        cm.changeGear("Neutral");
        cm.handleSteering("left");
        System.out.println("After changing speed, gear and steering direction");
        System.out.println(cm.getSpeed());
        System.out.println(cm.getSteer_direction());
        System.out.println(cm.getHand_gear());
    }
}
