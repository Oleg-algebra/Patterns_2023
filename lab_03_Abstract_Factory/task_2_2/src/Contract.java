import java.util.ArrayList;

public class Contract {
    private ArrayList<TransportFactory> factories = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Tram> trams = new ArrayList<>();
    private ArrayList<Trolleybus> trolleybuses = new ArrayList<>();
    public Contract() {
        factories.add(new VolvoFactory());
        factories.add(new HyundaiFactory());
        factories.add(new SkodaFactory());
    }
    private double minContractValue = Double.MAX_VALUE;
    private TransportFactory the_cheapest_factory = null;
    public void finalizeContract(int busNumebr, int tramNumber, int trolleybusNumber,int kilometersNumber){
        for(TransportFactory factory : factories){

            for (int i = 0; i < busNumebr; i++) {
                Bus bus = factory.buildBus();
                buses.add(bus);
            }

            for (int i = 0; i < tramNumber; i++) {
                Tram tram = factory.buildTram();
                trams.add(tram);
            }

            for (int i = 0; i < trolleybusNumber; i++) {
                Trolleybus trolley = factory.buildTrolleybus();
                trolleybuses.add(trolley);
            }

            int finalCostContract = 0;
            for (Bus bus : buses) {
                finalCostContract += bus.getCost() + bus.getUsageCost() * kilometersNumber;
            }

            for (Tram tram : trams) {
                finalCostContract += tram.getCost() + tram.getUsageCost() * kilometersNumber;
            }

            for (Trolleybus trolleybus : trolleybuses) {
                finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * kilometersNumber;
            }
            buses.clear();
            trolleybuses.clear();
            trams.clear();
            if(finalCostContract < minContractValue){
                minContractValue = finalCostContract;
                the_cheapest_factory = factory;
            }
            System.out.println("Contract with factory "+factory.getFactoryName()+" costs: "+finalCostContract);
        }
        System.out.println("The cheapest contract:\n    factory: "
                +the_cheapest_factory.getFactoryName()+"\n    "+"cost: "+minContractValue);
    }
}
