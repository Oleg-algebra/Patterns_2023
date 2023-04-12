import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AlphabeticIterator implements Iterator<ShopItem> {

    private final List<ShopItem> collection;
    int currentShopItem;
    public AlphabeticIterator(Shop shop) {
        this.collection = new ArrayList<>(shop.getItems().values());
        this.collection.sort(Comparator.comparing(ShopItem::getName,String.CASE_INSENSITIVE_ORDER));
        currentShopItem = 0;


    }

    @Override
    public boolean hasNext() {
        return currentShopItem < collection.size();
    }

    @Override
    public ShopItem next() {
        return collection.get(currentShopItem++);
    }
}
