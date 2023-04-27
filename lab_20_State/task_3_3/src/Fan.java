public class Fan {

  private FanState state = new LowFanState();

  public void setState(FanState state) {
    this.state = state;
  }

  public FanState getState() {
    return state;
  }

  public void turnUp() {
    state.turnUp(this);
  }

  public void turnDown() {
    state.turnDown(this);
  }

}
