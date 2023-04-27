public class PauseState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayState());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("State -- Pause. State has not been changed.");
    }
}
