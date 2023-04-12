import java.util.HashMap;
import java.util.Iterator;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    HashMap<String, ShopItem> getItems() {
        return items;
    }
    private IteratorFactory iteratorFactory;

    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }
}
