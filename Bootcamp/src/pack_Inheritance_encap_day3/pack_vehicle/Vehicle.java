package pack_Inheritance_encap_day3.pack_vehicle;

public class Vehicle {
    private String color;
    private float weight;
    private String engine_count;


    public Vehicle(String color, float weight, String engine_count) {
        this.color = color;
        this.weight = weight;
        this.engine_count = engine_count;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public String getEngine_count() {
        return engine_count;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setEngine_count(String engine_count) {
        this.engine_count = engine_count;
    }

}
