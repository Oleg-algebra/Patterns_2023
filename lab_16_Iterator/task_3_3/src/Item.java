public class Item implements Component {

    private final String name;
    private final int value;
    private Box parent;

    public Box getParent() {
        return parent;
    }

    public void setParent(Box parent) {
        this.parent = parent;
    }

    public Item(String name, int value) {

        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void execute() {
//        System.out.println(this);
//        return;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }
}
