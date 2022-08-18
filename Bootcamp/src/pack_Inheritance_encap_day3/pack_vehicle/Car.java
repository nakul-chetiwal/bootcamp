package pack_Inheritance_encap_day3.pack_vehicle;

public class Car extends Vehicle{
    private String car_type;
     private String door_count;

    public Car(String color, float weight, String engine_count, String car_type, String door_count) {
        super(color, weight, engine_count);
        this.car_type = car_type;
        this.door_count = door_count;
    }

    public String getCar_type() {
        return car_type;
    }

    public String getDoor_count() {
        return door_count;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public void setDoor_count(String door_count) {
        this.door_count = door_count;
    }
}
