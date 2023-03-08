public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            CarFactorySingleton carFactorySingleton = CarFactorySingleton.getInstance();
            carFactorySingleton.show();

            Car toyotaSedan = carFactorySingleton.buildToyotaSedan(Car.CarColor.Black);
            System.out.println(toyotaSedan);
        });

        Thread thread2 = new Thread(() -> {
            CarFactorySingleton carFactorySingleton = CarFactorySingleton.getInstance();
            carFactorySingleton.show();

            Car lamborghini = carFactorySingleton.buildLamorghiniSport(Car.CarColor.Orange);
            System.out.println(lamborghini);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
