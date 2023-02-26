public class WheelBuilder {
    private Wheel.Material material = Wheel.Material.Steel;   // Матеріал диску
    private int diameter = 14;
    private Wheel.Tires tire = Wheel.Tires.all_terrain;

    public WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public WheelBuilder setTire(Wheel.Tires tire) {
        this.tire = tire;
        return this;
    }

    public Wheel build(){
        return new Wheel(material,diameter,tire);
    }
}
