public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
//        Car toyotaSedan = carFactory.buildToyota(Car.CarColor.Black, Car.Type.Sedan);
//        System.out.println(toyotaSedan);
//
//        Car porshe = carFactory.buildPorshe(Car.CarColor.Red, Car.Type.SUV);
//        System.out.println(porshe);

        System.out.println("==========Before test==========");
        Car lamborghini = carFactory.buildLamorghini(Car.CarColor.Orange);
        System.out.println("=====Original=====");
        System.out.println(lamborghini);

        System.out.println("=====Copy=====");
        Car lamboCopy = lamborghini.clone();
        System.out.println(lamboCopy);

        // change wheels configuration in original lamborghini
        lamborghini.getWheel().setDiameter(10);
        lamborghini.getWheel().setMaterial(Wheel.Material.Alloy);
        lamborghini.getWheel().setTire(Wheel.Tires.all_terrain);

        System.out.println("==========after test==========");
        System.out.println("=====Original=====");
        System.out.println(lamborghini);
        System.out.println("=====Copy=====");
        System.out.println(lamboCopy);

    }
}
