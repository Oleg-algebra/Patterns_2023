import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    public Box(String id) {
        this.id = id;
    }

    private final String id;
    private Box parent;

    public Box getParent() {
        return parent;
    }

    public void setParent(Box parent) {
        this.parent = parent;
    }

    private final List<Component> children
            = new ArrayList<>();

    public void add(Component child){
        children.add(child);
    }

    public void remove(Component child){
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }
    private IteratorFactory iteratorFactory;

    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }
    public Iterator iterator(){
        assert iteratorFactory!=null;
        return iteratorFactory.createIterator(this);
    }

    @Override
    public void execute() {
        if(!children.isEmpty()){
            System.out.println("Box: " + id);
            System.out.println("Children:\n"+children);
        }

        for (Component child : children) {
            child.execute();
        }

    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean hasChildren() {
        return !children.isEmpty();
    }
}
