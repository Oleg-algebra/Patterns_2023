import java.util.Random;
/**
Збільшує кількість персоналу, техніки та секретних документів на військових об'єктах
 */
public class MilitaryHelper extends Spy {

    private final Random random = new Random();
    @Override
    public void visit(MilitaryBase base) {
        System.out.println("New staff & technique arrived to base!");
        base.setTanks(base.getTanks() + random.nextInt(5));
        base.setSoldiers(base.getSoldiers() + random.nextInt(50));
        base.setJeeps(base.getJeeps() + random.nextInt(20));
        base.setOfficers(base.getOfficers() + random.nextInt(15));
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.println("New generals & secret documents arrived to general staff!");
        generalStaff.setSecretPaper(generalStaff.getSecretPaper() + random.nextInt(10));
        generalStaff.setGenerals(generalStaff.getGenerals() + random.nextInt(5));
    }
}
