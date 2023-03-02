public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car toyotaSedan = carFactory.buildToyotaSedan(Car.CarColor.Black);
        System.out.println(toyotaSedan);

        Car porshe = carFactory.buildPorsheSUV(Car.CarColor.Red);
        System.out.println(porshe);

        Car lamborghini = carFactory.buildLamorghini(Car.CarColor.Orange);
        System.out.println(lamborghini);
    }
}
