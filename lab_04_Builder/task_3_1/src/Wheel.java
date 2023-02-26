public class Wheel {
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
    final private Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса
    final private Tires tire;

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

}
