import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class AirportSimulator {
  private static final List<Plane> planes = new ArrayList<>();

  private final static Random random = new Random();
  private final static List<Plane> planesQueue = new ArrayList<>();
  public static void main(String[] args) {


    ControlRoom mediator = new ControlRoom();
    List<Runway> runways = new ArrayList<>();

    int N_iter = random.nextInt(20,40);
    int runaway_id=1;
    for(int i = 0; i<N_iter;i++){
      Plane plane = new Plane(random.nextInt(1000));
      plane.setMediator(mediator);
      planes.add(plane);
      if(i%5 == 0){
        Runway runway = new Runway(runaway_id++);
        runway.setWaiting_time(random.nextInt(5,15));
        runways.add(runway);
      }
    }
    mediator.setRunways(runways);
    System.out.println("Planes number: "+planes.size());
    System.out.println("Runaways number: "+runways.size());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Airport simulation ON... ");
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(AirportSimulator::simulate,0,1, TimeUnit.SECONDS);

  }
  private static void simulate(){
    Plane plane;
    if(!planesQueue.isEmpty()){
      plane = planesQueue.get(0);
      planesQueue.remove(plane);
    }else{
      plane = planes.get(random.nextInt(planes.size()));
    }

    if(plane.getIsInTheAir()){
      plane.land();
      if(plane.getIsInTheAir()){
        planesQueue.add(plane);
      }
    }else{
      plane.takeOff();
      if(!plane.getIsInTheAir()){
        planesQueue.add(plane);
      }
    }
  }
}
