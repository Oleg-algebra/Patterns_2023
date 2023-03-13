public class Chocolate extends Beverage {


    public Chocolate(int sugar, Filler filler, int volume, PackingType packingType) {
        super(sugar, filler, volume, packingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        System.out.println("Put some " + filler.getName()+ "....");
    }

    @Override
    public void drink() {
        System.out.println("Drinking:  cacao + " + this.filler.getName());
        System.out.println("Type order: "+packingType.getPackingType());
    }

    @Override
    public double cost() {

        return super.cost()+15;
    }
}
