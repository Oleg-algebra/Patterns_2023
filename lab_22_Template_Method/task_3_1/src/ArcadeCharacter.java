public abstract class ArcadeCharacter {
    /**
     * Підняти зброю для захисту - оголити меч
     */
    public abstract void pickUpWeapon() ;

    /**
     * Захист
     */
    public abstract void defenseAction();

    /**
     * Повернення героя в безпечне місце
     */
    public abstract void moveToSafety();
    protected abstract void hook();

    /**
     * Стратегія захисту та відступу
     */
    public final void defendAgainstAttack() {
        hook();
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
