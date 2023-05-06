/**
 * Пірат
 */
public class Pirate extends ArcadeCharacter {

  /**
   * Підняти зброю для захисту - оголити меч
   */
  @Override
  public void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  /**
   * Захист
   */
  @Override
  public void defenseAction() {
    System.out.println("Defend with sword");
  }

  /**
   * Повернення героя в безпечне місце
   */
  @Override
  public void moveToSafety() {
    System.out.println("Return to the ship");
  }

  @Override
  protected void hook() {
    System.out.println("Pirate Defense:");
  }


}
