import java.util.ArrayList;
import java.util.List;

/**
 * Реалізовує ітерації в ширину заданого дерева компонувальника
 */
public class WidthSearchIterator implements Iterator {
    private boolean isFinished = false;         // індикатор завершення обходу дерева
    private Box currentNode;

    private List<Box> parentsNodes = new ArrayList<>();
    private List<Box> childrenNodes = new ArrayList<>();
    private int currentIndex = 0;

    public WidthSearchIterator(Box root) {

        parentsNodes.add(root);
        currentNode =parentsNodes.get(0);

    }

    @Override
    public boolean hasNext() {
        return !isFinished;
    }

    /**
     * Алгоритм ітерації в ширину.
     * Обхід здійснюється по рівнях. Коли знаходимо коробку(перехід на інший рівень),
     * то додаємо її до childrenNodes. Коли parentsNodes порожні, то ми заміняємо їх childrenNodes і
     * продовжуємо обхід. Обхід закінчується коли списки parentsNodes та childrenNodes порожні одночасно,
     * тобто батьки закінчились, і нових дітей не додалось(ми опинились на останньому рівні).
     * По завершенню обходу дерева повертає null.
     * @return екземпляри класу Item.
     */
    @Override
    public Item next() {
//        System.out.println(parentsNodes);

        if(currentNode.hasChildren()){
            if(currentIndex < currentNode.getChildren().size()){
                Component component = currentNode.getChildren().get(currentIndex);
                currentIndex++;
                if(component instanceof Item){
                    return (Item) component;
                }else{
                    childrenNodes.add((Box) component);
                    return next();
                }
            }
        }
        if(!parentsNodes.isEmpty()){
            parentsNodes.remove(0);
            if(!parentsNodes.isEmpty()){
                currentNode = parentsNodes.get(0);
                currentIndex = 0;
                return next();
            }else {
                if(!childrenNodes.isEmpty()){
                    parentsNodes = new ArrayList<>(childrenNodes);
                    childrenNodes.clear();
                    currentNode = parentsNodes.get(0);
                    currentIndex = 0;
                    return  next();
                }else{
                    isFinished = true;
                    return null;
                }
            }
        }
        return null;

    }


}

