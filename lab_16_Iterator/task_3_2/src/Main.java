public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pens", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);
    ShopItem bag = new ShopItem("bag", 100);
    ShopItem computer = new ShopItem("computer", 10);
    ShopItem mobile = new ShopItem("mobile", 20);
    ShopItem book = new ShopItem("Book",240);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);
    shop.putItem(bag);
    shop.putItem(computer);
    shop.putItem(mobile);
    shop.putItem(book);

    System.out.println("=====Iteration in alphabetic order=====");
    shop.setIteratorFactory(AlphabeticIterator::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println("\n=====Iteration by quantity in descending order=====");
    shop.setIteratorFactory(QuantityIterator::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

  }

}
