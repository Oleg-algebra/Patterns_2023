public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car toyotaSedan = carFactory.buildToyota(Car.CarColor.Black, Car.Type.Sedan);
        System.out.println(toyotaSedan);

        Car porshe = carFactory.buildPorshe(Car.CarColor.Red, Car.Type.SUV);
        System.out.println(porshe);

        Car lamborghini = carFactory.buildLamorghini(Car.CarColor.Orange);
        System.out.println(lamborghini);
    }
}
