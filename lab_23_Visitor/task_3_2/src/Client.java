import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Client {
    private static final List<MilitaryObject> militaryObjects = new ArrayList<>();
    private static final Random random = new Random();
    private final static ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {

        militaryObjects.add(new GeneralStaff(20, 1000));
        militaryObjects.add(new MilitaryBase(50, 2000, 500, 200));


        executor.scheduleAtFixedRate(Client::simulation,0,1, TimeUnit.SECONDS);
    }
    private static boolean isMilitaryCapable(){
        for (MilitaryObject militaryObject : militaryObjects) {
            if(militaryObject.isMilitaryCapable()){
                return true;
            }
        }
        return false;

    }
    private static void simulation(){
        if(isMilitaryCapable()){
            for (MilitaryObject militaryObject : militaryObjects) {
                if(random.nextInt(10)<3){
                    militaryObject.accept(new SecretAgent());
                }else{
                    militaryObject.accept(new Saboteur());
                }
//                militaryObject.accept(new MilitaryHelper());  // з цим рядком симуляція дуже довга виходить
            }
        }else{
            /*
            Симуляція закінчується коли знищено весь особовий склад на усіх військових об'єктах.
             */
            System.out.println("ALL MILITARY OBJECTS ARE DESTROYED!!!");
            executor.shutdown();
        }
    }

}
