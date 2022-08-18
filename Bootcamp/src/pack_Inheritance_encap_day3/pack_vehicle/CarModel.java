package pack_Inheritance_encap_day3.pack_vehicle;

public class CarModel extends Car {
    private float tank_capacity;
    private int seating_capacity;
    private float speed;
    private String hand_gear;
    private String steer_direction;

    public CarModel(String color, float weight, String engine_count, String car_type, String door_count, float tank_capacity, int seating_capacity, float speed, String hand_gear, String steer_direction) {
        super(color, weight, engine_count, car_type, door_count);
        this.tank_capacity = tank_capacity;
        this.seating_capacity = seating_capacity;
        this.speed = speed;
        this.hand_gear = hand_gear;
        this.steer_direction = steer_direction;
    }

    public float getTank_capacity() {
        return tank_capacity;
    }

    public int getSeating_capacity() {
        return seating_capacity;
    }

    public float getSpeed() {
        return speed;
    }

    public String getHand_gear() {
        return hand_gear;
    }

    public String getSteer_direction() {
        return steer_direction;
    }

    public void setTank_capacity(float tank_capacity) {
        this.tank_capacity = tank_capacity;
    }

    public void setSeating_capacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setHand_gear(String hand_gear) {
        this.hand_gear = hand_gear;
    }

    public void setSteer_direction(String steer_direction) {
        this.steer_direction = steer_direction;
    }

    public void increaseSpeed(int inc) {
        speed += inc;
    }

    public void decreaseSpeed(int decre) {
        speed -= decre;
    }

    public void changeGear(String gear) {
        hand_gear=gear;
    }

    public void handleSteering(String direction) {
        steer_direction=direction;
    }
}





