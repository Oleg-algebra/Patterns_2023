public class Cafe {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new Sugar(espresso);
        espresso = new Sugar(espresso);
        System.out.println(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new SourCream(darkRoast);
        darkRoast = new Sugar(darkRoast);
        darkRoast = new Sugar(darkRoast);
        System.out.println(darkRoast);

        Beverage darkRoast1 = new DarkRoast();
        darkRoast1 = new Cream(darkRoast1);
        darkRoast1 = new Sugar(darkRoast1);
        System.out.println(darkRoast1);

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Sugar(decaf);
        decaf = new Sugar(decaf);
        System.out.println(decaf);
    }
}
