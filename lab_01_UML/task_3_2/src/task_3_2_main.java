public class task_3_2_main {
    public static void main(String[] args) {

        System.out.println("Hello everybody! Now we create something cool & funny)))");
        Creator creator = new Creator();
        creator.someOperations();

        System.out.println();
        ConcreteCreator1 concreteCreator1 = new ConcreteCreator1();
        concreteCreator1.someOperations();

        System.out.println();
        ConcreteCreator2 concreteCreator2 = new ConcreteCreator2();
        concreteCreator2.someOperations();
    }
}
