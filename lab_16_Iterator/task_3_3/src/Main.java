import java.util.*;

public class Main {
    private static final Random random = new Random();
    private static List<Item> itemsComposite = new ArrayList<>();
    public static void main(String[] args) {

        test(1,true,4);
//        test(10_000,false,6);





    }

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
                System.out.println("Cheapest item: "+ itemsDepthSearch.get("min"));
                System.out.println("Luxury item: "+ itemsDepthSearch.get("max"));

                System.out.println("====width search=====");
                System.out.println("Cheapest item: "+ itemsWidthSearch.get("min"));
                System.out.println("Luxury item: "+ itemsWidthSearch.get("max"));

                System.out.println("=============Linear search=============");
                System.out.println("Cheapest item: "+itemsLinearSearch.get("min"));
                System.out.println("Luxury item: "+ itemsLinearSearch.get("max"));
                break;
            }
        }
    }
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

    private static Map<String,List<Item>> minMaxLinearSearch(){
        List<Item> minItems =new ArrayList<>();
        List<Item> maxItems = new ArrayList<>();

        int minValue = Integer.MAX_VALUE;
        int maxValue  = Integer.MIN_VALUE;
        for(Item item : itemsComposite){
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
        Map<String, List<Item>> items = new HashMap<>();
        if(!minItems.isEmpty()){
            items.put("min",minItems);
        }
        if(!maxItems.isEmpty()){
            items.put("max",maxItems);
        }
        return items;
    }
    private static Box generateTree(int level_number){
        Box root = new Box(""+-999);
        List<Component> currentLevelComponents = new ArrayList<>();
        int elementsNumber = random.nextInt(5,10);
        for(int i = 0; i<elementsNumber;i++){
            int type = random.nextInt(2);
            Component component;
            if(type == 0){
                component = new Item(1+"_"+(i+1),random.nextInt(1000));
                itemsComposite.add((Item) component);

            }else {
                component = new Box(1+"_"+(i+1));
            }
            component.setParent(root);
            root.add(component);
            currentLevelComponents.add(component);
        }
        generate(currentLevelComponents,level_number,1);
        return root;
    }
    private static void generate(List<Component> currentLevel, int max_level,int currentLevelNumber) {
        if (currentLevelNumber == max_level) {
//            int componentNumber = 1;
//            for (Component component : currentLevel) {
//                if (component instanceof Box) {
//                    int elementsNumber = random.nextInt(5, 10);
//                    for (int i = 0; i < elementsNumber; i++) {
//                        Component newItem = new Item((currentLevelNumber+1)+"_"+(componentNumber++), random.nextInt(1000));
//                        newItem.setParent((Box) component);
//                        ((Box) component).add(newItem);
//                    }
//                }
//            }
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
        generate(nextLevel,max_level,currentLevelNumber+1);
    }
}
