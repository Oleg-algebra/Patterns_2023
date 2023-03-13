public class Tee extends Beverage {


    public Tee(int sugar, Filler filler, int volume, PackingType packingType) {
        super(sugar, filler, volume, packingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        System.out.println("Put some " + filler.getName()+ "....");
    }

    @Override
    public void drink() {
        System.out.println("Drinking:  tea + " + this.filler.getName());
        System.out.println("Type order: "+packingType.getPackingType());
    }

    @Override
    public double cost() {
        return 7 + super.cost();
    }
}
