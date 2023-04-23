

/**
 * Злітно-посадкова смуга
 */
public class Runway {

  public Runway(int runaway_id) {
    this.runaway_id = runaway_id;
  }

  public void setWaiting_time(int waiting_time) {
    this.waiting_time = waiting_time;
  }

  private int waiting_time = 5;
  final private int runaway_id;

  public int getRunaway_id() {
    return runaway_id;
  }

  /**
   * Чи вільна смуга
   */
  private long reservationTime;


  /**
   * Повертає значення чи вільна злітно-посадкова смуга
   * @return чи вільна злітно-посадкова смуга
   */
  public boolean getIsAvailable() {
    long time_passed =(System.currentTimeMillis()-reservationTime)/1000;
    if(time_passed>waiting_time){
      reservationTime = System.currentTimeMillis();
      return true;
    }else{
      return false;
    }
  }

}
