
public class Main {
    public static void main(String[] args) {

        CoffeeCafe cafe = new CoffeeCafe();
        int hours = 6;

        System.out.println("Hello! Welcome to Coffee shop in ТРЦ MechMat Mall!!!");
        cafe.workSimulation(hours);
        System.out.println("Our income after "+ hours + " hours of work is "+cafe.getIncome());

    }
}
