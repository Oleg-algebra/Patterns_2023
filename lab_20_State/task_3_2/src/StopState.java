public class StopState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.printf("State: Stop --> Play. Track %s is being played\n", mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayState());

    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("State: Stop. Action -- pause. No changes.");
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        System.out.println("State: Stop. Action -- next. No changes.");
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        System.out.println("State: Stop. Action -- previous. No changes.");
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("State: Stop. Action -- stop. No changes.");
    }
}
