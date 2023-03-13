public class Coffee extends Beverage {


    public Coffee(int sugar, Filler filler, int volume, PackingType packingType) {
        super(sugar, filler, volume, packingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        System.out.println("Put some " + filler.getName()+ "....");
    }

    @Override
    public void drink() {
        System.out.println("Drinking:  coffee + " + this.filler.getName());
        System.out.println("Type order: "+packingType.getPackingType());
    }

    @Override
    public double cost() {
        return 10 + super.cost();
    }
}
