import java.util.Random;
public class Creator {

    public void someOperations(){
        System.out.println("Hello! Let's create something. ");
        Product p = createProduct();
        p.doSomething();
    }

    public Product createProduct(){
        System.out.println("I am create product 1 & product 2 randomly.");
        Random random = new Random();
        boolean b = random.nextBoolean();
        if (b){
            return new Product1();
        }else{
            return new Product2();
        }
        //return b ? new Product1() : new Product2();
    }
}
