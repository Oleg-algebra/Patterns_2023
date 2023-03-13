public abstract class Beverage {

    protected final int sugar;
    protected final Filler filler;
    protected final double volume;
    protected final PackingType packingType;


    public Beverage(int sugar , Filler filler, int volume, PackingType packingType) {
        this.sugar = sugar;
        this.filler = filler;
        this.volume = volume;
        this.packingType = packingType;
    }

    public abstract void prepare();
    public abstract void drink();
    public double cost(){
        return filler.getPrice()*volume;
    };
}
