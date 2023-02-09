public class Wheel {

    private int radius;
    private String type;
    public Wheel(int radius, String type) {
        this.type = type;
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }
}
