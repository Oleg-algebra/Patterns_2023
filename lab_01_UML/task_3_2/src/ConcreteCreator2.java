public class ConcreteCreator2 extends Creator{

    public Product createProduct() {
        System.out.println("I am ConcreteCreator2. I am create only product 2.");
        return new Product2();
    }
}
