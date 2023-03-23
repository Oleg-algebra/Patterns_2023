public class Wheel {
    public enum Material {
        Steel, //  стальний диск
        Alloy  //  легкосплавний
    }

    final private Material material;
    final private int diameter;

    public Wheel(int diameter, Material material) {
        System.out.println("Creating new Wheel");
        this.material = material;
        this.diameter = diameter;
    }


    public String getInfo() {
        return this+"{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}
