import java.util.Iterator;

public interface IteratorFactory {
    Iterator<ShopItem> createIterator(Shop shop);
}
