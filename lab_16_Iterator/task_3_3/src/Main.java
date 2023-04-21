import java.util.*;

public class Main {
    private static final Random random = new Random();
    private static List<Item> itemsComposite = new ArrayList<>();
    public static void main(String[] args) {

        test(1,true,6);
//        test(10_000,false,6);

    }

    /**Проводить тест трьох варіантів пошуку: пошук в глибину, ширину та лінійний пошук(що здійснюється пробіганням
     *  по itemsComposite, де зберігаються всі об'єкти Item, що були додані в дерево при його створенні).
     *  Після завершення пошуку порівняються множини знайдених елементів між собою(чи однакові вони) і як особливий випадок
     *  виводиться інформація, коли елементів не знайдено, тобто дерево складається лише з коробок.
     *  Якщо множини елементів, після завершення пошуку різні, то цикл переривається і виводиться результат пошуку,
     *  інакше виводиться лише повідомлення "ОК", якщо параметр show == false.
     *
     * @param iter_max          максимальна кількість ітерацій
     * @param show              флажок(індикатор) чи треба показувати результати пошуку після кожної ітерації
     * @param max_level_depth   максимальна глибина для дерева компонувальника
     */


    private static void test(int iter_max, boolean show, int max_level_depth){
        boolean show_failure = false;
        for(int i = 0; i<iter_max; i++){
            int levelNumber = random.nextInt(1,max_level_depth);
            Box root1 = generateTree(levelNumber);
            root1.setIteratorFactory(DepthSearchIterator::new);
            Map<String,List<Item>> itemsDepthSearch = minMaxCustomSearch(root1);

            root1.setIteratorFactory(WidthSearchIterator::new);
            Map<String,List<Item>> itemsWidthSearch = minMaxCustomSearch(root1);

            Map<String,List<Item>> itemsLinearSearch = minMaxLinearSearch();
            if(itemsDepthSearch.isEmpty() || itemsLinearSearch.isEmpty() || itemsWidthSearch.isEmpty()){
                root1.execute();
                System.out.println("Composite contains only boxes");
                System.out.println("Depth search result: "+itemsDepthSearch);
                System.out.println("Linear search result: "+ itemsLinearSearch);
                System.out.println("Width search result: "+itemsWidthSearch);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                continue;
            }
            itemsComposite.clear();
            if(!new HashSet<>(itemsDepthSearch.get("min")).containsAll(itemsLinearSearch.get("min")) ||
                    !new HashSet<>(itemsDepthSearch.get("max")).containsAll(itemsLinearSearch.get("max"))||
                    !new HashSet<>(itemsWidthSearch.get("min")).containsAll(itemsLinearSearch.get("min"))||
                    !new HashSet<>(itemsWidthSearch.get("max")).containsAll(itemsLinearSearch.get("max"))){

                show_failure = true;

            }else{
                System.out.println("OK");
            }
            if(show || show_failure){
                root1.execute();
                System.out.println("====depth search=====");
                System.out.println("Cheapest items: "+ itemsDepthSearch.get("min"));
                System.out.println("Luxury items: "+ itemsDepthSearch.get("max"));

                System.out.println("====width search=====");
                System.out.println("Cheapest items: "+ itemsWidthSearch.get("min"));
                System.out.println("Luxury items: "+ itemsWidthSearch.get("max"));

                System.out.println("=============Linear search=============");
                System.out.println("Cheapest items: "+itemsLinearSearch.get("min"));
                System.out.println("Luxury items: "+ itemsLinearSearch.get("max"));
                break;
            }
        }
    }

    /**Проводить алгоритм пошуку найдешевшої та найдорожчої речі Item відповідно до встановленого ітератора:
     * Пошук в глибину чи в ширину
     *
     * @param root  корінь дерева компонувальника
     * @return HashMap з ключами min та max, та значеннями -- списики найдешевших та найдорожчих речей відповідно.
     */
    private static Map<String,List<Item>> minMaxCustomSearch(Box root){
        List<Item> minItems =new ArrayList<>();
        List<Item> maxItems = new ArrayList<>();
        int minValue = Integer.MAX_VALUE;
        int maxValue  = Integer.MIN_VALUE;

        Iterator iterator = root.iterator();

        while(iterator.hasNext()){
            Item item = iterator.next();
            if(item != null) {
                int value = item.getValue();
                if(value > maxValue){
                    maxValue = value;
                    maxItems.clear();
                    maxItems.add(item);
                } else if (value == maxValue) {
                    maxItems.add(item);
                }
                if(value<minValue){
                    minValue = value;
                    minItems.clear();
                    minItems.add(item);
                } else if (value == minValue) {
                    minItems.add(item);
                }
            }
        }
        Map<String, List<Item>> items = new HashMap<>();
        if(!minItems.isEmpty()){
            items.put("min",minItems);
        }
        if(!maxItems.isEmpty()){
            items.put("max",maxItems);
        }

        return items;
    }

    /** Проводить ітерацію по itemsComposite, списку речей, що входять до дерева компонувальника і шукає найдевші та
     * найдорожчі речі.
     *
     * @return @return HashMap з ключами min та max, та значеннями -- списики найдешевших та найдорожчих речей відповідно.
     */
    private static Map<String,List<Item>> minMaxLinearSearch(){
        Map<String, List<Item>> items = new HashMap<>();
        if(itemsComposite.isEmpty()){
            return items;
        }

        List<Item> minItems =new ArrayList<>();
        List<Item> maxItems = new ArrayList<>();
        itemsComposite.sort(Comparator.comparing(Item::getValue));

        int minValue = itemsComposite.get(0).getValue();
        int maxValue  = itemsComposite.get(itemsComposite.size()-1).getValue();
        for(int i = 0; i< itemsComposite.size();i++){
            Item item1 = itemsComposite.get(i);
            Item item2 = itemsComposite.get(itemsComposite.size()-1-i);
            boolean flag1 = true;
            boolean flag2 = true;
            if(item1.getValue() == minValue){
                minItems.add(item1);
                flag1 = false;
            }
            if (item2.getValue() == maxValue) {
                maxItems.add(item2);
                flag2 = false;
            }
            if(flag1 && flag2){
                break;
            }
        }

        if(!minItems.isEmpty()){
            items.put("min",minItems);
        }
        if(!maxItems.isEmpty()){
            items.put("max",maxItems);
        }
        return items;
    }

    /** Ініціалізує генерацію дерева компонувальника. Дерево має вигляд:
     *                         Box(-999)        -- корінь дерева.
     *                  /         |          \
     *             Item(1_1)   Item(1_2)     Box(1_3)
     *                                        /         \
     *                                      Box(2_1)  Item(2_2)
     * Нащадків мають лише коробки Box. Елементи дерева мають назви N_M(рядки),
     * N - номер рівня,на якому знаходиться компонента;
     * M - номер компоненти на поточному рівні. Компоненти на окремому рівні мають послідовну нумерацію,
     * не зважаючи на їх клас( Box чи Item).
     * @param level_number  глибина дерева компонувальника
     * @return  root корінь дерева компонувальника
     */
    private static Box generateTree(int level_number){

        Box root = new Box(""+-999);
        List<Component> currentLevelComponents = new ArrayList<>();

        currentLevelComponents.add(root);
        generateNextLevel(currentLevelComponents,level_number,0);
        return root;
    }

    /**Рекурсивно генерує рівні дерева компонувальника до потрібної глибини.
     *
     * @param currentLevel          поточний згенерований рівень дерева компонувальника
     * @param max_level             максимальна глибина дерева
     * @param currentLevelNumber    поточний номер згенерованого рівня дерева
     */
    private static void generateNextLevel(List<Component> currentLevel, int max_level, int currentLevelNumber) {
        if (currentLevelNumber == max_level) {
            return;
        }
        List<Component> nextLevel = new ArrayList<>();
        int componentNumber = 1;
        for (Component component : currentLevel) {
            if (component instanceof Box) {
                int elementsNumber = random.nextInt(5, 10);
                for (int i = 0; i < elementsNumber; i++) {
                    int type = random.nextInt(2);
                    Component newComponent;
                    if (type == 0) {
                        newComponent = new Item((currentLevelNumber+1)+"_"+(componentNumber++), random.nextInt(1000));
                        itemsComposite.add((Item) newComponent);
                    } else {
                        newComponent = new Box((currentLevelNumber+1)+"_"+(componentNumber++));
                    }
                    newComponent.setParent((Box) component);
                    ((Box) component).add(newComponent);
                    nextLevel.add(newComponent);
                }
            }
        }
        generateNextLevel(nextLevel,max_level,currentLevelNumber+1);
    }
}
