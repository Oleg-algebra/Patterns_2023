public class PauseState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.printf("State: Pause --> Play. Track %s is being played.\n",mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.printf("State: Pause. Current track: %s\n",
                mediaPlayer.getCurrentTrack());
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        int trackNum = mediaPlayer.getCurrentTrackNum() + 1;
        mediaPlayer.setTrackNum(trackNum);
        System.out.printf("State: Pause. Switch to next track: %s\n", mediaPlayer.getCurrentTrack());
        play(mediaPlayer);
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        int trackNum = mediaPlayer.getCurrentTrackNum() - 1;
        mediaPlayer.setTrackNum(trackNum);
        System.out.printf("State: Pause. Switch to prev track: %s\n", mediaPlayer.getCurrentTrack());
        play(mediaPlayer);
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("State: Pause --> Stop.");
        mediaPlayer.setTrackNum(0);
        mediaPlayer.setState(new StopState());
    }
}
