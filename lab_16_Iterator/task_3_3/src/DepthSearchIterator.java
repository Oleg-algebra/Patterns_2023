import java.util.ArrayList;
import java.util.List;

/**
 * Ітератор реалізовує пошук в глибину для даного дерева компонувальника
 * List<Integer> indices : виконує функцію стека, зберігає індекси елементів на яких зупинились перед заглибленням,
 *                          останнім є індекс елемента на якому зупинились
 *                          на попередньому рівні перед тим як перейти на наступний рівень
 * List<Box> nodes : виконує функцію стека, зберігає вузли в яких ми заглиблювались,
 *                  останнім є вузол(коробка Box) в якому ми заглибились під час ітерації
 */
public class DepthSearchIterator implements Iterator {
    private boolean isFinished = false;         // індикатор завершення проходження дерева
    private Box root;
    private final List<Integer> indices = new ArrayList<>();
    private final List<Box> nodes = new ArrayList<>();
    private int currentIndex = 0;       // поточний індекс елемента

    public DepthSearchIterator(Box root) {
        this.root = root;

    }

    @Override
    public boolean hasNext() {
        return !isFinished;
    }

    /**
     * Алгоритм ітерації в глибину
     * Якщо натрапляє на Box в результаті ітерації, то відбувається рекурсивний виклик
     * методу next(), щоб заглибитись на наступний рівень.
     * Обхід завершується коли списки indices та nodes порожні, що означає ми пройшли всі елементи.
     * По завершенню обходу дерева повертає null.
     * @return екземпляри класу Item.
     */
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

