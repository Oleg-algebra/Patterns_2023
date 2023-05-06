import java.util.Random;

public class Saboteur extends Spy {
    private final Random random = new Random();
    private final int probability_rate = 20;
    @Override
    public void visit(MilitaryBase base) {
        if(random.nextInt(probability_rate)>3){
            int soldiers_number = Math.min(random.nextInt(200,1000), base.getSoldiers());
            int officers_number = Math.min(random.nextInt(50,70), base.getOfficers());
            int jeeps_number = Math.min(random.nextInt(50,70), base.getJeeps());
            int tanks_number = Math.min(random.nextInt(20,50), base.getTanks());
            System.out.printf("MISSION SUCCESS!!! Was destroyed or killed: "+
                            "%s soldiers; "+
                            "%s officers; "+
                            "%s jeeps; "+
                            "%s tanks\n",+
                    soldiers_number,officers_number, jeeps_number ,tanks_number );

            base.setOfficers(base.getOfficers() - officers_number);
            base.setSoldiers(base.getSoldiers() - soldiers_number);
            base.setJeeps(base.getJeeps() - jeeps_number);
            base.setTanks(base.getTanks() - tanks_number);
        }else{
            System.out.println("MISSION FAILURE!!! Saboteur was caught.");
        }
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        if(random.nextInt(probability_rate)>3){
            int generals_number = Math.min(random.nextInt(10,20), generalStaff.getGenerals());
            int documents_number = Math.min(random.nextInt(100,300),generalStaff.getSecretPaper());
            System.out.printf("MISSION SUCCESS!!! Was destroyed or killed: "+
                            "%s generals; "+
                            "%s secret documents\n",
                    generals_number,documents_number);

            generalStaff.setGenerals(generalStaff.getGenerals() - generals_number);
            generalStaff.setSecretPaper(generalStaff.getSecretPaper() - documents_number);
        }else{
            System.out.println("MISSION FAILURE!!! Saboteur was caught.");
        }
    }
}
