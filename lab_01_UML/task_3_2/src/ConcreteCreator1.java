public class ConcreteCreator1 extends Creator{

    public  Product createProduct(){
        System.out.println("I am ConcreteCreator1. I am create only product 1.");
        return new Product1();
    }
}
