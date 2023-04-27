public class PlayState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.printf("State: Play. Media player is playing track: %s.\n",mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.printf("State: Play --> Pause. Track: %s is paused.\n",mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PauseState());
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        int trackNum = mediaPlayer.getCurrentTrackNum() + 1;
        mediaPlayer.setTrackNum(trackNum);
        System.out.printf("State: Play. Switch to next track: %s.\n", mediaPlayer.getCurrentTrack());
        play(mediaPlayer);
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        int trackNum = mediaPlayer.getCurrentTrackNum() - 1;
        mediaPlayer.setTrackNum(trackNum);
        System.out.printf("State: Play. Switch to prev track: %s.\n",mediaPlayer.getCurrentTrack());
        play(mediaPlayer);
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("State: Play --> Stop.");
        mediaPlayer.setTrackNum(0);
        mediaPlayer.setState(new StopState());
    }
}
