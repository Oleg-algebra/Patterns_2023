public abstract class Tram {
    protected Tram(int cost, int usageCost, String mark) {
        this.cost = cost;
        this.usageCost = usageCost;
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public abstract void goByRails();

    private final int cost;       // Вартість одиниці транспорту
    private final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу
    private final String mark;
}
