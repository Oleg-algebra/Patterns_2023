public class Cafe {


    public static void main(String[] args) {
        Tee tea1 = new Tee(3, new Water(), 200,new AtRestaurant());
        Coffee coffee1 = new Coffee(3,new Milk(), 300, new ForTakeout());
        Chocolate chocolate1 = new Chocolate(3, new Milk() , 400, new ForTakeout());

        beverageInfo(tea1);
        beverageInfo(coffee1);
        beverageInfo(chocolate1);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
