public class Radio implements Device {

    private int volume;
    private int radioFrequency;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 50;
        this.radioFrequency = 0;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Radio volume = " + volume);
        }


    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Radio volume = " + volume);
        }

    }

    @Override
    public void nextChanel() {
        if (isOn) {
            radioFrequency++;
            System.out.println("Radio frequency = " + radioFrequency);
        }

    }

    @Override
    public void prevChanel() {
        if (isOn) {
            radioFrequency--;
            System.out.println("Radio frequency = " + radioFrequency);
        }

    }
}
