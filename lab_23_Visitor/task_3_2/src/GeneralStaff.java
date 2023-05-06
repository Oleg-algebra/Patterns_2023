public class GeneralStaff extends MilitaryObject {

    /**
     * Кількість генералів на військовій базі
     */
    private int generals;

    /**
     * Кількість секретних паперів на військовій базі
     */
    private int secretPaper;

    public GeneralStaff(int generals, int secretPaper) {
        this.generals = generals;
        this.secretPaper = secretPaper;
    }

    public int getGenerals() {
        return generals;
    }

    public void setGenerals(int generals) {
        this.generals = Math.max(generals,0);
    }

    public int getSecretPaper() {
        return secretPaper;
    }

    public void setSecretPaper(int secretPaper) {
        this.secretPaper = Math.max(secretPaper,0);
    }

    @Override
    public boolean isMilitaryCapable() {

        return generals>0;
    }

    @Override
    public void accept(Spy spy) {
        spy.visit(this);
    }

    @Override
    public String toString() {
        return "GeneralStaff{" +
                "generals=" + generals +
                ", secretPaper=" + secretPaper +
                '}';
    }
}
