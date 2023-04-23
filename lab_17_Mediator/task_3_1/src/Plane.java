/**
 * Літак
 */
public class Plane {

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;

  /**
   * Злітно-посадкова смуга
   */
  private Mediator mediator;
  private Runway runway;

  public void setRunway(Runway runway) {
    this.runway = runway;
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public Plane(int id) {
    this.id = id;
    isInTheAir = false;

  }

  /**
   * Зліт літака
   */
  public void takeOff() {
    boolean permission = mediator.broadcast(this);
    if(permission) {
      isInTheAir = true;
      System.out.println("Plane " + id + " is taking off from runway "+runway.getRunaway_id()+"...");
      runway = null;

    }else{
      System.out.println("Plane " + id + " is waiting to take off...");
    }
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }
  public void land(){
      boolean permission = mediator.broadcast(this);
      if(permission) {
        isInTheAir = false;
        System.out.println("Plane " + id + " is landing on the runway "+runway.getRunaway_id()+"...");
        runway = null;
      }else{
        System.out.println("Plane " + id + " is waiting to land...");
      }
  }
}
