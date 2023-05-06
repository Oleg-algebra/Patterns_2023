import java.util.Random;

public class SecretAgent extends Spy {
    private final Random random = new Random();
    private final int probability_rate = 20;
    @Override
    public void visit(MilitaryBase base) {
        if(random.nextInt(probability_rate)>3) {

            System.out.printf("MISSION SUCCESS!!! Obtained secret information about: "+
                            "%s soldiers; "+
                            "%s officers; "+
                            "%s jeeps; "+
                            "%s tanks\n",
                    base.getSoldiers(), base.getOfficers(), base.getJeeps(), base.getTanks());
        }else{
            System.out.println("MISSION FAILURE!!! Secret agent was caught.");
        }
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        if(random.nextInt(probability_rate)>3) {
            int doc_number = Math.min(random.nextInt(200), generalStaff.getSecretPaper());
            System.out.printf("MISSION SUCCESS!!! Obtained secret information about: "+
                            "%s generals; "+
                            "%s secret documents\n",
                    generalStaff.getGenerals(),doc_number);
            int doc_left = generalStaff.getSecretPaper()-doc_number;
            generalStaff.setSecretPaper(doc_left);

        }else{
            System.out.println("MISSION FAILURE!!! Secret agent was caught.");
        }
    }
}
