public class Television implements Device {

    private int volume;
    private int chanel;
    private boolean isOn;

    public Television() {
        this.isOn = false;
        this.volume = 50;
        this.chanel = 1;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Television is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Television is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Tv volume = " + volume);
        }

    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Tv volume = " + volume);
        }

    }

    @Override
    public void nextChanel() {
        if (isOn) {
            chanel++;
            System.out.println("Tv chanel = " + chanel);
        }

    }

    @Override
    public void prevChanel() {
        if (isOn) {
            chanel--;
            System.out.println("Tv chanel = " + chanel);
        }

    }
}
