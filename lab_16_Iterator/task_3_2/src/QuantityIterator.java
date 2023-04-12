import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class QuantityIterator implements Iterator<ShopItem> {

    private final List<ShopItem> collection;
    int currentShopItem;

    public QuantityIterator(Shop shop) {
        this.collection = new ArrayList<>(shop.getItems().values()) ;
        collection.sort(Comparator.comparingInt(ShopItem::getQuantity).reversed());

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
