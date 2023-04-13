import java.util.ArrayList;
import java.util.List;

public class DepthSearchIterator implements Iterator {
    private boolean isFinished = false;
    private Box root;
    private List<Integer> indices = new ArrayList<>();
    private List<Box> nodes = new ArrayList<>();
    private int currentIndex = 0;

    public DepthSearchIterator(Box root) {
        this.root = root;

    }

    @Override
    public boolean hasNext() {
        return !isFinished;
    }

    @Override
    public Item next() {
        if(root.hasChildren()){
            if(currentIndex<root.getChildren().size()){
                Component component = root.getChildren().get(currentIndex);
                currentIndex ++;
                if(component instanceof Item){
                    return (Item) component;
                }else{
                    nodes.add(root);
                    indices.add(currentIndex);
                    currentIndex = 0;
                    root = (Box) component;
                    return next();
                }
            }
        }
        if(!nodes.isEmpty() && !indices.isEmpty()){
            root = nodes.get(nodes.size()-1);
            currentIndex = indices.get(indices.size()-1);
            nodes.remove(nodes.size()-1);
            indices.remove(indices.size()-1);
            return next();
        }
        isFinished = true;
        return null;
    }


}

