public class Wheel implements ClonableWheel{
    @Override
    public Wheel clone() {
        return new Wheel(this);
    }
    public Wheel(Wheel other){
        this.material = other.material;
        this.tire = other.tire;
        this.diameter = other.diameter;
    }
    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }
    public enum Tires{
        all_seasons,
        summer,
        winter,
        highway,
        all_terrain
    }
    private Material material;   // Матеріал диску
    private int diameter;                //  Діаметр колеса
    private Tires tire;

    public Wheel(Material material,
                 int diameter, Tires tire) {
        this.material = material;
        this.diameter = diameter;
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                ", tire=" + tire +
                '}';
    }

    public Wheel setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public Wheel setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public Wheel setTire(Tires tire) {
        this.tire = tire;
        return this;
    }
}
